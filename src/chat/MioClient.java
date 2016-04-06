package chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Arena, programmazione - Lazzarotto, programmazione - Solito, grafica
 */
public class MioClient {
    
    Socket socket;
    JFrameChat frame;
    
    public MioClient(JFrameChat frame, String indirizzo, int porta, String nomeUtente){
        this.frame = frame;
        try{
            System.out.println("Opening connection…");
            socket = new Socket (indirizzo, porta);
            this.scrivi(nomeUtente);
        }
        catch (ConnectException e){
            System.out.println("Connection error.");
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
    public void avvia(){
        LeggiThread leggi = new LeggiThread(frame, socket);
        Thread t = new Thread(leggi);
        t.start();
    }
    
    public boolean scrivi(String msg){
        boolean r = true;
        try{
            PrintStream writer = new PrintStream(socket.getOutputStream());
            writer.println(msg);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Error! No Server found!");
            r = false;
        }
        return r;
    }
    
}

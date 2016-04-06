package chat;

import javax.swing.JOptionPane;

/**
 *
 * @author Arena, programmazione - Lazzarotto, programmazione - Solito, grafica
 */
public class JFrameLogIn extends javax.swing.JFrame {
    
    private String nomeUtente;
    private String porta;
    private String IP;

    public JFrameLogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogIn = new javax.swing.JPanel();
        jLabelLogIn = new javax.swing.JLabel();
        jTextNomeUtente = new javax.swing.JTextField();
        jLabelNomeUtente = new javax.swing.JLabel();
        jLabelPorta = new javax.swing.JLabel();
        jTextPorta = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();
        jLabelIP = new javax.swing.JLabel();
        jTextIP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelLogIn.setBackground(new java.awt.Color(0, 0, 153));

        jLabelLogIn.setFont(new java.awt.Font("Traditional Arabic", 3, 36)); // NOI18N
        jLabelLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogIn.setText("Login ");

        jLabelNomeUtente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeUtente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeUtente.setText("Username");

        jLabelPorta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPorta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPorta.setText("Port:");

        jButtonOK.setBackground(new java.awt.Color(0, 51, 255));
        jButtonOK.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonAnnulla.setBackground(new java.awt.Color(0, 51, 255));
        jButtonAnnulla.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jLabelIP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelIP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIP.setText("IP address:");

        javax.swing.GroupLayout jPanelLogInLayout = new javax.swing.GroupLayout(jPanelLogIn);
        jPanelLogIn.setLayout(jPanelLogInLayout);
        jPanelLogInLayout.setHorizontalGroup(
            jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogInLayout.createSequentialGroup()
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLogInLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAnnulla, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLogInLayout.createSequentialGroup()
                        .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLogInLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabelPorta))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogInLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNomeUtente, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogIn)
                            .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextNomeUtente, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jTextPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextIP)))))
                .addGap(57, 57, 57))
        );
        jPanelLogInLayout.setVerticalGroup(
            jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogIn)
                .addGap(46, 46, 46)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeUtente))
                .addGap(11, 11, 11)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIP, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPorta)
                    .addComponent(jTextPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnulla)
                    .addComponent(jButtonOK))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        jTextNomeUtente.setText(null);
        jTextPorta.setText(null);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        nomeUtente = jTextNomeUtente.getText();
        porta = jTextPorta.getText();
        IP = jTextIP.getText();
        int iPorta;
        if(nomeUtente.equals("") || porta.equals("") || IP.equals("")){
            JOptionPane.showMessageDialog(null, "Errore! Dati non sufficienti!");
        }
        else{
            iPorta = Integer.parseInt(porta);
            this.dispose();
            JFrameChat frameChat = new JFrameChat(nomeUtente, IP, iPorta);
            frameChat.setVisible(true);
        }
    }//GEN-LAST:event_jButtonOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabelIP;
    private javax.swing.JLabel jLabelLogIn;
    private javax.swing.JLabel jLabelNomeUtente;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JPanel jPanelLogIn;
    private javax.swing.JTextField jTextIP;
    private javax.swing.JTextField jTextNomeUtente;
    private javax.swing.JTextField jTextPorta;
    // End of variables declaration//GEN-END:variables
}

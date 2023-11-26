package pixelbattle.UI;

public class SelectionPlayer extends javax.swing.JFrame {

    public static int playerCount = 0;
    public static String player1Selection = "";
    public static String player2Selection = "";

    public SelectionPlayer() {
        initComponents();
        if (playerCount == 1) {
            P1Button.setEnabled(false);
            P2Button.setEnabled(true);
        }
        if (playerCount == 2) {
            P1Button.setEnabled(false);
            P2Button.setEnabled(false);
            battleButton.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P1Button = new javax.swing.JButton();
        P2Button = new javax.swing.JButton();
        battleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P1Button.setText("Cadastrar jogador 1");
        P1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ButtonActionPerformed(evt);
            }
        });

        P2Button.setText("Cadastrar jogador 2");
        P2Button.setEnabled(false);
        P2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ButtonActionPerformed(evt);
            }
        });

        battleButton.setText("Batalha");
        battleButton.setEnabled(false);
        battleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P2Button)
                    .addComponent(P1Button))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(battleButton)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(P1Button)
                .addGap(67, 67, 67)
                .addComponent(P2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(battleButton)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ButtonActionPerformed
        new SelectionChar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_P1ButtonActionPerformed

    private void P2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ButtonActionPerformed
        new SelectionChar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_P2ButtonActionPerformed

    private void battleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battleButtonActionPerformed
        new Battle().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_battleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SelectionPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton P1Button;
    private javax.swing.JButton P2Button;
    private javax.swing.JButton battleButton;
    // End of variables declaration//GEN-END:variables
}

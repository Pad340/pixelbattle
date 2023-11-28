package pixelbattle.UI;

import pixelbattle.classes.Character;

public class SelectionPlayer extends javax.swing.JFrame {

    public static int playerCount = 0;
    public static Character player1Selection;
    public static Character player2Selection;

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
        x = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1113, 548));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1113, 548));
        getContentPane().setLayout(null);

        P1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/cadastrarP1.png"))); // NOI18N
        P1Button.setBorderPainted(false);
        P1Button.setContentAreaFilled(false);
        P1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(P1Button);
        P1Button.setBounds(110, 320, 180, 70);

        P2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/cadastrarP2.png"))); // NOI18N
        P2Button.setBorderPainted(false);
        P2Button.setContentAreaFilled(false);
        P2Button.setEnabled(false);
        P2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(P2Button);
        P2Button.setBounds(240, 430, 180, 70);

        battleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/batalhaButton.png"))); // NOI18N
        battleButton.setBorderPainted(false);
        battleButton.setContentAreaFilled(false);
        battleButton.setEnabled(false);
        battleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(battleButton);
        battleButton.setBounds(930, 450, 160, 70);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/x.png"))); // NOI18N
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        getContentPane().add(x);
        x.setBounds(1050, 10, 50, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/cadastroBackground.gif"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1115, 555);

        pack();
        setLocationRelativeTo(null);
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

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        this.dispose();
    }//GEN-LAST:event_xActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton P1Button;
    private javax.swing.JButton P2Button;
    private javax.swing.JLabel background;
    private javax.swing.JButton battleButton;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables
}

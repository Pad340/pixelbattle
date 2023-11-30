package pixelbattle.UI;

import pixelbattle.classes.Character;
import pixelbattle.classes.Mage;
import pixelbattle.classes.Warrior;

public class End extends javax.swing.JFrame {

    public End(Character winner) {
        initComponents();
        
       if (winner instanceof Mage) {
            winnerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/wizard.gif")));
        } else if (winner instanceof Warrior) {
            winnerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/warrior.gif")));
        }
       
       winnerName.setText(winner.getName());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        x = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        winnerName = new javax.swing.JLabel();
        winnerImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backgroundGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(894, 605));
        setMinimumSize(new java.awt.Dimension(894, 605));
        setUndecorated(true);
        getContentPane().setLayout(null);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/x.png"))); // NOI18N
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        getContentPane().add(x);
        x.setBounds(830, 20, 50, 50);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/winnerText.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 800, 160);

        winnerName.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        winnerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(winnerName);
        winnerName.setBounds(310, 180, 270, 70);

        winnerImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(winnerImage);
        winnerImage.setBounds(310, 240, 270, 320);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/lobbyText.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 540, 220, 60);

        backgroundGif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/winnerBackground.gif"))); // NOI18N
        getContentPane().add(backgroundGif);
        backgroundGif.setBounds(0, 0, 900, 610);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        this.dispose();
    }//GEN-LAST:event_xActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Play().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundGif;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel winnerImage;
    private javax.swing.JLabel winnerName;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables
}

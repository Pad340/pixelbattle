package pixelbattle.UI;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import pixelbattle.classes.Character;
import pixelbattle.classes.Mage;
import pixelbattle.classes.Warrior;
import java.util.*;

public final class Battle extends javax.swing.JFrame {

    private Character p1;
    private Character p2;
    private int howStarts;
    private Character winner = null;

    public Battle() {
        initComponents();

        start(); // Starta a batalha na abertura da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextTurn = new javax.swing.JButton();
        p1Image = new javax.swing.JLabel();
        p2Image = new javax.swing.JLabel();
        p1Name = new javax.swing.JTextField();
        p2Name = new javax.swing.JTextField();
        p1Health = new javax.swing.JTextField();
        p2Health = new javax.swing.JTextField();
        x = new javax.swing.JButton();
        hpBarP1 = new javax.swing.JProgressBar();
        hpBarP2 = new javax.swing.JProgressBar();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1098, 600));
        setMinimumSize(new java.awt.Dimension(1098, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1098, 600));
        getContentPane().setLayout(null);

        nextTurn.setText("Atacar");
        nextTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTurnActionPerformed(evt);
            }
        });
        getContentPane().add(nextTurn);
        nextTurn.setBounds(500, 430, 120, 23);

        p1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/warrior.gif"))); // NOI18N
        getContentPane().add(p1Image);
        p1Image.setBounds(140, 270, 230, 290);

        p2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/wizardLeft.gif"))); // NOI18N
        getContentPane().add(p2Image);
        p2Image.setBounds(730, 300, 190, 270);

        p1Name.setEditable(false);
        p1Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(p1Name);
        p1Name.setBounds(220, 20, 150, 30);

        p2Name.setEditable(false);
        p2Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(p2Name);
        p2Name.setBounds(760, 20, 150, 30);

        p1Health.setEditable(false);
        p1Health.setBackground(new java.awt.Color(0, 204, 0));
        p1Health.setForeground(new java.awt.Color(255, 255, 255));
        p1Health.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1Health.setText("vida :)");
        p1Health.setBorder(null);
        getContentPane().add(p1Health);
        p1Health.setBounds(200, 570, 180, 20);

        p2Health.setEditable(false);
        p2Health.setBackground(new java.awt.Color(0, 204, 0));
        p2Health.setForeground(new java.awt.Color(255, 255, 255));
        p2Health.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2Health.setText("vida :)");
        p2Health.setBorder(null);
        getContentPane().add(p2Health);
        p2Health.setBounds(730, 570, 180, 20);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/x.png"))); // NOI18N
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        getContentPane().add(x);
        x.setBounds(1040, 0, 56, 57);

        hpBarP1.setBackground(new java.awt.Color(255, 0, 51));
        hpBarP1.setForeground(new java.awt.Color(0, 204, 0));
        hpBarP1.setValue(100);
        getContentPane().add(hpBarP1);
        hpBarP1.setBounds(210, 240, 180, 20);

        hpBarP2.setBackground(new java.awt.Color(255, 0, 51));
        hpBarP2.setForeground(new java.awt.Color(0, 204, 0));
        hpBarP2.setValue(100);
        getContentPane().add(hpBarP2);
        hpBarP2.setBounds(720, 240, 180, 20);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/battleBackground.gif"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1100, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        this.dispose();
    }//GEN-LAST:event_xActionPerformed

    private void nextTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTurnActionPerformed
        turn();
    }//GEN-LAST:event_nextTurnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JProgressBar hpBarP1;
    private javax.swing.JProgressBar hpBarP2;
    private javax.swing.JButton nextTurn;
    private javax.swing.JTextField p1Health;
    private javax.swing.JLabel p1Image;
    private javax.swing.JTextField p1Name;
    private javax.swing.JTextField p2Health;
    private javax.swing.JLabel p2Image;
    private javax.swing.JTextField p2Name;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables

    private void start() {
        Random random = new Random();
        howStarts = random.nextInt(2) + 1;

        p1 = SelectionPlayer.player1Selection;
        p2 = SelectionPlayer.player2Selection;

        if (p1 instanceof Mage) {
            p1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/wizard.gif")));
        } else if (p1 instanceof Warrior) {
            p1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/warrior.gif")));
        }

        if (p2 instanceof Mage) {
            p2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/wizardLeft.gif")));
        } else if (p2 instanceof Warrior) {
            p2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/warriorLeft.gif")));
        }

        p1Name.setText(p1.getName());
        p2Name.setText(p2.getName());
        p1Health.setText(p1.getHealthPoints() + "");
        p2Health.setText(p2.getHealthPoints() + "");
        
        // Vida máxima
        hpBarP1.setMaximum(p1.getHealthPoints());
        hpBarP2.setMaximum(p2.getHealthPoints());
        
        // Vida em si
        hpBarP1.setValue(p1.getHealthPoints());
        hpBarP2.setValue(p2.getHealthPoints());
    }

    private void turn() throws HeadlessException {

        if (howStarts == 1) {

            p1Attack(p1, p2);
            howStarts = 2;

        } else if (howStarts == 2) {

            p2Attack(p1, p2);
            howStarts = 1;

        }

        if (p1.getHealthPoints() <= 0) {
            winner = p2;
        } else if (p2.getHealthPoints() <= 0) {
            winner = p1;
        }

        if (winner != null) {
            JOptionPane.showMessageDialog(this, "Vencedor: " + winner.getName());
        }

        p1Health.setText(p1.getHealthPoints() + "");
        p2Health.setText(p2.getHealthPoints() + "");
        
        hpBarP1.setValue(p1.getHealthPoints());
        hpBarP2.setValue(p2.getHealthPoints());
    }

    void p1Attack(Character p1, Character p2) {

        p2.setHealthPoints(p2.getHealthPoints() - p1.getAttackPoints());
    }

    void p2Attack(Character p1, Character p2) {

        p1.setHealthPoints(p1.getHealthPoints() - p2.getAttackPoints());
    }
}

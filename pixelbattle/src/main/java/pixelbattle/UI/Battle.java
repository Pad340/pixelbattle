package pixelbattle.UI;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pixelbattle.classes.Character;
import pixelbattle.classes.Mage;
import pixelbattle.classes.Warrior;
import java.util.*;
import pixelbattle.connect.Connect;

public final class Battle extends javax.swing.JFrame {

    private Character p1;
    private Character p2;
    private int howStarts;
    private Character winner = null;

    public Battle() {
        initComponents();

        if (startBattle()) {
            start(); // Starta a batalha na abertura da tela
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextTurn = new javax.swing.JButton();
        p1Dmg = new javax.swing.JLabel();
        p2Dmg = new javax.swing.JLabel();
        hpBarP1 = new javax.swing.JProgressBar();
        p1Name = new javax.swing.JLabel();
        p1Image = new javax.swing.JLabel();
        p2Name = new javax.swing.JLabel();
        p2Image = new javax.swing.JLabel();
        hpBarP2 = new javax.swing.JProgressBar();
        x = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1098, 600));
        setMinimumSize(new java.awt.Dimension(1098, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1098, 600));
        getContentPane().setLayout(null);

        nextTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/attackButton.png"))); // NOI18N
        nextTurn.setBorderPainted(false);
        nextTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTurnActionPerformed(evt);
            }
        });
        getContentPane().add(nextTurn);
        nextTurn.setBounds(480, 460, 180, 60);

        p1Dmg.setBackground(new java.awt.Color(255, 255, 255));
        p1Dmg.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        p1Dmg.setForeground(new java.awt.Color(255, 0, 0));
        p1Dmg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(p1Dmg);
        p1Dmg.setBounds(380, 340, 90, 40);

        p2Dmg.setBackground(new java.awt.Color(255, 255, 255));
        p2Dmg.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        p2Dmg.setForeground(new java.awt.Color(255, 0, 0));
        p2Dmg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(p2Dmg);
        p2Dmg.setBounds(640, 340, 90, 40);

        hpBarP1.setBackground(new java.awt.Color(255, 0, 51));
        hpBarP1.setForeground(new java.awt.Color(0, 204, 0));
        hpBarP1.setValue(100);
        getContentPane().add(hpBarP1);
        hpBarP1.setBounds(190, 260, 180, 20);

        p1Name.setBackground(new java.awt.Color(255, 255, 255));
        p1Name.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        p1Name.setForeground(new java.awt.Color(255, 255, 255));
        p1Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(p1Name);
        p1Name.setBounds(190, 220, 180, 30);

        p1Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/warrior.gif"))); // NOI18N
        getContentPane().add(p1Image);
        p1Image.setBounds(170, 270, 230, 290);

        p2Name.setBackground(new java.awt.Color(255, 255, 255));
        p2Name.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        p2Name.setForeground(new java.awt.Color(255, 255, 255));
        p2Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(p2Name);
        p2Name.setBounds(730, 220, 180, 30);

        p2Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/wizardLeft.gif"))); // NOI18N
        getContentPane().add(p2Image);
        p2Image.setBounds(730, 290, 190, 270);

        hpBarP2.setBackground(new java.awt.Color(255, 0, 51));
        hpBarP2.setForeground(new java.awt.Color(0, 204, 0));
        hpBarP2.setValue(100);
        getContentPane().add(hpBarP2);
        hpBarP2.setBounds(730, 260, 180, 20);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/x.png"))); // NOI18N
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        getContentPane().add(x);
        x.setBounds(1020, 0, 84, 60);

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
    private javax.swing.JLabel p1Dmg;
    private javax.swing.JLabel p1Image;
    private javax.swing.JLabel p1Name;
    private javax.swing.JLabel p2Dmg;
    private javax.swing.JLabel p2Image;
    private javax.swing.JLabel p2Name;
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
            endBattle(winner);
            new End(winner).setVisible(true);
            this.dispose();
        }

        hpBarP1.setValue(p1.getHealthPoints());
        hpBarP2.setValue(p2.getHealthPoints());
    }

    void p1Attack(Character p1, Character p2) {

        int dmg = p1.getAttackPoints() - p2.getDefensePoints();

        p1Dmg.setVisible(false);
        p2Dmg.setText("-" + dmg);
        p2Dmg.setVisible(true);

        int health = p2.getHealthPoints() - dmg;

        p2.setHealthPoints(health);
    }

    void p2Attack(Character p1, Character p2) {

        int dmg = p2.getAttackPoints() - p1.getDefensePoints();

        p2Dmg.setVisible(false);
        p1Dmg.setText("-" + dmg);
        p1Dmg.setVisible(true);

        int health = p1.getHealthPoints() - dmg;

        p1.setHealthPoints(health);
    }

    boolean startBattle () {

        String query = "INSERT INTO battle (status) VALUES (?);";

        try {
            PreparedStatement prepare = Connect.getConnect().prepareStatement(query);
            prepare.setString(1, "Ativa");

            prepare.execute();

            return true;

        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage());
            return false;
        }
    }

    void endBattle (Character winner) {
        
        String query = "UPDATE battle SET status = ?, winner = ? WHERE id_battle = 1;";
        
        try {
            PreparedStatement prepare = Connect.getConnect().prepareStatement(query);
            prepare.setString(1, "Finalizada");
            prepare.setString(2, winner.getName());

            prepare.execute();
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage());
        }
    }
}

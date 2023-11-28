package pixelbattle.UI;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pixelbattle.classes.Mage;
import pixelbattle.classes.Warrior;
import pixelbattle.connect.Connect;
import java.util.*;
import java.util.function.Function;
import pixelbattle.interfaces.Combatant;

public final class Battle extends javax.swing.JFrame {

    public Battle() {
        initComponents();

        start(); // Starta a batalha na abertura da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        advanceButton = new javax.swing.JButton();
        fotoP2 = new javax.swing.JLabel();
        fotoP1 = new javax.swing.JLabel();
        p1Name = new javax.swing.JTextField();
        p2Name = new javax.swing.JTextField();
        p1Health = new javax.swing.JTextField();
        p2Health = new javax.swing.JTextField();
        x = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1098, 600));
        setMinimumSize(new java.awt.Dimension(1098, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1098, 600));
        getContentPane().setLayout(null);

        advanceButton.setText("Avançar");
        advanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advanceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(advanceButton);
        advanceButton.setBounds(152, 2997, 81, 23);

        fotoP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/wizardLeft.gif"))); // NOI18N
        getContentPane().add(fotoP2);
        fotoP2.setBounds(730, 300, 190, 270);

        fotoP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/warrior.gif"))); // NOI18N
        getContentPane().add(fotoP1);
        fotoP1.setBounds(140, 270, 230, 290);

        p1Name.setEditable(false);
        p1Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1Name.setText("nome");
        getContentPane().add(p1Name);
        p1Name.setBounds(220, 20, 150, 30);

        p2Name.setEditable(false);
        p2Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2Name.setText("nome");
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

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/battleBackground.gif"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1100, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void advanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advanceButtonActionPerformed


    }//GEN-LAST:event_advanceButtonActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        this.dispose();
    }//GEN-LAST:event_xActionPerformed

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
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Battle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton advanceButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel fotoP1;
    private javax.swing.JLabel fotoP2;
    private javax.swing.JTextField p1Health;
    private javax.swing.JTextField p1Name;
    private javax.swing.JTextField p2Health;
    private javax.swing.JTextField p2Name;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables

    private void start() {
        Random random = new Random();
        int howStarts = random.nextInt(2) + 1;

        Map<String, Function<Integer, Combatant>> playerSelectionMap = new HashMap<>(); // Mapeia uma string e uma função que contem um int e um objeto na variável playerSelectionMap
        playerSelectionMap.put("mage", this::callMage);
        playerSelectionMap.put("warrior", this::callWarrior);

        Combatant p1 = playerSelectionMap.getOrDefault(SelectionPlayer.player1Selection, this::defaultSelection).apply(1);
        Combatant p2 = playerSelectionMap.getOrDefault(SelectionPlayer.player2Selection, this::defaultSelection).apply(2);

        p1Name.setText(p1.getName());
        p2Name.setText(p2.getName());
        p1Health.setText(p1.getHealthPoints() + "");
        p2Health.setText(p2.getHealthPoints() + "");

        Combatant winner = null;

        while (p1.getHealthPoints() > 0 && p2.getHealthPoints() > 0) {
            p1Health.setText(p1.getHealthPoints() + "");
            p2Health.setText(p2.getHealthPoints() + "");

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
        }

        if (winner != null) {
            JOptionPane.showMessageDialog(this, winner.getName());
        } 

    }

    Warrior callWarrior(int playerID) {

        try {
            Warrior warrior = new Warrior();

            /* CHAMANDO GUERREIRO */
            String query = "SELECT * FROM `warrior` WHERE id_warrior = ?";
            PreparedStatement prepare = Connect.getConnect().prepareStatement(query);
            prepare.setInt(1, playerID);
            ResultSet result = prepare.executeQuery();

            // Processa os resultados
            while (result.next()) {
                warrior.setName(result.getString("name"));
                warrior.setHealthPoints(result.getInt("health_points"));
                warrior.setAttackPoints(result.getInt("attack_points"));
                warrior.setDefensePoints(result.getInt("defense_points"));
                warrior.setStrengthPoints(result.getInt("strength_points"));
                warrior.setSpeedPoints(result.getInt("speed_points"));
            }
            int buffedAttack = warrior.getAttackPoints() * ((warrior.getStrengthPoints() / 10) + 1); // Buffa o ataque usando a força
            int buffedDefense = warrior.getDefensePoints() * ((warrior.getSpeedPoints() / 10) + 1); // Buffa a defesa usando a velocidade?

            warrior.setAttackPoints(buffedAttack);
            warrior.setDefensePoints(buffedDefense);

            JOptionPane.showMessageDialog(this, "Guerreiro chamado com sucesso!");
            return warrior;
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage());
            return null;
        }
    }

    Mage callMage(int playerID) {

        try {
            Mage mage = new Mage();

            /* CHAMANDO MAGO */
            String query = "SELECT * FROM `mage` WHERE id_mage = ?";
            PreparedStatement prepare = Connect.getConnect().prepareStatement(query);
            prepare.setInt(1, playerID);
            ResultSet result = prepare.executeQuery();

            // Processa os resultados
            while (result.next()) {
                mage.setName(result.getString("name"));
                mage.setHealthPoints(result.getInt("health_points"));
                mage.setAttackPoints(result.getInt("attack_points"));
                mage.setDefensePoints(result.getInt("defense_points"));
                mage.setKnowledgePoints(result.getInt("knowledge_points"));
                mage.setRegenerationPoints(result.getInt("regeneration_points"));
            }
            int buffedAttack = mage.getAttackPoints() * ((mage.getKnowledgePoints() / 10) + 1); // Buffa o ataque usando a sabedoria
            int buffedDefense = mage.getDefensePoints() * ((mage.getRegenerationPoints() / 10) + 1); // Buffa a defesa usando a regeneração?

            mage.setAttackPoints(buffedAttack);
            mage.setDefensePoints(buffedDefense);

            JOptionPane.showMessageDialog(this, "Mago chamado com sucesso!");
            return mage;
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage());
            return null;
        }
    }

    void p1Attack(Combatant p1, Combatant p2) {

        int p2Health = p2.getHealthPoints() - p1.getAttackPoints();

        p2.setHealthPoints(p2Health);
    }

    void p2Attack(Combatant p1, Combatant p2) {

        int p1Health = p1.getHealthPoints() - p2.getAttackPoints();

        p1.setHealthPoints(p1Health);
    }

    Combatant defaultSelection(int playerID) {
        Combatant p = null;
        JOptionPane.showMessageDialog(this, "Mensagem de erro " + playerID);
        return p;
    }
}

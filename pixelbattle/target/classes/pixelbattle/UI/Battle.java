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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p1Name = new javax.swing.JTextField();
        p2Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        p1Health = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p2Health = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        advanceButton.setText("Avançar");
        advanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advanceButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Foto Player 2");

        jLabel2.setText("Foto Player 1");

        p1Name.setEditable(false);

        p2Name.setEditable(false);

        jLabel3.setText("Vida");

        p1Health.setEditable(false);

        jLabel4.setText("Vida");

        p2Health.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(93, 93, 93)
                        .addComponent(advanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p1Health, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(p2Health, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(advanceButton)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2Health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void advanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advanceButtonActionPerformed


    }//GEN-LAST:event_advanceButtonActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField p1Health;
    private javax.swing.JTextField p1Name;
    private javax.swing.JTextField p2Health;
    private javax.swing.JTextField p2Name;
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

            /* CHAMANDO GUERREIRO */
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

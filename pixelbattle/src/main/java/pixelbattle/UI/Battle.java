package pixelbattle.UI;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import pixelbattle.classes.Mage;
import pixelbattle.classes.Warrior;
import pixelbattle.connect.Connect;

public class Battle extends javax.swing.JFrame {

    public Battle() {
        initComponents();

        /* Chamando personagens */
        if (SelectionPlayer.player1Selection == "warrior") {
            Warrior player1 = callWarrior(1);

            if (SelectionPlayer.player2Selection == "warrior") {
                Warrior player2 = callWarrior(2);

            } else if (SelectionPlayer.player2Selection == "mage") {
                Mage player2 = callMage(1);
            }

        } else if (SelectionPlayer.player1Selection == "mage") {
            Mage player1 = callMage(1);

            if (SelectionPlayer.player2Selection == "mage") {
                Mage player2 = callMage(2);

            } else if (SelectionPlayer.player2Selection == "warrior") {
                Warrior player2 = callWarrior(1);
            }

            // Começa a batalha
            int howStarts = startBattle();
            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        advanceButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        versus = new javax.swing.JTextField();
        player1Name = new javax.swing.JTextField();
        player1Check = new javax.swing.JButton();
        player2Name = new javax.swing.JTextField();
        player2Check = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        advanceButton.setText("Avançar");
        advanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advanceButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Foto Player 2");

        jLabel2.setText("Foto Player 1");

        versus.setEditable(false);
        versus.setText("VS");

        player1Check.setText("Checar personagem");

        player2Check.setText("Checar personagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(advanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(player2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(versus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(player1Check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player2Check)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(player1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(versus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(advanceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1Check)
                    .addComponent(player2Check))
                .addContainerGap())
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
    private javax.swing.JButton player1Check;
    private javax.swing.JTextField player1Name;
    private javax.swing.JButton player2Check;
    private javax.swing.JTextField player2Name;
    private javax.swing.JTextField versus;
    // End of variables declaration//GEN-END:variables

    private int startBattle() {
        Random random = new Random();

        try {
            String query = "INSERT INTO "
                    + "`battle` "
                    + "(`status`) "
                    + "VALUES "
                    + "(?);";

            PreparedStatement prepare = Connect.getConnect().prepareStatement(query);
            prepare.setInt(1, 1);
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(this, "Batalha iniciada!");

        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage());
        }
        
        int howStarts = random.nextInt(2) + 1;
        
        
        return howStarts;
    }

    private Warrior callWarrior(int playerID) {

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
                warrior.setAttackPoints(result.getInt("attack_points"));
                warrior.setDefensePoints(result.getInt("defense_points"));
                warrior.setStrengthPoints(result.getInt("strength_points"));
                warrior.setSpeedPoints(result.getInt("speed_points"));
            }
            JOptionPane.showMessageDialog(this, "Guerreiro chamado com sucesso!");
            return warrior;
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage());
            return null;
        }
    }

    private Mage callMage(int playerID) {

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
                mage.setAttackPoints(result.getInt("attack_points"));
                mage.setDefensePoints(result.getInt("defense_points"));
                mage.setKnowledgePoints(result.getInt("knowledge_points"));
                mage.setRegenerationPoints(result.getInt("regeneration_points"));
            }
            JOptionPane.showMessageDialog(this, "Mago chamado com sucesso!");
            return mage;
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception.getMessage());
            return null;
        }
    }
}

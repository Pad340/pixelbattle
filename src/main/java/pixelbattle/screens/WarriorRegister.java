package pixelbattle.screens;

import pixelbattle.connect.Connect;
import pixelbattle.classes.Warrior;
import pixelbattle.classes.Item;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class WarriorRegister extends javax.swing.JFrame {

    private Warrior warrior = new Warrior();
    private Item item = new Item();

    public WarriorRegister() {
        initComponents();

        // Gerar um inteiro entre min e max
        int attack = (int) (Math.random() * (20 - 15 + 1) + 15);
        attackPoints.setText("" + attack);

        int defense = (int) (Math.random() * (15 - 10 + 1) + 10);
        defensePoints.setText("" + defense);

        int strength = (int) (Math.random() * (10 - 2 + 1) + 2);
        strengthPoints.setText("" + strength);

        int speed = (int) (Math.random() * (10 - 2 + 1) + 2);
        speedPoints.setText("" + speed);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        warriorImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        healthPoints = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        attackPoints = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        defensePoints = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        strengthPoints = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        speedPoints = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        warriorImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warriorImage.setText("Foto do Gueirreiro");

        jLabel2.setText("Nome");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Pontos de Vida");

        healthPoints.setEditable(false);
        healthPoints.setText("100");
        healthPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthPointsActionPerformed(evt);
            }
        });

        jLabel4.setText("Pontos de Ataque");

        attackPoints.setEditable(false);
        attackPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackPointsActionPerformed(evt);
            }
        });

        jLabel5.setText("Pontos de Defesa");

        defensePoints.setEditable(false);
        defensePoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defensePointsActionPerformed(evt);
            }
        });

        jLabel6.setText("Força");

        strengthPoints.setEditable(false);
        strengthPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strengthPointsActionPerformed(evt);
            }
        });

        jLabel7.setText("Velocidade");

        speedPoints.setEditable(false);
        speedPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedPointsActionPerformed(evt);
            }
        });

        saveButton.setText("Salvar Guerreiro");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(speedPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defensePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(strengthPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(healthPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(attackPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warriorImage, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(saveButton)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warriorImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(healthPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attackPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(defensePoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strengthPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speedPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void healthPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthPointsActionPerformed

    private void attackPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attackPointsActionPerformed

    private void defensePointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defensePointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defensePointsActionPerformed

    private void strengthPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strengthPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_strengthPointsActionPerformed

    private void speedPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speedPointsActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        this.warrior.setName(name.getText());
        this.warrior.setHealthPoints(Integer.parseInt(healthPoints.getText()));
        this.warrior.setAttackPoints(Integer.parseInt(attackPoints.getText()));
        this.warrior.setDefensePoints(Integer.parseInt(defensePoints.getText()));
        this.warrior.setStrengthPoints(Integer.parseInt(strengthPoints.getText()));
        this.warrior.setSpeedPoints(Integer.parseInt(speedPoints.getText()));

        save();
    }//GEN-LAST:event_saveButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(WarriorRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(WarriorRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(WarriorRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(WarriorRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarriorRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attackPoints;
    private javax.swing.JTextField defensePoints;
    private javax.swing.JTextField healthPoints;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField speedPoints;
    private javax.swing.JTextField strengthPoints;
    private javax.swing.JLabel warriorImage;
    // End of variables declaration//GEN-END:variables

    private void save() {

        /*
         * SALVANDO GUERREIRO
         */
        String sql = "INSERT "
                + "INTO `tb_warrior` "
                + "(`name`, `health_points`, `attack_points`, `defense_points`, `strength_points`, `speed_points`) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?);";
        try
        {
            PreparedStatement prepare = Connect.getConnect().prepareStatement(sql);
            prepare.setString(1, this.warrior.getName());
            prepare.setInt(2, this.warrior.getHealthPoints());
            prepare.setInt(3, this.warrior.getAttackPoints());
            prepare.setInt(4, this.warrior.getDefensePoints());
            prepare.setInt(5, this.warrior.getStrengthPoints());
            prepare.setInt(6, this.warrior.getSpeedPoints());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(this, "Guerreiro salvo com sucesso!");
            new Battle().setVisible(true); // exibe a tela inicial
            this.dispose(); // libera a memória da janela
        } catch (Exception exception)
        {
            exception.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar guerreiro!");
        }
    }
}

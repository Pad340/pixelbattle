package pixelbattle.screens;

import pixelbattle.connect.Connect;
import pixelbattle.classes.Mage;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class MageRegister extends javax.swing.JFrame {

    /**
     * Creates new form CadastroGuerreiro
     */
    public MageRegister() {
        initComponents();
        // Gerar um inteiro entre min e max
        int attack = (int) (Math.random() * (20 - 15 + 1) + 15);
        attackPoints.setText("" + attack);

        int defense = (int) (Math.random() * (15 - 10 + 1) + 10);
        defensePoints.setText("" + defense);

        int knowledge = (int) (Math.random() * (10 - 2 + 1) + 2);
        knowledgePoints.setText("" + knowledge);

        int regeneration = (int) (Math.random() * (10 - 2 + 1) + 2);
        regenerationPoints.setText("" + regeneration);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mageImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        healthPoints = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        attackPoints = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        defensePoints = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        knowledgePoints = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        regenerationPoints = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mageImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mageImage.setText("Foto do Mago");

        jLabel2.setText("Nome");

        jLabel3.setText("Pontos de Vida");

        healthPoints.setEditable(false);
        healthPoints.setText("100");

        jLabel4.setText("Pontos de Ataque");

        attackPoints.setEditable(false);

        jLabel5.setText("Pontos de Defesa");

        defensePoints.setEditable(false);

        jLabel6.setText("Sabedoria");

        knowledgePoints.setEditable(false);

        jLabel7.setText("Regeneração");

        regenerationPoints.setEditable(false);

        saveButton.setText("Salvar Mago");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(regenerationPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defensePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(knowledgePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(healthPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(attackPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mageImage, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mageImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(knowledgePoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regenerationPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Mage mage = new Mage();

        mage.setName(name.getText());
        mage.setHealthPoints(Integer.parseInt(healthPoints.getText()));
        mage.setAttackPoints(Integer.parseInt(attackPoints.getText()));
        mage.setDefensePoints(Integer.parseInt(defensePoints.getText()));
        mage.setKnowledgePoints(Integer.parseInt(knowledgePoints.getText()));
        mage.setRegenerationPoints(Integer.parseInt(regenerationPoints.getText()));

        save(mage);
    }//GEN-LAST:event_saveButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MageRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MageRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MageRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MageRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MageRegister().setVisible(true);
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
    private javax.swing.JTextField knowledgePoints;
    private javax.swing.JLabel mageImage;
    private javax.swing.JTextField name;
    private javax.swing.JTextField regenerationPoints;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

    private void save(Mage mage) {
        String query = "INSERT "
                + "INTO `tb_mage` "
                + "(`name`, `health_points`, `attack_points`, `defense_points`, `knowledge_points`, `regeneration_points`) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?);";
        try {
                PreparedStatement prepare = Connect.getConnect().prepareStatement(query);
                prepare.setString(1, mage.getName());
                prepare.setInt(2, mage.getHealthPoints());
                prepare.setInt(3, mage.getAttackPoints());
                prepare.setInt(4, mage.getDefensePoints());
                prepare.setInt(5, mage.getKnowledgePoints());
                prepare.setInt(6, mage.getRegenerationPoints());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                this.dispose(); // libera a memória da janela
                SelectionPlayer.playerCount++;
                new SelectionPlayer().setVisible(true); // exibe a tela inicial
        } catch (Exception exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao salvar!");
        }
    }
}

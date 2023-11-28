package pixelbattle.UI;

import java.awt.HeadlessException;
import pixelbattle.connect.Connect;
import pixelbattle.classes.Mage;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MageRegister extends javax.swing.JFrame {

    private Mage mage = new Mage();

    public MageRegister() {
        initComponents();

        // Gera um inteiro entre min e max
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

        knowledgePoints = new javax.swing.JTextField();
        regenerationPoints = new javax.swing.JTextField();
        healthPoints = new javax.swing.JTextField();
        attackPoints = new javax.swing.JTextField();
        defensePoints = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        mageImage = new javax.swing.JLabel();
        hp_text = new javax.swing.JLabel();
        eusabo = new javax.swing.JLabel();
        ataque_text = new javax.swing.JLabel();
        defesa_text = new javax.swing.JLabel();
        nome_text = new javax.swing.JLabel();
        regen_text = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        x = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(899, 757));
        setMinimumSize(new java.awt.Dimension(899, 757));
        setUndecorated(true);
        getContentPane().setLayout(null);

        knowledgePoints.setEditable(false);
        knowledgePoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        knowledgePoints.setBorder(null);
        getContentPane().add(knowledgePoints);
        knowledgePoints.setBounds(200, 460, 70, 30);

        regenerationPoints.setEditable(false);
        regenerationPoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regenerationPoints.setBorder(null);
        getContentPane().add(regenerationPoints);
        regenerationPoints.setBounds(200, 560, 70, 30);

        healthPoints.setEditable(false);
        healthPoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        healthPoints.setText("100");
        healthPoints.setBorder(null);
        getContentPane().add(healthPoints);
        healthPoints.setBounds(200, 130, 70, 30);

        attackPoints.setEditable(false);
        attackPoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attackPoints.setBorder(null);
        attackPoints.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(attackPoints);
        attackPoints.setBounds(200, 250, 70, 30);

        defensePoints.setEditable(false);
        defensePoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defensePoints.setBorder(null);
        getContentPane().add(defensePoints);
        defensePoints.setBounds(200, 350, 70, 30);

        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(null);
        getContentPane().add(name);
        name.setBounds(520, 190, 200, 30);

        mageImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/wizard.gif"))); // NOI18N
        getContentPane().add(mageImage);
        mageImage.setBounds(450, 230, 330, 330);

        hp_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/hp.png"))); // NOI18N
        getContentPane().add(hp_text);
        hp_text.setBounds(130, 90, 180, 90);

        eusabo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eusabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/regen.png"))); // NOI18N
        getContentPane().add(eusabo);
        eusabo.setBounds(110, 520, 210, 95);

        ataque_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ataque_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/attack.png"))); // NOI18N
        getContentPane().add(ataque_text);
        ataque_text.setBounds(130, 210, 180, 80);

        defesa_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defesa_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/defense.png"))); // NOI18N
        getContentPane().add(defesa_text);
        defesa_text.setBounds(130, 310, 170, 95);

        nome_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/nomeEscrita.png"))); // NOI18N
        getContentPane().add(nome_text);
        nome_text.setBounds(540, 130, 150, 50);

        regen_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regen_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/knowledge.png"))); // NOI18N
        getContentPane().add(regen_text);
        regen_text.setBounds(130, 410, 170, 95);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/confirmarButton.png"))); // NOI18N
        saveButton.setActionCommand("Salvar Mago");
        saveButton.setBorderPainted(false);
        saveButton.setContentAreaFilled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(350, 640, 200, 80);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/x.png"))); // NOI18N
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        getContentPane().add(x);
        x.setBounds(810, 10, 50, 50);

        background1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/backgroundEscolhaPersonagem.png"))); // NOI18N
        getContentPane().add(background1);
        background1.setBounds(0, -140, 900, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        this.mage.setName(name.getText());
        this.mage.setHealthPoints(Integer.parseInt(healthPoints.getText()));
        this.mage.setAttackPoints(Integer.parseInt(attackPoints.getText()));
        this.mage.setDefensePoints(Integer.parseInt(defensePoints.getText()));
        this.mage.setKnowledgePoints(Integer.parseInt(knowledgePoints.getText()));
        this.mage.setRegenerationPoints(Integer.parseInt(regenerationPoints.getText()));

        save();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        this.dispose();
    }//GEN-LAST:event_xActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ataque_text;
    private javax.swing.JTextField attackPoints;
    private javax.swing.JLabel background1;
    private javax.swing.JTextField defensePoints;
    private javax.swing.JLabel defesa_text;
    private javax.swing.JLabel eusabo;
    private javax.swing.JTextField healthPoints;
    private javax.swing.JLabel hp_text;
    private javax.swing.JTextField knowledgePoints;
    private javax.swing.JLabel mageImage;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nome_text;
    private javax.swing.JLabel regen_text;
    private javax.swing.JTextField regenerationPoints;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables

    private void save() {

        /*
         * SALVANDO MAGO
         */
        String query = "INSERT INTO "
                + "`mage` "
                + "(`name`, `health_points`, `attack_points`, `defense_points`, `knowledge_points`, `regeneration_points`) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?);";
        try
        {
            PreparedStatement prepare = Connect.getConnect().prepareStatement(query);
            prepare.setString(1, this.mage.getName());
            prepare.setInt(2, this.mage.getHealthPoints());
            prepare.setInt(3, this.mage.getAttackPoints());
            prepare.setInt(4, this.mage.getDefensePoints());
            prepare.setInt(5, this.mage.getKnowledgePoints());
            prepare.setInt(6, this.mage.getRegenerationPoints());
            prepare.executeUpdate(); // Salva o mago
            
            int buffedAttack = mage.getAttackPoints() * ((mage.getKnowledgePoints() / 10) + 1); // Buffa o ataque usando a sabedoria
            int buffedDefense = mage.getDefensePoints() * ((mage.getRegenerationPoints() / 10) + 1); // Buffa a defesa usando a regeneração?

            mage.setAttackPoints(buffedAttack);
            mage.setDefensePoints(buffedDefense);
            
            JOptionPane.showMessageDialog(this, "Mago salvo com sucesso!");

            SelectionPlayer.playerCount++; // Conta a quantidade total de jogadores
            switch (SelectionPlayer.playerCount) // Verifica qual jogador está cadastrando o mago
            {
                case 1:
                    SelectionPlayer.player1Selection = this.mage;
                    break;
                case 2:
                    SelectionPlayer.player2Selection = this.mage;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Erro Mago!");
                    break;
            }
            this.dispose(); // Fecha a janela de cadastro
            new SelectionPlayer().setVisible(true); // Volta para a seleção de jogador

        } catch (HeadlessException | SQLException exception)
        {
            JOptionPane.showMessageDialog(this, exception.getMessage());
        }
    }
}

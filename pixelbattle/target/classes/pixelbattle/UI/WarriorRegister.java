package pixelbattle.UI;

import java.awt.HeadlessException;
import pixelbattle.connect.Connect;
import pixelbattle.classes.Warrior;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class WarriorRegister extends javax.swing.JFrame {

    private Warrior warrior = new Warrior();

    public WarriorRegister() {
        initComponents();

        // Gera um inteiro entre min e max
        int attack = (int) (Math.random() * (25 - 20 + 1) + 20);
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

        nome_text = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        healthPoints = new javax.swing.JTextField();
        attackPoints = new javax.swing.JTextField();
        defensePoints = new javax.swing.JTextField();
        strengthPoints = new javax.swing.JTextField();
        speedPoints = new javax.swing.JTextField();
        hp_text = new javax.swing.JLabel();
        forca_text = new javax.swing.JLabel();
        defesa_text = new javax.swing.JLabel();
        ataque_text = new javax.swing.JLabel();
        velocidade_text = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        x = new javax.swing.JButton();
        warriorImage = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(899, 757));
        setUndecorated(true);
        getContentPane().setLayout(null);

        nome_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/nomeEscrita.png"))); // NOI18N
        getContentPane().add(nome_text);
        nome_text.setBounds(540, 130, 150, 50);

        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(name);
        name.setBounds(520, 190, 200, 30);

        healthPoints.setEditable(false);
        healthPoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        healthPoints.setText("100");
        healthPoints.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(healthPoints);
        healthPoints.setBounds(200, 130, 70, 30);

        attackPoints.setEditable(false);
        attackPoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        attackPoints.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        attackPoints.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(attackPoints);
        attackPoints.setBounds(200, 250, 70, 30);

        defensePoints.setEditable(false);
        defensePoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defensePoints.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(defensePoints);
        defensePoints.setBounds(200, 350, 70, 30);

        strengthPoints.setEditable(false);
        strengthPoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        strengthPoints.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(strengthPoints);
        strengthPoints.setBounds(200, 460, 70, 30);

        speedPoints.setEditable(false);
        speedPoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        speedPoints.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(speedPoints);
        speedPoints.setBounds(200, 570, 70, 30);

        hp_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hp_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/hp.png"))); // NOI18N
        getContentPane().add(hp_text);
        hp_text.setBounds(130, 90, 180, 90);

        forca_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forca_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/strenght.png"))); // NOI18N
        getContentPane().add(forca_text);
        forca_text.setBounds(140, 420, 160, 90);

        defesa_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defesa_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/defense.png"))); // NOI18N
        getContentPane().add(defesa_text);
        defesa_text.setBounds(130, 310, 170, 95);

        ataque_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ataque_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/attack.png"))); // NOI18N
        getContentPane().add(ataque_text);
        ataque_text.setBounds(130, 210, 180, 80);

        velocidade_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        velocidade_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/speed.png"))); // NOI18N
        getContentPane().add(velocidade_text);
        velocidade_text.setBounds(130, 520, 180, 110);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/confirmarButton.png"))); // NOI18N
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

        warriorImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warriorImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/warrior.gif"))); // NOI18N
        getContentPane().add(warriorImage);
        warriorImage.setBounds(450, 230, 330, 330);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/backgroundEscolhaPersonagem.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -140, 900, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        this.warrior.setName(name.getText());
        this.warrior.setHealthPoints(Integer.parseInt(healthPoints.getText()));
        this.warrior.setAttackPoints(Integer.parseInt(attackPoints.getText()));
        this.warrior.setDefensePoints(Integer.parseInt(defensePoints.getText()));
        this.warrior.setStrengthPoints(Integer.parseInt(strengthPoints.getText()));
        this.warrior.setSpeedPoints(Integer.parseInt(speedPoints.getText()));

        save();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        this.dispose();
    }//GEN-LAST:event_xActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ataque_text;
    private javax.swing.JTextField attackPoints;
    private javax.swing.JLabel background;
    private javax.swing.JTextField defensePoints;
    private javax.swing.JLabel defesa_text;
    private javax.swing.JLabel forca_text;
    private javax.swing.JTextField healthPoints;
    private javax.swing.JLabel hp_text;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nome_text;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField speedPoints;
    private javax.swing.JTextField strengthPoints;
    private javax.swing.JLabel velocidade_text;
    private javax.swing.JLabel warriorImage;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables

    private void save() {

        /*
         * SALVANDO GUERREIRO
         */
        String query = "INSERT INTO "
                + "warrior "
                + "(name, health_points, attack_points, defense_points, strength_points, speed_points) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?);";
        try
        {
            PreparedStatement prepare = Connect.getConnect().prepareStatement(query);
            prepare.setString(1, this.warrior.getName());
            prepare.setInt(2, this.warrior.getHealthPoints());
            prepare.setInt(3, this.warrior.getAttackPoints());
            prepare.setInt(4, this.warrior.getDefensePoints());
            prepare.setInt(5, this.warrior.getStrengthPoints());
            prepare.setInt(6, this.warrior.getSpeedPoints());
            prepare.executeUpdate(); // Salva o guerreiro
            
            int buffedAttack = warrior.getAttackPoints() * ((warrior.getStrengthPoints() / 10) + 1); // Buffa o ataque usando a força
            int buffedDefense = warrior.getDefensePoints() * ((warrior.getSpeedPoints() / 10) + 1); // Buffa a defesa usando a velocidade?

            warrior.setAttackPoints(buffedAttack);
            warrior.setDefensePoints(buffedDefense);
            
            JOptionPane.showMessageDialog(this, "Guerreiro salvo com sucesso!");
            
            SelectionPlayer.playerCount++; // Conta a quantidade total de jogadores
            switch (SelectionPlayer.playerCount) // Verifica qual jogador está cadastrando o guerreiro
            {
                case 1:
                    SelectionPlayer.player1Selection = this.warrior;
                    break;
                case 2:
                    SelectionPlayer.player2Selection = this.warrior;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Erro Guerreiro!");
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

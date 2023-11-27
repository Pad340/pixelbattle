package pixelbattle.UI;

import java.time.Clock;

public class SelectionChar extends javax.swing.JFrame {
    boolean isMage = false;
    boolean isWarrior = false;
    
    public SelectionChar() {
        initComponents();
        image_pontoInterrogacao.setVisible(true);
        image_warrior.setVisible(false);
        image_mage.setVisible(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agrupamentoEscolha = new javax.swing.ButtonGroup();
        MagoButton = new javax.swing.JRadioButton();
        ConfirmButton = new javax.swing.JButton();
        GuerreiroButton = new javax.swing.JRadioButton();
        x = new javax.swing.JButton();
        image_pontoInterrogacao = new javax.swing.JLabel();
        image_warrior = new javax.swing.JLabel();
        image_mage = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(898, 708));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(898, 708));
        getContentPane().setLayout(null);

        agrupamentoEscolha.add(MagoButton);
        MagoButton.setFont(new java.awt.Font("Alagard", 0, 18)); // NOI18N
        MagoButton.setForeground(new java.awt.Color(255, 255, 255));
        MagoButton.setText("Mago");
        MagoButton.setOpaque(false);
        MagoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MagoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MagoButton);
        MagoButton.setBounds(530, 190, 70, 30);

        ConfirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/confirmarButton.png"))); // NOI18N
        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.setEnabled(false);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmButton);
        ConfirmButton.setBounds(360, 610, 200, 70);

        agrupamentoEscolha.add(GuerreiroButton);
        GuerreiroButton.setFont(new java.awt.Font("Alagard", 0, 18)); // NOI18N
        GuerreiroButton.setForeground(new java.awt.Color(255, 255, 255));
        GuerreiroButton.setText("Guerreiro");
        GuerreiroButton.setOpaque(false);
        GuerreiroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuerreiroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GuerreiroButton);
        GuerreiroButton.setBounds(320, 190, 130, 30);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/x.png"))); // NOI18N
        x.setBorderPainted(false);
        x.setContentAreaFilled(false);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        getContentPane().add(x);
        x.setBounds(840, 0, 84, 60);

        image_pontoInterrogacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/questionMark.gif"))); // NOI18N
        getContentPane().add(image_pontoInterrogacao);
        image_pontoInterrogacao.setBounds(240, 220, 440, 370);

        image_warrior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_warrior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/warrior.gif"))); // NOI18N
        getContentPane().add(image_warrior);
        image_warrior.setBounds(340, 220, 230, 360);

        image_mage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_mage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/wizard.gif"))); // NOI18N
        getContentPane().add(image_mage);
        image_mage.setBounds(380, 280, 170, 260);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pixelbattle/UI/images/backgroundEscolhaPersonagem.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1070, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GuerreiroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuerreiroButtonActionPerformed
        ConfirmButton.setEnabled(true);
        image_warrior.setVisible(true);
        image_mage.setVisible(false);
        image_pontoInterrogacao.setVisible(false);
        
        isWarrior = true;
        isMage = false;
    }//GEN-LAST:event_GuerreiroButtonActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        this.dispose();
    }//GEN-LAST:event_xActionPerformed

    private void MagoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MagoButtonActionPerformed
        ConfirmButton.setEnabled(true);
        image_warrior.setVisible(false);
        image_mage.setVisible(true);
        image_pontoInterrogacao.setVisible(false);
        
        isWarrior = false;
        isMage = true;
    }//GEN-LAST:event_MagoButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        if (isWarrior == true) {
            WarriorRegister warrior = new WarriorRegister();
            warrior.setVisible(true);
            this.setVisible(false);
            //this.dispose(); libera a memória              
        }
        else if (isMage == true) {
            MageRegister mage = new MageRegister();
            mage.setVisible(true);
            this.setVisible(false);
            //this.dispose(); libera a memória             
        }
        else {
            System.out.println("!! Erro na seleção de personagem !!");
        }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SelectionChar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionChar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionChar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionChar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionChar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JRadioButton GuerreiroButton;
    private javax.swing.JRadioButton MagoButton;
    private javax.swing.ButtonGroup agrupamentoEscolha;
    private javax.swing.JLabel background;
    private javax.swing.JLabel image_mage;
    private javax.swing.JLabel image_pontoInterrogacao;
    private javax.swing.JLabel image_warrior;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables
}

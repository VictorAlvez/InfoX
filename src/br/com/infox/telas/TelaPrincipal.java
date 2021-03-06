/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//projeto sistema para gestão de serviços

package br.com.infox.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        mnCadcli = new javax.swing.JMenuItem();
        mnCados = new javax.swing.JMenuItem();
        mnCaduser = new javax.swing.JMenuItem();
        mnRel = new javax.swing.JMenu();
        mnRelservices = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        mnHelpsobre = new javax.swing.JMenuItem();
        mnOpcoes = new javax.swing.JMenu();
        mnOpcoessair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - Sistema para controle OS ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(520, 412));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/App-x-icon.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblData.setText("Data");

        mnCad.setText("Cadastro");

        mnCadcli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnCadcli.setText("Cliente");
        mnCadcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadcliActionPerformed(evt);
            }
        });
        mnCad.add(mnCadcli);

        mnCados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnCados.setText("OS");
        mnCados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadosActionPerformed(evt);
            }
        });
        mnCad.add(mnCados);

        mnCaduser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnCaduser.setText("Usuários");
        mnCaduser.setEnabled(false);
        mnCaduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCaduserActionPerformed(evt);
            }
        });
        mnCad.add(mnCaduser);

        jMenuBar1.add(mnCad);

        mnRel.setText("Relatório");
        mnRel.setEnabled(false);

        mnRelservices.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnRelservices.setText("Serviços");
        mnRel.add(mnRelservices);

        jMenuBar1.add(mnRel);

        mnHelp.setText("Ajuda");

        mnHelpsobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnHelpsobre.setText("Sobre");
        mnHelpsobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHelpsobreActionPerformed(evt);
            }
        });
        mnHelp.add(mnHelpsobre);

        jMenuBar1.add(mnHelp);

        mnOpcoes.setText("Opções");

        mnOpcoessair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnOpcoessair.setText("Sair");
        mnOpcoessair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpcoessairActionPerformed(evt);
            }
        });
        mnOpcoes.add(mnOpcoessair);

        jMenuBar1.add(mnOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblUsuario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addGap(34, 34, 34)
                .addComponent(lblData)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(716, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // as linhas abaixo substituem a label data pela data atual do sistema
        // ao iniciar o form
        
        Date data = new Date();
        // para mostrar apenas a data (esta mostrando data e hora)
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void mnOpcoessairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpcoessairActionPerformed
        // exibe uma caixa de dialogo para sair
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
         System.exit(0);
        }
        
        
    }//GEN-LAST:event_mnOpcoessairActionPerformed

    private void mnHelpsobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHelpsobreActionPerformed
        // TODO add your handling code here:
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_mnHelpsobreActionPerformed

    private void mnCaduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCaduserActionPerformed
        // as linhas abaixo abrem o form TelaUsuario dentro do desktop pane
            TelaUsuario usuario = new TelaUsuario();
            usuario.setVisible(true);
            desktop.add(usuario);
        
    }//GEN-LAST:event_mnCaduserActionPerformed

    private void mnCadcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadcliActionPerformed
        // chamando a TelaCliente
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_mnCadcliActionPerformed

    private void mnCadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadosActionPerformed
        // Cgamando a tela OS
        TelaOS os = new TelaOS();
        os.setVisible(true);
        desktop.add(os);
    }//GEN-LAST:event_mnCadosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenuItem mnCadcli;
    private javax.swing.JMenuItem mnCados;
    public static javax.swing.JMenuItem mnCaduser;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenuItem mnHelpsobre;
    private javax.swing.JMenu mnOpcoes;
    private javax.swing.JMenuItem mnOpcoessair;
    public static javax.swing.JMenu mnRel;
    private javax.swing.JMenuItem mnRelservices;
    // End of variables declaration//GEN-END:variables
}

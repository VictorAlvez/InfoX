/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

/**
 *
 * @author User Victor Alves
 */
import br.com.infox.dal.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;

public class TelaUsuario extends javax.swing.JInternalFrame {

    Connection conexao = null;
//criando variáveis especiais para conexão com o banco
    PreparedStatement pst = null;
    /**
     * Prepared Statement e ResultSet são frameworks do pacote java.sql e servem
     * para preparar e executar as instruções SQL
     */
    ResultSet rs = null;

    /**
     * Creates new form TelaUsuario
     */
    public TelaUsuario() {
        initComponents();
        conexao = ModuloConexao.conector();

    }

    //método para consultar usuários
    private void consultar() {
        String sql = "select * from tbusuarios where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtfdID.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                txtfdNome.setText(rs.getString(2));
                txtfdFone.setText(rs.getString(3));
                txtfdLogin.setText(rs.getString(4));
                txtfdPass.setText(rs.getString(5));
                //a linha abaixo se refere ao combobox
                cboUserPerfil.setSelectedItem(rs.getString(6));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário inexistente.");
                //as linhas abaixo "limpam" os campos
                txtfdNome.setText(null);
                txtfdFone.setText(null);
                txtfdLogin.setText(null);
                txtfdPass.setText(null);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //método para adicionar usuário
    private void adicionar() {
        String sql = "insert into tbusuarios(iduser,usuario,fone,login,senha,perfil) values(?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtfdID.getText());
            pst.setString(2, txtfdNome.getText());
            pst.setString(3, txtfdFone.getText());
            pst.setString(4, txtfdLogin.getText());
            pst.setString(5, txtfdPass.getText());
            pst.setString(6, cboUserPerfil.getSelectedItem().toString());
            //validação dos campos obrigatórios
            //ctrl+space atalho para código
            if (txtfdID.getText().isEmpty() || (txtfdNome.getText().isEmpty()) || (txtfdLogin.getText().isEmpty() || (txtfdPass.getText().isEmpty()))) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
            } else {

                //a linha abaixo atualiza a tabela usuarios com os dados do formulário
                //a estrutura abaixo é usada para confirmar a inserção dos dados na tabela
                int adicionado = pst.executeUpdate();
                //a linha abaixo serve de apoio ao entendimento da lógica
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso.");
                    txtfdID.setText(null);
                    txtfdNome.setText(null);
                    txtfdFone.setText(null);
                    txtfdLogin.setText(null);
                    txtfdPass.setText(null);
                    //alt+shift+F identa todo o código
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //criando método para alterar dados do usuário
    private void alterar() {
        String sql = "update tbusuarios set usuario=?, fone=?, login=?, senha=?, perfil=? where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtfdNome.getText());
            pst.setString(2, txtfdFone.getText());
            pst.setString(3, txtfdLogin.getText());
            pst.setString(4, txtfdPass.getText());
            pst.setString(5, cboUserPerfil.getSelectedItem().toString());
            pst.setString(6, txtfdID.getText());

            if (txtfdID.getText().isEmpty() || (txtfdNome.getText().isEmpty()) || (txtfdLogin.getText().isEmpty() || (txtfdPass.getText().isEmpty()))) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
            } else {

                //a linha abaixo atualiza a tabela usuarios com os dados do formulário
                //a estrutura abaixo é usada para alterar os dados na tabela
                int adicionado = pst.executeUpdate();
                //a linha abaixo serve de apoio ao entendimento da lógica
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso.");
                    txtfdID.setText(null);
                    txtfdNome.setText(null);
                    txtfdFone.setText(null);
                    txtfdLogin.setText(null);
                    txtfdPass.setText(null);
                    //alt+shift+F identa todo o código
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //método responsável pela exclusão de usuários
    private void remover() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover esse usuário?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tbusuarios where iduser=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtfdID.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário removido com sucesso.");
                    txtfdID.setText(null);
                    txtfdNome.setText(null);
                    txtfdFone.setText(null);
                    txtfdLogin.setText(null);
                    txtfdPass.setText(null);
                }
            } catch (Exception e) {
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserId = new javax.swing.JLabel();
        txtUserNome = new javax.swing.JLabel();
        txtUserLogin = new javax.swing.JLabel();
        txtUserPass = new javax.swing.JLabel();
        txtUserPerfil = new javax.swing.JLabel();
        txtfdID = new javax.swing.JTextField();
        txtfdNome = new javax.swing.JTextField();
        txtfdLogin = new javax.swing.JTextField();
        txtfdPass = new javax.swing.JTextField();
        cboUserPerfil = new javax.swing.JComboBox<>();
        txtfdFone = new javax.swing.JTextField();
        txtUserFone = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnLer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");
        setPreferredSize(new java.awt.Dimension(520, 395));

        txtUserId.setText("*ID");

        txtUserNome.setText("*Nome");

        txtUserLogin.setText("*Login");

        txtUserPass.setText("*Senha");

        txtUserPerfil.setText("*Perfil");

        txtfdNome.setPreferredSize(new java.awt.Dimension(196, 24));

        txtfdLogin.setPreferredSize(new java.awt.Dimension(196, 24));

        cboUserPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));

        txtfdFone.setPreferredSize(new java.awt.Dimension(170, 24));

        txtUserFone.setText("Fone");

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/create-icon.png"))); // NOI18N
        btnAdicionar.setToolTipText("adicionar");
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(80, 50));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Documentos\\NetBeansProjects\\pjrInfoX\\src\\br\\com\\infox\\icones\\update-icon.png")); // NOI18N
        btnAtualizar.setToolTipText("editar");
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.setPreferredSize(new java.awt.Dimension(80, 50));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnApagar.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Documentos\\NetBeansProjects\\pjrInfoX\\src\\br\\com\\infox\\icones\\delete-icon.png")); // NOI18N
        btnApagar.setToolTipText("excluir");
        btnApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApagar.setPreferredSize(new java.awt.Dimension(80, 50));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnLer.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Documentos\\NetBeansProjects\\pjrInfoX\\src\\br\\com\\infox\\icones\\read-icon.png")); // NOI18N
        btnLer.setToolTipText("ler");
        btnLer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLer.setPreferredSize(new java.awt.Dimension(80, 50));
        btnLer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLerActionPerformed(evt);
            }
        });

        jLabel1.setText("* Campos obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUserNome)
                            .addComponent(txtUserId)
                            .addComponent(txtUserLogin)
                            .addComponent(txtUserPass)
                            .addComponent(txtUserFone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtfdNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfdFone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtfdPass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtfdLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(txtUserPerfil)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboUserPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtfdID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdicionar, btnApagar, btnAtualizar, btnLer});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserId))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfdPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserPass))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboUserPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserPerfil)
                    .addComponent(txtfdFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserFone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdicionar, btnApagar, btnAtualizar, btnLer});

        setBounds(0, 0, 520, 395);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLerActionPerformed
        // chamando o método consultar
        consultar();
    }//GEN-LAST:event_btnLerActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // chamando método adicionar
        adicionar();

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // chamando método alterar
        alterar();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // chamando método remover
        remover();
    }//GEN-LAST:event_btnApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnLer;
    private javax.swing.JComboBox<String> cboUserPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtUserFone;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserLogin;
    private javax.swing.JLabel txtUserNome;
    private javax.swing.JLabel txtUserPass;
    private javax.swing.JLabel txtUserPerfil;
    private javax.swing.JTextField txtfdFone;
    private javax.swing.JTextField txtfdID;
    private javax.swing.JTextField txtfdLogin;
    private javax.swing.JTextField txtfdNome;
    private javax.swing.JTextField txtfdPass;
    // End of variables declaration//GEN-END:variables
}

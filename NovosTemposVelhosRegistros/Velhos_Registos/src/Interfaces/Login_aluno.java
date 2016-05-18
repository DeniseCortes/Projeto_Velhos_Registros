/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Objetos_Conexao.Login;
import Objetos_Entidades.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author denise
 */
public class Login_aluno extends javax.swing.JFrame {

    
    public Login_aluno() {
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

        jPanel1 = new javax.swing.JPanel();
        Lbl_login = new javax.swing.JLabel();
        Lbl_senha = new javax.swing.JLabel();
        Text_login = new javax.swing.JTextField();
        Text_senha = new javax.swing.JTextField();
        Btn_confirmar = new javax.swing.JButton();
        Btn_cadastrar = new javax.swing.JButton();
        Btn_voltar = new javax.swing.JButton();
        Lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Aluno");
        setPreferredSize(new java.awt.Dimension(390, 379));

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        Lbl_login.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_login.setText("Login:");

        Lbl_senha.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_senha.setText("Senha:");

        Text_login.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        Text_senha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        Btn_confirmar.setBackground(new java.awt.Color(221, 226, 242));
        Btn_confirmar.setFont(new java.awt.Font("Sawasdee", 0, 16)); // NOI18N
        Btn_confirmar.setText("Entrar");
        Btn_confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_confirmar.setPreferredSize(new java.awt.Dimension(100, 35));
        Btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_confirmarActionPerformed(evt);
            }
        });

        Btn_cadastrar.setBackground(new java.awt.Color(221, 226, 242));
        Btn_cadastrar.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Btn_cadastrar.setText("Cadastrar");
        Btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_cadastrar.setPreferredSize(new java.awt.Dimension(100, 35));
        Btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cadastrarActionPerformed(evt);
            }
        });

        Btn_voltar.setBackground(new java.awt.Color(221, 226, 242));
        Btn_voltar.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Btn_voltar.setText("Voltar");
        Btn_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_voltar.setPreferredSize(new java.awt.Dimension(100, 35));
        Btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lbl_senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_login, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(Text_senha)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(Btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_login)
                    .addComponent(Text_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_senha)
                    .addComponent(Text_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        Lbl_titulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Lbl_titulo.setText("Bem vindo aluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Lbl_titulo)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Lbl_titulo)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //variavel que cotem o valor do nome que sera exibido na pagina inicial do aluno.
    pg_inicial_aluno enviarDados;
    
    private void Btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_confirmarActionPerformed
        String login = Text_login.getText();
        String senha = Text_senha.getText();
               
        ArrayList<Aluno> aluno = new ArrayList();
        Login lista = new Login();
        try {
            aluno = lista.loginAlunos(login, senha);            
            int cod = aluno.get(0).getCod_aluno();
            String nome = aluno.get(0).getNome();
            int faltas = aluno.get(0).getNum_faltas();
            String atestado = aluno.get(0).getAtestas_medico();
            String ficha = aluno.get(0).getFixa_medica();
            
            enviarDados = new pg_inicial_aluno();
            enviarDados.setVisible(true);
            enviarDados.ReceberDados(cod, nome, faltas, atestado, ficha);                        
            this.dispose();
        } catch (SQLException | IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this,"Erro! Login e/ou senha incorreto(s).",
                    "Erro ao fazer login", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Verifique se todos os campos de texto "
                    + "estão preenchidos.", "Erro ao fazer login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Btn_confirmarActionPerformed

    private void Btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cadastrarActionPerformed
        Cadastro_aluno cadastro = new Cadastro_aluno();
        cadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_cadastrarActionPerformed

    private void Btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_voltarActionPerformed
        TelaEscolhaLogin cancel =  new TelaEscolhaLogin();
        cancel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_voltarActionPerformed
    
    public void enviarLogin(int cod){
        String codigo = Text_login.getText();
        cod = Integer.parseInt(codigo);
    }
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
            java.util.logging.Logger.getLogger(Login_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_aluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_cadastrar;
    private javax.swing.JButton Btn_confirmar;
    private javax.swing.JButton Btn_voltar;
    private javax.swing.JLabel Lbl_login;
    private javax.swing.JLabel Lbl_senha;
    private javax.swing.JLabel Lbl_titulo;
    private javax.swing.JTextField Text_login;
    private javax.swing.JTextField Text_senha;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Objetos_Conexao.Atualizar;
import Objetos_Conexao.Listar;
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
public class Atualizar_aluno extends javax.swing.JFrame {

    /**
     * Creates new form Atualizar_aluno
     */
    public Atualizar_aluno() {
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

        Lbl_titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Btn_salvar = new javax.swing.JButton();
        Btn_voltar = new javax.swing.JButton();
        Lbl_senha = new javax.swing.JLabel();
        Lbl_nome = new javax.swing.JLabel();
        Text_senha = new javax.swing.JTextField();
        Text_nome = new javax.swing.JTextField();
        Text_atestado = new javax.swing.JTextField();
        Text_ficha = new javax.swing.JTextField();
        Lbl_atestado = new javax.swing.JLabel();
        Lbl_ficha = new javax.swing.JLabel();
        Lbl_cod = new javax.swing.JLabel();
        Text_cod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atualizar dados do aluno");

        Lbl_titulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Lbl_titulo.setText("Atualizar dados do aluno");

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        Btn_salvar.setBackground(new java.awt.Color(236, 236, 236));
        Btn_salvar.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Btn_salvar.setText("Salvar");
        Btn_salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_salvar.setPreferredSize(new java.awt.Dimension(100, 30));
        Btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_salvarActionPerformed(evt);
            }
        });

        Btn_voltar.setBackground(new java.awt.Color(236, 236, 236));
        Btn_voltar.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Btn_voltar.setText("Voltar");
        Btn_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_voltar.setPreferredSize(new java.awt.Dimension(100, 30));
        Btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_voltarActionPerformed(evt);
            }
        });

        Lbl_senha.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_senha.setText("Senha:");

        Lbl_nome.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_nome.setText("Nome:");

        Text_senha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Text_senha.setPreferredSize(new java.awt.Dimension(170, 27));
        Text_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_senhaActionPerformed(evt);
            }
        });

        Text_nome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Text_nome.setPreferredSize(new java.awt.Dimension(170, 27));

        Text_atestado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Text_atestado.setPreferredSize(new java.awt.Dimension(170, 27));

        Text_ficha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Text_ficha.setPreferredSize(new java.awt.Dimension(170, 27));

        Lbl_atestado.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_atestado.setText("Atestado médico:");

        Lbl_ficha.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_ficha.setText("Ficha médica:");

        Lbl_cod.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_cod.setText("Informe seu código de aluno: ");

        Text_cod.setFont(new java.awt.Font("Sawasdee", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Lbl_cod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Text_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lbl_senha)
                                .addComponent(Lbl_nome)
                                .addComponent(Lbl_atestado)
                                .addComponent(Lbl_ficha))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Text_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Text_atestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Text_ficha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Text_senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_cod)
                    .addComponent(Text_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_nome)
                    .addComponent(Text_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_senha)
                    .addComponent(Text_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_atestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_atestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_ficha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(Lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_senhaActionPerformed

    private void Btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_voltarActionPerformed
        ArrayList<Aluno> lista = new ArrayList();
        Listar lista_alunos = new Listar();
        pg_inicial_aluno pgAluno = new pg_inicial_aluno();
        try {
            lista = lista_alunos.listarAlunos();
            int cod = lista.get(1).getCod_aluno();
            String nome = lista.get(1).getNome();
            int faltas = lista.get(1).getNum_faltas();
            String atestado = lista.get(1).getAtestas_medico();
            String ficha = lista.get(1).getFixa_medica();
            pgAluno.setVisible(true);
            pgAluno.ReceberDados(cod, nome, 0, atestado, ficha);
            this.dispose();
        } catch (SQLException | IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cancelar a alteração dos dados do aluno.");
        }
             
    }//GEN-LAST:event_Btn_voltarActionPerformed
   
    private void Btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_salvarActionPerformed
        pg_inicial_aluno pgAluno = new pg_inicial_aluno();
        
        String cod = Text_cod.getText();
        String senha = Text_senha.getText();
        String nome = Text_nome.getText();
        String atestado = Text_atestado.getText();
        String ficha = Text_ficha.getText();
                  
        Atualizar atualiza = new Atualizar();
        try {
            atualiza.Atualizar_Aluno(
                    Integer.parseInt(cod),
                    Integer.parseInt(senha),
                    nome,
                    atestado,
                    ficha);
            JOptionPane.showMessageDialog(this, "Dados Alterados com sucessos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados do aluno.");
        }
        
       // pgAluno.setVisible(true);
       // pgAluno.ReceberDados(Integer.parseInt(cod), nome, 0, atestado, ficha);
        this.dispose();
    }//GEN-LAST:event_Btn_salvarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Atualizar_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atualizar_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atualizar_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atualizar_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atualizar_aluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_salvar;
    private javax.swing.JButton Btn_voltar;
    private javax.swing.JLabel Lbl_atestado;
    private javax.swing.JLabel Lbl_cod;
    private javax.swing.JLabel Lbl_ficha;
    private javax.swing.JLabel Lbl_nome;
    private javax.swing.JLabel Lbl_senha;
    private javax.swing.JLabel Lbl_titulo;
    private javax.swing.JTextField Text_atestado;
    private javax.swing.JTextField Text_cod;
    private javax.swing.JTextField Text_ficha;
    private javax.swing.JTextField Text_nome;
    private javax.swing.JTextField Text_senha;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

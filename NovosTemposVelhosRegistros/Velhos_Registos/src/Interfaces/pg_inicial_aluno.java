/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author denise
 */
public class pg_inicial_aluno extends javax.swing.JFrame {

    /**
     * Creates new form pg_inicial_aluno
     */
    public pg_inicial_aluno() {
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
        Btn_atualiza = new javax.swing.JButton();
        Btn_sair = new javax.swing.JButton();
        Lbl_nome = new javax.swing.JLabel();
        Lbl_valor_nome = new javax.swing.JLabel();
        Lbl_cod = new javax.swing.JLabel();
        Lbl_numFaltas = new javax.swing.JLabel();
        Lbl_atestado = new javax.swing.JLabel();
        Lbl_ficha = new javax.swing.JLabel();
        Lbl_valor_cod = new javax.swing.JLabel();
        Lbl_valor_numFaltas = new javax.swing.JLabel();
        Lbl_valor_atestado = new javax.swing.JLabel();
        Lbl_valor_ficha = new javax.swing.JLabel();
        Lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área do usuário");

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        Btn_atualiza.setBackground(new java.awt.Color(221, 226, 242));
        Btn_atualiza.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Btn_atualiza.setText("Atualizar dados");
        Btn_atualiza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_atualiza.setPreferredSize(new java.awt.Dimension(130, 37));
        Btn_atualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_atualizaActionPerformed(evt);
            }
        });

        Btn_sair.setBackground(new java.awt.Color(221, 226, 242));
        Btn_sair.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Btn_sair.setText("Sair");
        Btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_sair.setPreferredSize(new java.awt.Dimension(130, 37));
        Btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sairActionPerformed(evt);
            }
        });

        Lbl_nome.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_nome.setText("Nome:");

        Lbl_valor_nome.setBackground(new java.awt.Color(231, 217, 203));
        Lbl_valor_nome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Lbl_valor_nome.setPreferredSize(new java.awt.Dimension(170, 27));

        Lbl_cod.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_cod.setText("Código de aluno:");

        Lbl_numFaltas.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_numFaltas.setText("Faltas:");

        Lbl_atestado.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_atestado.setText("Atestado médico:");

        Lbl_ficha.setFont(new java.awt.Font("Sawasdee", 0, 15)); // NOI18N
        Lbl_ficha.setText("Ficha médica:");

        Lbl_valor_cod.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        Lbl_valor_numFaltas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        Lbl_valor_atestado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        Lbl_valor_ficha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_atualiza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_nome)
                            .addComponent(Lbl_cod)
                            .addComponent(Lbl_numFaltas)
                            .addComponent(Lbl_atestado)
                            .addComponent(Lbl_ficha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lbl_valor_atestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_valor_numFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_valor_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(Lbl_valor_cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Lbl_valor_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lbl_valor_cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_valor_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_numFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lbl_valor_numFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_atestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lbl_valor_atestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_ficha)
                    .addComponent(Lbl_valor_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_atualiza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        Lbl_titulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Lbl_titulo.setText("Seja bem vindo aluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(Lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Lbl_titulo)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_atualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_atualizaActionPerformed
        Atualizar_aluno atualiza = new Atualizar_aluno();
        atualiza.setVisible(true);
       // this.setVisible(false);
    }//GEN-LAST:event_Btn_atualizaActionPerformed

    private void Btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sairActionPerformed
        TelaEscolhaLogin voltar = new TelaEscolhaLogin();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_sairActionPerformed
    
    public void ReceberDados(int cod, String nome, int faltas, String atestado, String ficha){
        Lbl_valor_cod.setText(Integer.toString(cod));
        Lbl_valor_nome.setText(nome);
        Lbl_valor_numFaltas.setText(Integer.toString(faltas));
        Lbl_valor_atestado.setText(atestado);
        Lbl_valor_ficha.setText(ficha);
    }
    
    public int enviarLogin(int cod){
        String codigo = Lbl_valor_cod.getText();
        cod = Integer.parseInt(codigo);
        return cod;
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
            java.util.logging.Logger.getLogger(pg_inicial_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pg_inicial_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pg_inicial_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pg_inicial_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg_inicial_aluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_atualiza;
    private javax.swing.JButton Btn_sair;
    private javax.swing.JLabel Lbl_atestado;
    private javax.swing.JLabel Lbl_cod;
    private javax.swing.JLabel Lbl_ficha;
    private javax.swing.JLabel Lbl_nome;
    private javax.swing.JLabel Lbl_numFaltas;
    private javax.swing.JLabel Lbl_titulo;
    private javax.swing.JLabel Lbl_valor_atestado;
    private javax.swing.JLabel Lbl_valor_cod;
    private javax.swing.JLabel Lbl_valor_ficha;
    private javax.swing.JLabel Lbl_valor_nome;
    private javax.swing.JLabel Lbl_valor_numFaltas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
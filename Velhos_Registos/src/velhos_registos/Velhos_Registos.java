package velhos_registos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Velhos_Registos extends JFrame implements ActionListener{
    
    public Velhos_Registos(){
        super("Aplicação para armazenar registros do ACORDI");
        
        InserirComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 265); // tamanho da tela
        
    }
    
    public void InserirComponentes(){
        JLabel LabelTitulo = new JLabel("Bem Vindo!");
        JLabel LabelSubTitulo = new JLabel("Escolha uma das opções de login abaixo");
        JButton ButtonAluno = new JButton("Aluno");
        JButton ButtonProfessor = new JButton("Professor");
        JButton ButtonCoordenador = new JButton("Coordenador");
        
        this.add(LabelTitulo);
        this.add(LabelSubTitulo);
        this.add(ButtonAluno);
        this.add(ButtonProfessor);
        this.add(ButtonCoordenador);
        
        this.setLayout(null);
        
        LabelTitulo.setLocation(140, 10);
        LabelTitulo.setSize(300, 40);
        
        LabelSubTitulo.setLocation(40, 40);
        LabelSubTitulo.setSize(330, 40);
        
        ButtonAluno.setLocation(110, 90);
        ButtonAluno.setSize(160, 30);
        
        ButtonProfessor.setLocation(110, 130);
        ButtonProfessor.setSize(160, 30);
        
        ButtonCoordenador.setLocation(110, 170);
        ButtonCoordenador.setSize(160, 30);
        
        LabelTitulo.setFont(new Font("Umpush", Font.ROMAN_BASELINE, 20));
        LabelSubTitulo.setFont(new Font("Ubuntu", Font.ROMAN_BASELINE, 14));
        ButtonAluno.setFont(new Font("Ubuntu", Font.ROMAN_BASELINE, 14));
        ButtonProfessor.setFont(new Font("Ubuntu", Font.ROMAN_BASELINE, 14));
        ButtonCoordenador.setFont(new Font("Ubuntu", Font.ROMAN_BASELINE, 14));
        
        ButtonAluno.setToolTipText("Você é aluno? então clique aqui.");
        ButtonProfessor.setToolTipText("Clique aqui se você é professor.");
        
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Velhos_Registos instancia = new Velhos_Registos();
        Connection con;
        Statement state;
        ResultSet resultado;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/novo","root","");
            state = con.createStatement();
            resultado = state.executeQuery("select * from aluno where nome like"+instancia.getName());
            
            while(resultado.next()){
                JOptionPane nome = new JOptionPane();
                nome.showMessageDialog(null,resultado.getString(1));
                
            
            }
        con.close();
        state.close();
        }
        catch(SQLException e){
            e.getMessage();
        }
        catch(ClassNotFoundException e){
            e.getMessage();
        }
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("eu")){
            
        }
       
    }
}    
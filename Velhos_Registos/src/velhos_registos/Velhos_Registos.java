package velhos_registos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
        setSize(400, 260); // tamanho da tela
        
    }
    
    public void InserirComponentes(){
        JLabel LabelTitulo = new JLabel("Escolha uma das opções de login abaixo");
        JRadioButton ButtonAluno = new JRadioButton("Aluno");
        JRadioButton ButtonProfessor = new JRadioButton("Professor");
        JRadioButton ButtonCoordenador = new JRadioButton("Coordenador");
        ButtonGroup GroupLogin = new ButtonGroup();
        JButton ButtonConfirma = new JButton("Confirmar");
        
        this.add(LabelTitulo);
        this.add(ButtonAluno);
        this.add(ButtonProfessor);
        this.add(ButtonCoordenador);
        this.add(ButtonConfirma);
        
        GroupLogin.add(ButtonAluno);
        GroupLogin.add(ButtonProfessor);
        GroupLogin.add(ButtonCoordenador);
        this.add(ButtonConfirma);
        
        this.setLayout(null);
        
        LabelTitulo.setLocation(40, 10);
        LabelTitulo.setSize(300, 40);
        
        ButtonAluno.setLocation(40, 50);
        ButtonAluno.setSize(175, 40);
        
        ButtonProfessor.setLocation(40, 80);
        ButtonProfessor.setSize(175, 40);
        
        ButtonCoordenador.setLocation(40, 110);
        ButtonCoordenador.setSize(175,40);
        
        ButtonConfirma.setLocation(130, 170);
        ButtonConfirma.setSize(130, 40);
        
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
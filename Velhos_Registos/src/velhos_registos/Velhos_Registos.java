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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Velhos_Registos extends JFrame implements ActionListener{
    
    public Velhos_Registos(){
        super("Aplicação para armazenar registros do ACORDI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(370, 270); // tamanho da tela
        
        JLabel login = new JLabel("Login:");
        JTextField nome = new JTextField();
        JLabel senha = new JLabel("Senha:");
        JPasswordField password = new JPasswordField(11);
        JButton ok = new JButton("Confimar");
                
        this.add(login);
        this.add(senha);
        this.add(nome);
        this.add(password);
        this.add(ok);
        
        nome.addActionListener(this);
        password.addActionListener(this);
        nome.setActionCommand("eu");
        password.setActionCommand("senha");
        
        this.setLayout(null);
        login.setLocation(40, 50);
        login.setSize(75, 30);
        
        nome.setLocation(100, 50);
        nome.setSize(180, 30);
        
        senha.setLocation(40, 100);
        senha.setSize(70, 30);
        
        password.setLocation(100, 100);
        password.setSize(180, 30);
        
        ok.setLocation(130, 160);
        ok.setSize(100, 40);
        
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
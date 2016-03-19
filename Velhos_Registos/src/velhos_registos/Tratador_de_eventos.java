package velhos_registos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Tratador_de_eventos implements ActionListener{
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Aluno")){
            Projeto_Login aluno = new Projeto_Login();
            aluno.setVisible(true);
        }
        
        if(e.getActionCommand().equals("Professor")){
            Projeto_Login prof = new Projeto_Login();
            prof.setVisible(true);
        }
    }
    
}

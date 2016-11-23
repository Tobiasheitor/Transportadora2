package transportadora.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class TransportadoraView {
    
    public static void main(String[] args) {
        TransportadoraView trans = new TransportadoraView();
        trans.transportadoraView();
    }
    
    public void transportadoraView(){
    
    JButton botaoCadastro = new JButton("CADASTRO");
    JButton botaoConsulta = new JButton("CONSULTA");
    
    JPanel painel = new JPanel();
    // A ORDEM IMPORTA
    painel.add(botaoCadastro);
    painel.add(botaoConsulta);
    
    JFrame janela = new JFrame("transportadora");
    janela.add(painel);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ///operação termina
    janela.pack(); ///organiza o Frame pra o menor espaço possível
    janela.setVisible(true);
    }
}
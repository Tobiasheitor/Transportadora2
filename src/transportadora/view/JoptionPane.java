/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.view;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class JoptionPane {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
    int retorno = fileChooser.showOpenDialog(null);

    if (retorno == JFileChooser.APPROVE_OPTION) {
      File file = fileChooser.getSelectedFile();
      // faz alguma coisa com arquivo
    } else {
      // dialogo cancelado
    }
    }
}

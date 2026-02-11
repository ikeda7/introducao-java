/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import View.TelaPrincipal;
import com.formdev.flatlaf.FlatDarkLaf;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author lukin
 */
public class Cadastro {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, IOException, FileNotFoundException, ClassNotFoundException {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } finally {
           TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true); 
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion34marcialed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author LISUACM
 */
public class Sesion34MarcialED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Stack<Integer> pilaMarcial= new Stack<>();
pilaMarcial.push(100);
pilaMarcial.push(150);
pilaMarcial.push(230);
pilaMarcial.push(10);
pilaMarcial.push(160);

        JOptionPane.showMessageDialog(null, "Datos de la pila orenada es:\n"+ pilaMarcial);
        JOptionPane.showMessageDialog(null, "Autor:Marcial");
        
        
    }
    
}

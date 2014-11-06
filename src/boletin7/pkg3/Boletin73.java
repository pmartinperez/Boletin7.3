
package boletin7.pkg3;

import javax.swing.JOptionPane;


public class Boletin73 {

    
    public static void main(String[] args) {
        Comparacion comparacion1 = new Comparacion();
        
        String respuesta = JOptionPane.showInputDialog("Introduce dato 1");
        short dato = Short.parseShort(respuesta);
        
        comparacion1.comparar(dato);
    }
    
}

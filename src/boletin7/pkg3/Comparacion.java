
package boletin7.pkg3;

import javax.swing.JOptionPane;


public class Comparacion {
    private double numero;
    
    public Comparacion(){
        
    }
    public void comparar(double num){
        if(num>0){
            JOptionPane.showMessageDialog(null, "+");
        }else if (num==0){
            JOptionPane.showMessageDialog(null, "0");
        }else{
            JOptionPane.showMessageDialog(null, "-");
        }
    }
}

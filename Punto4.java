/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        double radio;
        double area;
        double longitud;
        
        System.out.println("digite el valor del racdio de la circunferencia: ");
        radio=entrada.nextFloat();
        
        area=(float)Math.pow(radio,2)*Math.PI;
        longitud=2*Math.PI*radio;
        
        System.out.printf("el area de la circunferencia es %.2f\n ",(float)Math.pow(radio,2)*Math.PI);
        
        System.out.printf("la longitud de l circunferencia es %.2f\n ",(float)2*Math.PI*radio);
        // TODO code application logic here
    }
    
}

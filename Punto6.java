/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double peso;
        double altura;
        double BMI;
        
        System.out.println("digite el peso en kilogramos: ");
        peso = entrada.nextDouble();
        System.out.println("digite la altura en metros: ");
        altura=entrada.nextDouble();
        
        BMI= peso/Math.pow(altura,2);
        
        System.out.printf("el índice de masa corporal BMI es %.2f\n",peso/Math.pow(altura,2));
        
        
    }
    
}

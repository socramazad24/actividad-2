/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.pkg0;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("digite el primer numero: ");
        num1=entrada.nextInt();
        System.out.println("digite el segundo numero: ");
        num2=entrada.nextInt();
        
        System.out.printf("num1 = %d\n", num1 );
        
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, ( num1 + num1 ) );
        
        System.out.printf("num1=%.2f", num1 );
         
        System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) );
    }
    
}

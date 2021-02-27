/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int num1;
        int num2;
        int suma;
        int resta;
        int producto;
        
        System.out.println("digite el primer numero entero: ");
        num1 = entrada.nextInt();
        
        System.out.println("digite el segundo numero entero: ");
        num2 = entrada.nextInt();
        
        suma= num1+num2;
        resta = num1-num2;
        producto= num1*num2;
        
        System.out.printf("la suma entre %d y %d es igual a %d \n",num1, num2, num1+num2);
        
        System.out.printf("la diferencia entre %d y %d es igual a %d \n",num1, num2, num1-num2);
        
        System.out.printf("el producto entre %d y %d es igual a %d \n",num1, num2, num1*num2);
        // TODO code application logic here
    }
    
}

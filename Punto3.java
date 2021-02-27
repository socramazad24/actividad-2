/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        float num1;
        float num2;
        float num3;
        float suma;
        float promedio;
        float producto;
        float cociente;
        float modulo;
        
        System.out.println("digite el primer numero decimal: ");
        num1 = entrada.nextFloat();
        
        System.out.println("digite el segundo numero decimal: ");
        num2 = entrada.nextFloat();
        
        System.out.println("digite el tercer numero decimal: ");
        num3=entrada.nextFloat();
        
        suma=num1+num2+num3;
        promedio = (num1+num2+num3) / 3;
        producto = num1*num2*num3;
        cociente = num1/num2/num3;
        modulo = num1%num2%num3;
        System.out.printf("la suma de %f , %f y %f es igual a %.2f\n ", num1, num2, num3,num1+num2+num3);
        
        System.out.printf("el promedio de %f , %f y %f es igual a %.2f\n", num1, num2, num3,(num1+num2+num3)/3);

        System.out.printf("el producto de %f , %f y %f es igual a %.2f\n ", num1, num2, num3,num1*num2*num3);

        System.out.printf("el cociente de %f , %f y %f es igual a %.2f\n ", num1, num2, num3,num1/num2/num3);

        System.out.printf("el modulo de %f , %f y %f es igual a %.2f\n ", num1, num2, num3,num1%num2%num3);

    }
}

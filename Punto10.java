/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10;
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
        Scanner entrada = new Scanner (System.in);
        
        float peso;
        float gramos;
        float libras;
        float toneladas;
        
        System.out.println("digite el peso en kilogramos: ");
        peso=entrada.nextFloat();
        
        gramos=(float)peso*1000;
        libras=(float)(peso*2.205);
        toneladas=peso/1000;
        
        System.out.printf("%.2f kilogramos en gramos son %.2f\n",peso,gramos);
        System.out.printf("%.2f kilogramos en libras son %.2f\n",peso,libras);
        System.out.printf("%.2f kilogramos en toneladas son %.2f\n",peso,toneladas);
        
    }
    
}

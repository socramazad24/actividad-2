/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto9;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class Punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        
        int N_dias;
        int KM_dia;
        int gasolina;
        int KM_LT_gasolina;
        int peaje;
        int valortotal;
        
        System.out.println("dias que dura el viaje: ");
        N_dias=entrada.nextInt();
        
        System.out.println("kilometros por dia: ");
        KM_dia=entrada.nextInt();
        
        System.out.println("valor de gasolina: ");
        gasolina=entrada.nextInt();
        
        System.out.println("kilometros por litro de gasolina: ");
        KM_LT_gasolina=entrada.nextInt();
        
        System.out.println("valor de peaje: ");
        peaje=entrada.nextInt();
        
        int KM_total=N_dias*KM_dia;
        int KM_LT_gasolina_total=KM_total*KM_LT_gasolina;
        int gasolina_total=gasolina*KM_LT_gasolina_total;
       
        
        System.out.printf("el peaje tuvo un valor de %d y se gastó %d en gasolina, que hace un total de %d gastado en el viaje\n",peaje,gasolina_total,gasolina_total+peaje);
    }
    
}

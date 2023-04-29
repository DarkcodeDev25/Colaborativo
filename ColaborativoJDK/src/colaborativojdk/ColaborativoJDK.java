/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colaborativojdk;

import java.util.Scanner;

public class ColaborativoJDK {


    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        
        double n1,n2,n3, prom;
        
        System.out.print("ingrese primera nota: ");
        n1=entrada.nextDouble();
        System.out.print("Ingrese 2da nota: ");
        n2=entrada.nextDouble();
        System.out.print("Ingrese 3era nota: ");
        n3=entrada.nextDouble();

        prom=(n1+n2+n3)/3;
        
        System.out.println("Promedio general es : " + prom);

        entrada.close();    
        
        
        
        
        
    }
    
}

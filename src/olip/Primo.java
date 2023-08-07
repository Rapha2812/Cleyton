/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author 16985763669
 */

package olip;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        
        int num;
        int d; //Divisor
        Scanner ler = new Scanner(System.in);
        boolean primo = true; //O número começa primo 
        
        System.out.println("Informe um número: ");
        num = ler.nextInt();
        
        for(d = 2; d < num; d++){ 
            if(num % d == 0){ //Se o número não for primo
                primo = false;                
            }
        } 
        if(primo){ //Se eo código "for" for executado (primo = verdadeiro
            System.out.println("Primo :)");
        }else{ //Se o código "for" for executado (primo = false)
            System.out.println("Irmão :(");
        }
    }
}

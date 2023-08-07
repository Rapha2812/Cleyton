/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author 16985763669
 --> Esse código deve pegar um número, descobrir se ele é primo e calcular seu fatorial 
 */
package olip;

import java.util.Scanner;
 
public class Iniciante {
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
            int fatorial = 1;
            for (int i = 1; i <= num; i++){
                fatorial = fatorial * i; //1 * 1, 1 * 2, 2 * 3, 6 * 4, 24 * 5 ...
            }
            System.out.println(fatorial);
        }else{ //Se o código "for" for executado (primo = false)
            System.out.println("Irmão :(");
        }
       
    }
}

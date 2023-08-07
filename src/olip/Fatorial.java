/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author 16985763669
 --> Seu problema é bastante simples: dado um número N, encontre o número de zeros à direita de seu fatorial na base 10.
 */

package olip;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.println("Informe um número: ");
        num = ler.nextInt();
        
        int fatorial = 1;
        for (int i = 1; i <= num; i++){
            fatorial = fatorial * i; //1 * 1, 1 * 2, 2 * 3, 6 * 4, 24 * 5 ...
        }
        System.out.println(fatorial);
        
    }
}

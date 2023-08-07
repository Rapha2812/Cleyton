/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olip;

import java.util.Scanner;

/**
 *
 * @author 16985763669
 */
public class Pa {
    public static void main(String[] args) {
        int v1, v2, v3, n;
        int razao;
        int resul;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        v1 = scanner.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        v2 = scanner.nextInt();
        
        System.out.println("Informe o terceiro valor: ");
        v3 = scanner.nextInt();
        
        System.out.println("Informe a quantidade de termos: ");
        n = scanner.nextInt();
        
        razao = v2 - v1;
        
        resul = v1 + (n - 1) * razao;
        
        System.out.println("O resultado é: " + resul);
        
    }
}

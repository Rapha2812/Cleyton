/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author 16985763669
 */
package olip;

import java.util.Arrays;


public class Potato {
    
    public static void main(String[] args) {
        String texto = String.valueOf(102300400); //Converte um número (int, double...) para String
        String[] l = texto.split("");  //Cria uma array L que 
        System.out.println(Arrays.toString(l)); // 
        
        int cont = 0;
        
        for (int i = 0; i < l.length; i++) { //Enquanto i for menor que x caracteres
            if (l[i].equals("0")) { // Posição: Se a o número (espaço do vetor) for igual a 0 
                cont++; //Contador aumenta um número
            }
        }
        System.out.println(cont);
       
        /*int comFuncao = countZeros(10230000);
        System.out.println(comFuncao);*/

    }

    /*static int countZeros(int n) {
        int count = 0;
        while (n % 10 == 0) {
            count++;
            n /= 10;
        }
        return count;*/
    }


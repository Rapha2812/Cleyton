/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olip;

import java.util.Scanner;

public class Cafe
{
    public static void main(String[] args) {
        int qtde_inicial;
        int nathan;
        int samuel;
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Informe quantos cupcakes têm no prato de Nathan: ");
        qtde_inicial = ler.nextInt();
       
        System.out.println("Informe quantos cupcakes Nathan pegou: ");
        nathan = ler.nextInt();
       
        System.out.println("Informe quantos cupcakes Samuel pegou: ");
        samuel = ler.nextInt();
       
        if(nathan == qtde_inicial){
            System.out.println("Tudo bem");
        }else if(nathan != qtde_inicial && samuel == qtde_inicial){
            System.out.println("Pegou de Samuel");
        }else if(nathan != qtde_inicial && samuel != qtde_inicial){
            System.out.println("Pegou de um estranho");
        }
       
    }
}


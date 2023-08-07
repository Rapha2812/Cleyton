/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olip;

import java.util.Scanner;

public class Elevador
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n; //Quantidade de testes
        int m; // ligado ou desligado
        int a1, a2, a3;
       
        System.out.println("Sejam bem-vindos à resolução do exercício do elevador!");
        System.out.println("A entrada de dados nesse algoritmo baseia-se em 1 para respostas positivas e 0 para respostas negativas!");
        System.out.println("Espero que a resolução do exercício esteja satisfatória :)");
       
        System.out.print("Informe a quantidade de testes: ");
        n = ler.nextInt();
       
        for(int i = 1; i <= n; i++){
            System.out.print("Informe se o elevador está em movimento: ");
            m = ler.nextInt();
           
            if(m == 1){ //Se o elevador estiver em movimento
                System.out.println("A porta do elevador não pode abrir se ele estiver em movimento :P");
                System.out.println("0");
               
            }else if(m == 0){ //Se ele estiver parado
                System.out.print("Informe se o elevador está parado no 1° andar: ");
                a1 = ler.nextInt();
                System.out.print("Informe se o elevador está parado no 2° andar: ");
                a2 = ler.nextInt();
                System.out.print("Informe se o elevador está parado no 3° andar: ");
                a3 = ler.nextInt();
               
                if(a1 == 0 && a1 == a2 && a1 == a3){ //Se ele estiver empacado entre andares
                    System.out.println("0"); //Porta não abre
                }else if(a1 == 1 && a2 == 0 && a3 == 0){
                    System.out.println("1"); //A porta abre
                }else if(a1 == 0 && a2 == 1 && a3 == 0){
                    System.out.println("1"); //A porta abre
                }else if(a1 == 0 && a2 == 0 && a3 == 1){
                    System.out.println("1"); //A porta abre
                } //Agora o teste pra ver se o elevador tá com defeito
                else if(a1 == 1 && a2 == 1 && a3 == 0){
                    System.out.println("0"); //A porta não abre
                }else if(a1 == 1 && a2 == 0 && a3 == 1){
                    System.out.println("0"); //A porta não abre
                }else if(a1 == 1 && a2 == 1 && a3 == 0){
                    System.out.println("0"); //A porta não abre
                }else if(a1 == 1 && a2 == 1 && a3 == 1){
                    System.out.println("0"); //A porta não abre
                }
            }    
        }
    }
}

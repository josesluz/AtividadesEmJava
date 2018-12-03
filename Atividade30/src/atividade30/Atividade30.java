
package atividade30;

import java.util.Scanner;

public class Atividade30 {

       public static void main(String[] args) {
    
//Declaração de variaveis    
    int num1, num2, num3, num2Temp;
    
    Scanner numero = new Scanner(System.in);
    
           System.out.println("Digite o primeiro número: ");
           num1 = numero.nextInt();
           
           System.out.println("Digite o segundo número: ");
           num2 = numero.nextInt();
           while (num2 == num1){
            System.out.println("Digite um valor não digitado anteriormente: ");
            num2 = numero.nextInt();
           }
           
           System.out.println("Digite o terceiro número: ");
           num3 = numero.nextInt();
           while ((num3 == num1) || (num3 == num2)){
            System.out.println("Digite um valor não digitado anteriormente: ");
            num3 = numero.nextInt();
           }
           System.out.println("Números digitados: "+ num1 +" "+ num2 +" "+ num3);
       }
}

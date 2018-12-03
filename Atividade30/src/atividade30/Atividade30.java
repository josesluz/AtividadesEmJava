
package atividade30;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade30 {

       public static void main(String[] args) {
    
//Declaração de variaveis
    Scanner numero = new Scanner(System.in);
    int num1, num2, num3, num2Temp;
    int[] numerosLista = new int[4];

    for (int i = 1; i < numerosLista.length; i++) 
	           {
		           System.out.print("Digite "+ i + "° numeros: ");
		           numerosLista[i] = (numero.nextInt());
                           while (numero == numerosLista){
                           System.out.print("Digite "+ i + "° numeros correto: ");
		           numerosLista[i] = (numero.nextInt());
                               
                           }
                   }
		       }

// Ordena o Array em ordem crescente
    Arrays.sort(numerosLista);

// Imprime o Array em ordem crescente
    System.out.print("Ordem crescente:    "); 
    for (int j = 1; j < numerosLista.length; j++) 
    {
        System.out.print(numerosLista[j]+ "  ");       		
    }
    
    
    
    
    
    /*       System.out.println("Digite o primeiro número: ");
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

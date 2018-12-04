/*
 * 14) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
 * contrário escrever NÃO É MAIOR QUE 10!
 */
package atividade14;

import java.util.Scanner;

public class Atividade14 {

    public static void main(String[] args) {
        int numero;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = num.nextInt();
    
        if (numero > 10){
            System.out.println(" É MAIOR QUE 10");
        } else if (numero < 10){
            System.out.println("NÃO É MAIOR QUE 10");
        }
    }
    
}

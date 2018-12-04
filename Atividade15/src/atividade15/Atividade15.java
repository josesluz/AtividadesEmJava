/*
 * 15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)
 */
package atividade15;

import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
        int numero;
        
        Scanner num= new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = num.nextInt();
        
        if (numero < 0 ){
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
    }
        
}

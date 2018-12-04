/*
*
12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo):

  C      F - 32
----- = --------
  5        9

Observação: Para testar se a sua resposta está correta saiba que 100 o C = 212F
*
 */
package atividade12;

import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {

// Declação de variáveis
Scanner grausF = new Scanner(System.in);
int grausCelcius, grausCFormula;

//Entrada de dados, recebe numero em Fahrenheit e converte para Celcius
System.out.println("Digite o valor em Fahrenheit: ");
grausCelcius = grausF.nextInt();
grausF = grausCelcius;

grausCFormula = ((grausF-32) / 1.8);



        System.out.println(grausCelcius);


    }
    
}

package atividade33;

import java.util.Scanner; // 1. importando a classe Scanner
 
public class Atividade33 {
 
  public static void main(String[] args) {
// Instanciando e criando um objeto Scanner
    Scanner ler = new Scanner(System.in);

//Definição de variáveis 
    int num1, num2;

//Entrada de dados (valores inteiros)
    System.out.println("Informe o primeiro número:");
    num1 = ler.nextInt(); // 3.1 entrada de dados (lendo um valor inteiro)
 
    System.out.println("Informe o segundo número:");
    num2 = ler.nextInt(); // 3.1 entrada de dados (lendo um valor inteiro)
    
//Comparando se os números digitados são iguais, maior ou menor e imorimindo na tela.
    if (num1 == num2) {
        System.out.println("Números iguais");
    } else if (num1 > num2){
        System.out.println("Primeiro é maior");
    } else {
        System.out.println("Segundo é maior");
    }
    
   }
}
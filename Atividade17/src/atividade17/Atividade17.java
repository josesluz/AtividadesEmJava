/*
 * 17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
 * uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
 * aluno é aprovado). Escrever também a média calculada
 */
package atividade17;

import java.util.Scanner;

public class Atividade17 {

    public static void main(String[] args) {
    //Declaração de variáveis
        float av1, av2, calcMedia;
        Scanner ava1 = new Scanner(System.in);
        Scanner ava2 = new Scanner(System.in);
    
    //Entrada de dados    
        System.out.println("Digite a nota da Avaliação 1: ");
        av1 = ava1.nextFloat();
        System.out.println("Digite a nota da Avaliação 2: ");
        av2 = ava2.nextFloat();
    
    //Formula de calculo da media    
        calcMedia = ((av1+av2)/2);
    
    //Comparação para se a nota for menor ou maior que 6
        if (calcMedia >= 6){
        System.out.println("O aluno foi aprovado com a média "+calcMedia);
        } else {
        System.out.println("O aluno foi reprovado com a média "+calcMedia);
        }
    }
    
}

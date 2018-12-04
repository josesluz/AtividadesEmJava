/*
 * 18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
 * poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
 */
package atividade18;

import java.util.Scanner;

public class Atividade18 {

    public static void main(String[] args) {
        int anoAtual, anoNascimento, idade;
        
        Scanner anoAtualS = new Scanner(System.in);
        Scanner anoNascimentoS = new Scanner(System.in);
        
        System.out.println("Digite o ano atual: ");
        anoAtual = anoAtualS.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = anoNascimentoS.nextInt();
        
        idade = (anoAtual-anoNascimento);
        
        if (idade >= 16){
            System.out.println("O cidadão poderá votar");
        } else {
            System.out.println("O cidadão não poderá votar");
        }
        
    }
    
}

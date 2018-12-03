
package atividade32;

import java.util.Scanner;

public class Atividade32 {

    public static void main(String[] args) {
        
        Scanner nomeTime = new Scanner(System.in);
        Scanner golTime = new Scanner(System.in);

        
        int golTime1, golTime2;
        String nomeTime1, nomeTime2;
        
        System.out.println("Digite o nome do time: ");
        nomeTime1 = nomeTime.next();
        
        System.out.println("Informa o nome do outro time: ");
        nomeTime2 = nomeTime.next();
        
        System.out.println("Digite a quantidade de gols do "+nomeTime1+":");
        golTime1 = golTime.nextInt();
        System.out.println("Digite a quantidade de gols do "+nomeTime2+":");
        golTime2 = golTime.nextInt();

        if (golTime1 > golTime2) {
            System.out.println("O "+nomeTime1+" é o vencedor!");
        } else if (golTime2 < golTime1) {
            System.out.println("O "+nomeTime2+" é o vencedor!");
        } else {
            System.out.println("Não houve vencedor, houve empate entre os time "+nomeTime1+" e "+nomeTime2+"!");
        }
        
    }
    
}

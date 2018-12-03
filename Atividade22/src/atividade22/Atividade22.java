package atividade22;

import java.util.Scanner;

public class Atividade22 {

    public static void main(String[] args) {
        Scanner qntHoras = new Scanner(System.in);
        
        double valorHora = 9.375;
        double valorHoraExtra = ((valorHora+(valorHora * 0.50)));
        int jornadaSemanal = 40;
        int semanas = 4;
        double horaExtraSemanal;
        System.out.println(valorHoraExtra);
        
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double qtnHoras = qntHoras.nextDouble();
        System.out.println("O valor a receber é de "+valorHoraExtra*50);
        
        

    }
    
}

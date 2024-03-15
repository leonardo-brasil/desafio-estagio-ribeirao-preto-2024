package com.desafio.questao2;

import java.util.Scanner;

public class Main {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Digite um numero, inteiro, para verificar se está presente na sequência de Fibonacci: ");
        int num = entrada.nextInt();

        int x = 0;
        int y = 1;
        int indiceSequencia = 2;
        boolean repeat = true;

        System.out.printf("Sequencia: %d %d", x, y);
        while(repeat) {

            indiceSequencia++;
            int aux = x + y;
            System.out.print(" " + aux);
            x = y;
            y = aux;

            if(num == aux) {
                System.out.printf("\n[INFO] O numero digitado {%d} foi encontrado na sequência na posicao %d!", num, indiceSequencia);
                repeat = false;
            } else if(aux > num) {
                System.out.print("\n[INFO] O numero digitado não foi encontrado na sequência de Fibonacci!");
                repeat = false;
            }

        }

        Main.entrada.close();

    }

}

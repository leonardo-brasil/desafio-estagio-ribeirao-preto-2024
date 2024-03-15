package com.desafio.questao5;

import java.util.Scanner;

public class Main {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Digite a string que deseja inverter os caracteres: ");
        String string = entrada.next(); // o método "entrada.next()" não aceita string com espaços vazios, se desejar colocar mais de uma palavra substitua pelo método "entrada.nextLine()"

        StringBuilder sb = new StringBuilder();

        for(int i = (string.length() - 1); i >= 0; i--) {
            sb.append(string.charAt(i));
        }

        System.out.printf("String {%s} com os caracteres invertidos: %s", string, sb.toString());

        Main.entrada.close();

    }

}

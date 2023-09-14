package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Imprimindo variáveis
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        int y = 32;
        double x = 10.35784;
        System.out.println (y);
        System.out.println (x);

        //Imprimindo formatando com 2 casas decimais (quebra de linha>%.2f%n)
        // decimal com virgula x ponto (comando Locale.setDefault(Locale.US) - "importar import Java.util.Locale"
        System.out.printf ("%.2f%n" , x);
        Locale.setDefault(Locale.US);
        System.out.printf ("%.2f%n" , x);

        //Concatenar vários elementos em um mesmo comando <%f = ponto flutuante / %n = quebra de linha / %d = inteiro / %s = texto>
        //printf = formatado
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf ("Resultado = %.2f metros%n" , x);
        System.out.printf ("%s tem %d anos e ganha R$ %.2f reais%n" , nome, idade, renda);

    }
}

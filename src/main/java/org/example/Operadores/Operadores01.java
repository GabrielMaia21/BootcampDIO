package org.example.Operadores;

import java.util.Date;

public class Operadores01 {
    public static void main(String[] args) {
        //Representado pelo símbolo de igualdade "=".
        //classe Operadores.java
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();


        //Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
        //classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);


        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);


    }
}

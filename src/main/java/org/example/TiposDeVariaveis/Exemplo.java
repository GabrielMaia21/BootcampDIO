package org.example.TiposDeVariaveis;

public class Exemplo {
    public static void main(String[] args) {

        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

        byte idade2 = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;
        //o fato de existir a possibiliadade do valor de numeroNormal ultrapassar os limites
        // do tipo short ja é o suficiente para o java quebrar o codigo
        //precisamos fazer um casting

        int numero = 5;
        numero = 10;

        System.out.print(numero);

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor;
         * logo a linha 25 vai apresentar um erro de compilação
         * isso é considerado uma CONSTANTE na linguagem Java
         */
        final double VALOR_DE_PI = 3.14;

        //VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
    }
}

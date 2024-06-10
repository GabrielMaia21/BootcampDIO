package org.example.Operadores;

public class Operadores02 {
    public static void main(String[] args) {
        /*(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

        (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.
         */
        int numero = 5;
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
    }


}

package org.example.AnatomiaDasClasses;

public class MinhaClasse {
    //Aprendendo variaveis e metodos
    public static void main(String[] args) {
        String primeiroNome = "Gabriel";
        String segundoNome = "Maia";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

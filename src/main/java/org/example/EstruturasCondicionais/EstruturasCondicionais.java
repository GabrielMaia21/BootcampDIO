package org.example.EstruturasCondicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        //if
        //if else
        double saldo = 230.0;
        double valorSolicitado = 30.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }else {
            System.out.println("Saldo Inválido");
        }

        //condição ternaria
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    }
}

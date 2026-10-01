package main.java.loja.application.test;

import main.java.loja.sementes.Semente;
import main.java.loja.sementes.inverno.MelaoPoeira;
import main.java.loja.sementes.outono.Abobora;
import main.java.loja.sementes.primavera.Batata;
import main.java.loja.sementes.primavera.Chirivia;
import main.java.loja.sementes.primavera.Morango;
import main.java.loja.sementes.verao.Melao;
import main.java.loja.sementes.verao.Mirtilo;
import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;

public class TesteSementes {

    public static void main(String[] args) {

        Abobora abobora = new Abobora();
        Chirivia chirivia = new Chirivia();
        Mirtilo mirtilo = new Mirtilo();
        Batata batata = new Batata();
        Morango morango = new Morango();
        Melao melao = new Melao();
        MelaoPoeira melaoPoeira = new MelaoPoeira();

        System.out.println("----------------------------------");
        System.out.println("\nDepois do bloco de inicialização\n");
        System.out.println("----------------------------------");

        System.out.println(abobora);
        System.out.println(chirivia);
        System.out.println(mirtilo);
        System.out.println(batata);
        System.out.println(morango);
        System.out.println(melao);
        System.out.println(melaoPoeira);

        Semente semente = new Semente(Estacao.OUTONO, new Moeda(400)) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }
}

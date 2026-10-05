package main.java.loja.application.test;

import main.java.loja.domain.loja.Compra;
import main.java.loja.domain.loja.Estoque;
import main.java.loja.sementes.Semente;
import main.java.loja.sementes.outono.Abobora;
import main.java.loja.sementes.primavera.Morango;
import main.java.loja.sementes.verao.Melao;

public class PolimorfismoTeste {

    public static void main(String[] args) {

        Semente abobora = new Abobora();
        Semente morango = new Morango();
        Semente melao = new Melao();

        Estoque estoque = new Estoque();

        estoque.adicionar(abobora, 30);
        estoque.adicionar(morango, 20);
        estoque.adicionar(melao, 30);
        estoque.exibirEstoque();

        Compra compra = new Compra();

        compra.conversao(abobora, 20);
        System.out.println(compra);

        System.out.println(abobora.getValor());

        compra.conversao(melao, 400);


    }
}

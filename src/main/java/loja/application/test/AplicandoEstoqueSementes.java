package main.java.loja.application.test;

import main.java.loja.domain.loja.Estoque;
import main.java.loja.sementes.primavera.Morango;
import main.java.loja.sementes.verao.Melao;

public class AplicandoEstoqueSementes {

    public static void main(String[] args) {
        Morango morango = new Morango();
        Melao melao = new Melao();

        Estoque estoque = new Estoque();

        estoque.adicionar(melao, 50);
        estoque.adicionar(morango, 30);

        estoque.remover(melao, 10);
        estoque.exibirEstoque();

    }
}

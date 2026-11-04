package main.java.loja.application;

import main.java.loja.domain.loja.Estoque;
import main.java.loja.sementes.Semente;
import main.java.loja.sementes.outono.Abobora;
import main.java.loja.sementes.primavera.Batata;
import main.java.loja.sementes.primavera.Morango;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Semente abobora = new Abobora();
        Semente morango = new Morango();
        Semente batata = new Batata();


        estoque.adicionar(abobora, 40);
        estoque.adicionar(morango, 12);
        estoque.adicionar(batata, 10);
        estoque.exibirEstoque();

        estoque.remover(abobora, 40);

        estoque.exibirEstoque();
        estoque.adicionar(abobora, 20);
    }
}

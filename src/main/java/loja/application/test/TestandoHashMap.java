package main.java.loja.application.test;

import main.java.loja.domain.loja.Estoque;
import main.java.loja.sementes.Semente;
import main.java.loja.sementes.outono.Abobora;
import main.java.loja.sementes.primavera.Batata;
import main.java.loja.sementes.primavera.Morango;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestandoHashMap {

    public static void main(String[] args) {

        Batata batata = new Batata();
        Abobora abobora = new Abobora();

        Map<Object, Integer> estoque = new HashMap<>();

        estoque.put(batata, 2);
        System.out.println(estoque);

        int quantidadeBatata = estoque.get(batata);
        System.out.println(quantidadeBatata);//esse pega e coloca quantas existem.
        quantidadeBatata--;
        System.out.println(quantidadeBatata);

        System.out.println(estoque);
        estoque.remove(batata, 2);
        System.out.println(estoque);
        estoque.put(batata, 30);
        System.out.println(estoque);

        quantidadeBatata = estoque.get(batata);
        estoque.put(batata, quantidadeBatata - 2);
        System.out.println(estoque);

        Scanner input = new Scanner(System.in);

        int quantas = input.nextInt();

        estoque.put(batata, quantidadeBatata - quantas);
        System.out.println(estoque);

        int qtdAbobora;
        estoque.put(abobora, 40);
        qtdAbobora = estoque.get(abobora);
        System.out.println(estoque);

        System.out.println("\n Testando estoque \n");

        Estoque estoque2 = new Estoque();

//        estoque2.validarQuantidade(abobora, qtdAbobora);
//        estoque2.adicionar(abobora, qtdAbobora);
//        estoque2.getEstoque(abobora);
        //usando terminal do Intellij e usando comando tree, dá para ver a estrutura completa

    }
}

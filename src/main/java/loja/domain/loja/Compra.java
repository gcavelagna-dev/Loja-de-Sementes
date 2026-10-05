package main.java.loja.domain.loja;

import main.java.loja.domain.Moeda;
import main.java.loja.sementes.Semente;

import java.util.HashMap;
import java.util.Map;

public class Compra {

    private final Map<Semente, Integer> sementes = new HashMap<>();
    private Moeda moeda;

    @Override
    public String toString() {
        return "null";
    }

    public int conversao(Semente semente, Integer quantidade) {
        int total = semente.getPreco().getOuro() * quantidade;
        System.out.println("O total deu: " + total);
        return total;
    }

}

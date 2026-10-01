package main.java.loja.domain.loja;

import main.java.loja.domain.Moeda;
import main.java.loja.sementes.Semente;

import java.util.HashMap;
import java.util.Map;

public class Compra {
    private final Map<Semente, Integer> sementes = new HashMap<>();
    private final Moeda moeda;

    public Compra(){
    }

    public void conversao(Semente semente, Integer quantidade){

        int multiplicacao = semente.getPreco() * quantidade;

    }

}

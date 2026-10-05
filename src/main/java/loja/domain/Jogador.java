package main.java.loja.domain;

import config.Configuracao;

public class Jogador {

    private final Moeda moeda;
    private final Inventario inventario;

    public Jogador(Inventario inventario){
        this.moeda = new Moeda(Configuracao.OURO_INICIAL_JOGADOR);
        this.inventario = inventario;
    }
}

package main.java.loja.sementes;

import main.java.loja.domain.Moeda;

public abstract class Semente {

    private final Estacao estacao;
    private Moeda preco;

    protected Semente(Estacao estacao, Moeda preco) {
        this.estacao = estacao;
        //fazer o PrecoSemente
    }


    public Estacao getEstacao() {
        return estacao;
    }

    public Moeda getPreco() {
        return preco;
    }
}

package main.java.loja.sementes;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;

//abstrata para não poder ser instanciada
public abstract class Semente {

    private final Estacao estacao; //não tem static porque eu teria que definir uma estação em cada classe
    private final Moeda preco;

    protected Semente(Estacao estacao,Moeda preco) {
        this.estacao = estacao;
        this.preco = preco;

    }

    @Override
    public String toString(){
        return estacao.toString();
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public Moeda getPreco() {
        return preco;
    }
}

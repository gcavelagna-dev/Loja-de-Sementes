package main.java.loja.sementes;

import main.java.loja.enums.Estacao;

public abstract class Semente {

    private final Estacao estacao; //não tem static porque eu teria que definir aqui uma estação

    protected Semente(Estacao estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString(){
        return estacao.toString();
    }
}

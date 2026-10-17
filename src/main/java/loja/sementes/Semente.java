package main.java.loja.sementes;

import config.sementes.ValidarPrecoSemente;

public abstract class Semente {

    private final Estacao estacao;
    private final ValidarPrecoSemente precoSemente;

    protected Semente(Estacao estacao, ValidarPrecoSemente precoSemente) {
        this.estacao = estacao;
        this.precoSemente = precoSemente;
    }

    @Override
    public String toString(){
        return getNome() + ": "+ getPrecoSemente() + " ouros | Estação: " + getEstacao().getDescricao();
    }

    protected abstract String getNome();

    public Estacao getEstacao() {
        return estacao;
    }

    public ValidarPrecoSemente getPrecoSemente(){
        return precoSemente;
    }

}

package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Tomate extends Semente {
    public Tomate(){
        super(Estacao.VERAO, PrecoSemente.PRECO_TOMATE);
    }

    @Override
    protected String getNome() {
        return "Tomate";
    }
}

package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Carambola extends Semente {

    public Carambola() {
        super(Estacao.VERAO, PrecoSemente.PRECO_CARAMBOLA);
    }

    @Override
    protected String getNome() {
        return "Carambola";
    }

}


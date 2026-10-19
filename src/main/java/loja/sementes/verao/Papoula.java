package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Papoula extends Semente {

    public Papoula() {
        super(Estacao.VERAO, PrecoSemente.PRECO_PAPOULA);
    }

    @Override
    protected String getNome() {
        return "Papoula";
    }
}

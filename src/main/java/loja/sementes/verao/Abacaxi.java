package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Abacaxi extends Semente {

    public Abacaxi() {
        super(Estacao.VERAO, PrecoSemente.PRECO_ABACAXI);
    }

    @Override
    protected String getNome() {
        return "Abacaxi";
    }
}

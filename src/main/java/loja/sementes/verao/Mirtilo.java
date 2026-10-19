package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Mirtilo extends Semente {

    public Mirtilo() {
        super(Estacao.VERAO, PrecoSemente.PRECO_MIRTILO);
    }

    @Override
    protected String getNome() {
        return "Mirtilo";
    }

}

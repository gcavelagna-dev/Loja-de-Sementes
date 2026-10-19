package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Amaranto extends Semente {

    public Amaranto() {
        super(Estacao.OUTONO, PrecoSemente.PRECO_AMARANTO);
    }

    @Override
    protected String getNome() {
        return "Amaranto";
    }
}

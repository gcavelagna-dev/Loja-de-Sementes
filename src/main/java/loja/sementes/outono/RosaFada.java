package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class RosaFada extends Semente {
    public RosaFada(){
        super(Estacao.OUTONO, PrecoSemente.PRECO_ROSA_FADA);
    }

    @Override
    protected String getNome() {
        return "Rosa-de-Fada";
    }
}

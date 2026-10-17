package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Beterraba extends Semente {

    public Beterraba(){
        super(Estacao.OUTONO, new ValidarPrecoSemente(PrecoSemente.PRECO_BETERRABA));
    }

    @Override
    protected String getNome(){
        return "Beterraba";
    }
}

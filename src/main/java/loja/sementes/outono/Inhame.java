package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Inhame extends Semente {

    public Inhame(){
        super(Estacao.OUTONO, new ValidarPrecoSemente(PrecoSemente.PRECO_INHAME));
    }

    @Override
    protected String getNome(){
        return "Inhame";
    }
}

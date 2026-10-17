package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Amaranto extends Semente {

    public Amaranto(){
        super(Estacao.OUTONO, new ValidarPrecoSemente(PrecoSemente.PRECO_AMARANTO));
    }

    @Override
    protected String getNome(){
        return "Amaranto";
    }
}

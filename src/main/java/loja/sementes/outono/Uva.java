package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Uva extends Semente {

    public Uva(){
        super(Estacao.OUTONO, new ValidarPrecoSemente(PrecoSemente.PRECO_UVA));
    }

    @Override
    protected String getNome(){
        return "Uva";
    }

}

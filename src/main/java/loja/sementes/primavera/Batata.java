package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Batata extends Semente {

    public Batata(){
        super(Estacao.PRIMAVERA, new ValidarPrecoSemente(PrecoSemente.PRECO_BATATA));
    }

    @Override
    protected String getNome(){
        return "Batata";
    }
}

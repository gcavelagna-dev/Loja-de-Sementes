package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Jasmin extends Semente {

    public Jasmin(){
        super(Estacao.PRIMAVERA, new ValidarPrecoSemente(PrecoSemente.PRECO_JASMIN));
    }

    @Override
    protected String getNome(){
        return "Jasmin";
    }
}

package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Morango extends Semente {

    public Morango(){
        super(Estacao.PRIMAVERA, new ValidarPrecoSemente(PrecoSemente.PRECO_MORANGO));
    }

    @Override
    protected String getNome(){
        return "Morango";
    }
}

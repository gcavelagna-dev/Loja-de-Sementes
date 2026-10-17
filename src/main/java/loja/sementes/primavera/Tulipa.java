package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Tulipa extends Semente {

    public Tulipa(){
        super(Estacao.PRIMAVERA, new ValidarPrecoSemente(PrecoSemente.PRECO_TULIPA));
    }

    @Override
    protected String getNome(){
        return "Tulipa";
    }
}

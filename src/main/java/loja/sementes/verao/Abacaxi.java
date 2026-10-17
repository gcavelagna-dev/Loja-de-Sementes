package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Abacaxi extends Semente {

    public Abacaxi(){
        super(Estacao.VERAO, new ValidarPrecoSemente(PrecoSemente.PRECO_ABACAXI));
    }

    @Override
    protected String getNome(){
        return "Abacaxi";
    }
}

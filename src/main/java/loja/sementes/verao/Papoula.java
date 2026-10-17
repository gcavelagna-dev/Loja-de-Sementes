package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Papoula extends Semente {

    public Papoula(){
        super(Estacao.VERAO, new ValidarPrecoSemente(PrecoSemente.PRECO_PAPOULA));
    }

    @Override
    protected String getNome(){
        return "Papoula";
    }
}

package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Mirtilo extends Semente {

    public Mirtilo(){
        super(Estacao.VERAO, new ValidarPrecoSemente(PrecoSemente.PRECO_MIRTILO));
    }

    @Override
    protected String getNome(){
        return "Mirtilo";
    }

}

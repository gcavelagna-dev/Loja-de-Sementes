package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Lupulo extends Semente {

    public Lupulo(){
        super(Estacao.VERAO, new ValidarPrecoSemente(PrecoSemente.PRECO_LUPULO));
    }

    @Override
    protected String getNome(){
        return "Lúpulo";
    }
}

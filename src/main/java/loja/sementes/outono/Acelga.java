package main.java.loja.sementes.outono;

import config.Configuracao;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Acelga extends Semente {

    public Acelga(){
        super(Estacao.OUTONO, new ValidarPrecoSemente(Configuracao.PRECO_ACELGA));
    }

    @Override
    protected String getNome(){
        return "Acelga";
    }
}

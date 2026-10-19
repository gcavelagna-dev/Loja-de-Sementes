package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Acelga extends Semente {

    public Acelga(){
        super(Estacao.OUTONO, PrecoSemente.PRECO_ACELGA);
    }

    @Override
    protected String getNome(){
        return "Acelga";
    }
}

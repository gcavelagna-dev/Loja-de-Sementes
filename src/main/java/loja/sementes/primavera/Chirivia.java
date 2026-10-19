package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Chirivia extends Semente {

    public Chirivia(){
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_CHIRIVIA);
    }

    @Override
    protected String getNome(){
        return "Chirívia";
    }
}

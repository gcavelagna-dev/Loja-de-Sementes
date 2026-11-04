package main.java.loja.sementes.inverno;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class SementeInverno extends Semente {

    public SementeInverno(){
        super(Estacao.INVERNO, PrecoSemente.PRECO_SEMENTE_INVERNO);

    }

    @Override
    protected String getNome() {
        return "Semente-de-Inverno";
    }
}

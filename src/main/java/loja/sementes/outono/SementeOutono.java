package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class SementeOutono extends Semente {
    public SementeOutono(){
        super(Estacao.OUTONO, PrecoSemente.PRECO_SEMENTE_OUTONO);
    }

    @Override
    protected String getNome() {
        return "Semente-de-Outono";
    }
}

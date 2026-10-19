package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Alcachofra extends Semente {

    public Alcachofra(){
        super(Estacao.OUTONO, PrecoSemente.PRECO_ALCACHOFRA);
    }


    @Override
    protected String getNome() {
        return "Alcachofra";
    }
}

package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Alcachofra extends Semente {

    public Alcachofra(){
        super(Estacao.OUTONO, new ValidarPrecoSemente(PrecoSemente.PRECO_ALCACHOFRA));
    }


    @Override
    protected String getNome() {
        return "Alcachofra";
    }
}

package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Ruibarbo extends Semente {

    public Ruibarbo(){
        super(Estacao.PRIMAVERA, new ValidarPrecoSemente(PrecoSemente.PRECO_RUIBARBO));
    }

    @Override
    protected String getNome(){
        return "Ruibarbo";
    }
}

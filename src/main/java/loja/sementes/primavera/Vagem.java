package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Vagem extends Semente {

    public Vagem() {
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_VAGEM);
    }

    @Override
    protected String getNome() {
        return "Vagem";
    }
}

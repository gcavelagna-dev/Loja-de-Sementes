package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class CouveFlor extends Semente {

    public CouveFlor() {
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_COUVE_FLOR);
    }

    @Override
    protected String getNome() {
        return "Couve-Flor";
    }
}

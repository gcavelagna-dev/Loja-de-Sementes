package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Alho extends Semente {

    public Alho() {
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_ALHO);
    }

    @Override
    protected String getNome() {
        return "Alho";
    }
}

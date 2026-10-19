package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Jasmin extends Semente {

    public Jasmin() {
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_JASMIN);
    }

    @Override
    protected String getNome() {
        return "Jasmin";
    }
}

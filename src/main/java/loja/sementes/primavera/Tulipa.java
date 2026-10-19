package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Tulipa extends Semente {

    public Tulipa() {
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_TULIPA);
    }

    @Override
    protected String getNome() {
        return "Tulipa";
    }
}

package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Girassol extends Semente {
    public Girassol() {
        super(Estacao.VERAO, PrecoSemente.PRECO_GIRASSOL);
    }

    @Override
    protected String getNome() {
        return "Girassol";
    }
}

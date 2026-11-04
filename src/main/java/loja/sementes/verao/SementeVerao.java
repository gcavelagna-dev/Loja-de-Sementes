package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class SementeVerao extends Semente {
    public SementeVerao() {
        super(Estacao.VERAO, PrecoSemente.PRECO_SEMENTE_VERAO);
    }

    @Override
    protected String getNome() {
        return "Semente-de-Verão";
    }
}

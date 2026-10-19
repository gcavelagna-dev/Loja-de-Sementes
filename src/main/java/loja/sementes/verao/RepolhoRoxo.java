package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class RepolhoRoxo extends Semente {

    public RepolhoRoxo() {
        super(Estacao.VERAO, PrecoSemente.PRECO_REPOLHO_ROXO);
    }

    @Override
    protected String getNome() {
        return "Repolho-Roxo";
    }
}

package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class RepolhoRoxo extends Semente {

    public RepolhoRoxo(){
        super(Estacao.VERAO, new ValidarPrecoSemente(PrecoSemente.PRECO_REPOLHO_ROXO));
    }

    @Override
    protected String getNome(){
        return "Repolho-Roxo";
    }
}

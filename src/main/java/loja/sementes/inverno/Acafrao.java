package main.java.loja.sementes.inverno;


import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Acafrao extends Semente {

    public Acafrao() {
        super(Estacao.INVERNO, PrecoSemente.PRECO_ACAFRAO);
    }

    @Override
    protected String getNome() {
        return "Açafrão";
    }
}

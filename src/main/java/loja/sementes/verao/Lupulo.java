package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Lupulo extends Semente {

    public Lupulo() {
        super(Estacao.VERAO, PrecoSemente.PRECO_LUPULO);
    }

    @Override
    protected String getNome() {
        return "Lúpulo";
    }
}

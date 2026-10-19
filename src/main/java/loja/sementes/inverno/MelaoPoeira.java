package main.java.loja.sementes.inverno;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class MelaoPoeira extends Semente {

    public MelaoPoeira() {
        super(Estacao.INVERNO, PrecoSemente.PRECO_MELAO_POEIRA);
    }

    @Override
    protected String getNome() {
        return "Melão-Poeira";
    }

}

package main.java.loja.sementes.inverno;

import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class MelaoPoeira extends Semente {

    public MelaoPoeira() {
        super(Estacao.INVERNO, new ValidarPrecoSemente(PrecoSemente.PRECO_MELAO_POEIRA));
    }

    @Override
    protected String getNome(){
        return "Melão-Poeira";
    }

}

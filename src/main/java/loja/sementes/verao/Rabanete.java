package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Rabanete extends Semente {
    public Rabanete(){
        super(Estacao.VERAO, PrecoSemente.PRECO_RABANETE);
    }

    @Override
    protected String getNome() {
        return "Rabanete";
    }
}

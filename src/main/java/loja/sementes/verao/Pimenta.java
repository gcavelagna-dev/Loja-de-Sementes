package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Pimenta extends Semente {

    public Pimenta() {
        super(Estacao.VERAO, PrecoSemente.PRECO_PIMENTA);
    }

    @Override
    protected String getNome() {
        return "Pimenta-Picante";
    }
}

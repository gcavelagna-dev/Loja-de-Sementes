package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class SementePrimavera extends Semente {
    public SementePrimavera(){
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_SEMENTE_PRIMAVERA);
    }

    @Override
    protected String getNome() {
        return "Semente-de-Primavera";
    }
}

package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Cenoura extends Semente {
    public Cenoura(){
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_CENOURA);
    }

    @Override
    protected String getNome() {
        return "Cenoura";
    }
}

package main.java.loja.sementes.primavera;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Couve extends Semente {

    public Couve() {
        //todo em vez de instanciar, colocar o método static
        super(Estacao.PRIMAVERA, PrecoSemente.PRECO_COUVE);
    }

    @Override
    protected String getNome() {
        return "Couve";
    }
}

package main.java.loja.sementes.outono;


import config.sementes.PrecoSemente;
import config.sementes.ValidarPrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Abobora extends Semente {

    public Abobora() {
        super(Estacao.OUTONO, new ValidarPrecoSemente(PrecoSemente.PRECO_ABOBORA));
    }

    @Override
    protected String getNome(){
        return "Abóbora";
    }
}

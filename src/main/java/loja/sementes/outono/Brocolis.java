package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Brocolis extends Semente {
    public Brocolis(){
        super(Estacao.OUTONO, PrecoSemente.PRECO_BROCOLIS);
    }

    @Override
    protected String getNome() {
        return "Brócolis";
    }
}

package main.java.loja.sementes.outono;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class JoiaDoce extends Semente {

    public JoiaDoce(){
        super(Estacao.OUTONO, PrecoSemente.PRECO_JOIA_DOCE);
    }

    @Override
    protected String getNome() {
        return "Joia-Doce";
    }
}

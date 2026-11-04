package main.java.loja.sementes.verao;

import config.sementes.PrecoSemente;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class AbobrinhaVerao extends Semente {
    public AbobrinhaVerao(){
        super(Estacao.VERAO, PrecoSemente.PRECO_ABOBORA_VERAO);
    }

    @Override
    protected String getNome() {
        return "Abobrinha-de-Verão";
    }
}

package main.java.loja.domain;

import main.java.loja.shared.exceptions.moeda.MoedaValorAltoException;
import main.java.loja.shared.exceptions.moeda.MoedaValorNegativoException;

public class Moeda {

    private int ouro;
    private static final int MAX = 300;
    private static final int MIN = 0 ;

    public Moeda(int ouro){
        setOuro(ouro);
    }

    public void setOuro(int ouro){
        if (ouro <= MIN) {
            throw new MoedaValorNegativoException("Erro: Moeda com valor definido como negativo, valor mínimo: " + MIN + " ouros.");
        }else if (ouro > MAX){
            throw new MoedaValorAltoException("Erro: Moeda definida com valor alto de " + MAX + " ouros.");
        }
    }

    public int getOuro(){
        return ouro;
    }
}

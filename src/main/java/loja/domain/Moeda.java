package main.java.loja.domain;

import main.java.loja.shared.exceptions.moeda.MoedaValorAltoException;
import main.java.loja.shared.exceptions.moeda.MoedaValorNegativoException;

public class Moeda {

    private int ouro;
    private static final int MIN = 0 ;
    private static final int MAX = 300;

    public Moeda(int ouro){//para receber um valor e determinar como Moeda
        setOuro(ouro);

    }

    public void setOuro(int ouro){
        if (ouro <= MIN) {
            throw new MoedaValorNegativoException("Erro: Ouro com valor definido como negativo, valor mínimo: " + MIN + " ouros.");
        }else if (ouro > MAX){
            throw new MoedaValorAltoException("Erro: Ouro definido com valor alto de " + MAX + " ouros.");
        }
        this.ouro = ouro;
    }

    public int getOuro(){
        return ouro;
    }
}

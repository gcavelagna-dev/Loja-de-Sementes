package main.java.loja.domain;

import config.Configuracao;
import main.java.loja.shared.exceptions.domain.moeda.LimiteMoedaValorException;
import main.java.loja.shared.exceptions.domain.moeda.MoedaValorNegativoException;

public class Moeda {

    private int ouro;

    public Moeda(int ouro) {
        setOuro(ouro);
    }

    public void setOuro(int ouro) {

        if (ouro < Configuracao.OURO_MIN_JOGADOR) {
            throw new MoedaValorNegativoException("Erro: Ouro com valor definido como negativo.");
        } else if (ouro > Configuracao.OURO_MAX_JOGADOR) {
            throw new LimiteMoedaValorException("Erro: Valor do ouro ultrapassou o limite.");
        }
        this.ouro = ouro;
    }

    public void adicionar(int valor){
        setOuro(valor);
        ouro += valor;
    }

    public int getOuro() {
        return ouro;
    }
}

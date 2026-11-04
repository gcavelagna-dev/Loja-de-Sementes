package main.java.loja.domain;

import config.Configuracao;
import main.java.loja.shared.exceptions.domain.moeda.LimiteMoedaValorException;
import main.java.loja.shared.exceptions.domain.moeda.MoedaValorNegativoException;
import main.java.loja.shared.exceptions.domain.moeda.SaldoInsuficienteException;

public class Moeda {

    private int ouro;

    public Moeda(int ouro) {
        setValor(ouro);
    }

    private void setValor(int ouro) {

        if (ouro < Configuracao.OURO_MIN_JOGADOR) {
            throw new MoedaValorNegativoException("Erro: Ouro com valor definido como negativo.");
        } else if (ouro > Configuracao.OURO_MAX_JOGADOR) {
            throw new LimiteMoedaValorException("Erro: Valor do ouro ultrapassou o limite.");
        }
        this.ouro = ouro;
    }

    public void adicionar(int valor){
        int total = valor + getOuro();
        setValor(total);

    }

    public void descontar(int valor){
        if (valor > getOuro()){
            throw new SaldoInsuficienteException("Erro: O valor para descontar está acima do que as moedas que tem.");
        }
        int total = getOuro() - valor;
        setValor(total);
    }

    public int getOuro() {
        return ouro;
    }
}

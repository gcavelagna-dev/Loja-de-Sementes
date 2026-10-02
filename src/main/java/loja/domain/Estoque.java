package main.java.loja.domain;

import main.java.loja.sementes.Semente;
import main.java.loja.shared.exceptions.domain.estoque.IntegerEstoqueAcimaException;
import main.java.loja.shared.exceptions.domain.estoque.IntegerNegativoException;
import main.java.loja.shared.exceptions.domain.estoque.IntegerNullException;
import main.java.loja.shared.exceptions.domain.estoque.IntegerRemocaoException;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private final Map<Semente, Integer> estoque = new HashMap<>();
    private static final int MIN = 0;
    private static final int MAX = 500;

    public Estoque() {
    }

    @Override
    public String toString() {
        return "";
    }

    public void adicionar(Semente semente, Integer quantidade) {
        validarQuantidade(quantidade);

        Integer quantidadeAtual = estoque.getOrDefault(semente, MIN);
        Integer quantidadeFinal = quantidadeAtual + quantidade;

        validarQuantidade(quantidadeFinal);

        estoque.put(semente, quantidade);

    }

    public void remover(Semente semente, Integer quantidade){

        validarQuantidade(quantidade);


        Integer quantidadeAtual = estoque.getOrDefault(semente, MIN);
        Integer quantidadeFinal = quantidadeAtual - quantidade;
        if (quantidade < MIN) {
            throw new IntegerRemocaoException("Erro: Remoção de número negativo");
        }
        estoque.put(semente, quantidadeFinal);

    }

    public boolean temSemente(Semente semente){
        //implementar que se tiver 0, ficar aparente no estoque
        return estoque.getOrDefault(semente, MIN) > 0;
    }

    public void validarQuantidade(Integer quantidadeDesejada) {

        if (quantidadeDesejada == null) {
            throw new IntegerNullException("Erro: Integer está nulo.");
        }
        if (quantidadeDesejada < MIN) {
            throw new IntegerNegativoException("Erro: O número do Integer está negativa: " + quantidadeDesejada);
        }
        if (quantidadeDesejada > MAX) {
            throw new IntegerEstoqueAcimaException("Erro: Quantidade final: " + quantidadeDesejada + " acima do que pode: " + MAX);
        }
    }

    public Map<Semente, Integer> getEstoque() {
        return Collections.unmodifiableMap(estoque);//devolve a cópia
    }


    /*
    exemplo:
    estoque.adicionar(chirivia, 10);
    estoque.remover(chirivia, 2);
    estoque.getQuantidade(chirivia);
    estoque.temDisponivel(chirivia);
     */
}

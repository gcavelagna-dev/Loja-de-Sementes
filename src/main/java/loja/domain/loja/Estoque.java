package main.java.loja.domain.loja;

import config.estoque.ConfiguracaoEstoque;
import main.java.loja.sementes.Semente;
import main.java.loja.shared.exceptions.domain.estoque.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private final Map<Semente, Integer> estoque = new HashMap<>();

    public Estoque() {
    }

    @Override
    public String toString() {
        return
        "\nEstoque: " +
        estoque +
        "\n";
    }

    public void exibirEstoque() {
        for (Map.Entry<Semente, Integer> entrada : estoque.entrySet()) {
            System.out.println(entrada.getKey() + " | Quantidade: " + entrada.getValue());
        }
    }

    public void adicionar(Semente semente, Integer quantidade) {

        validarQuantidade(quantidade);
        Integer quantidadeAtual = estoque.getOrDefault(semente, ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE);
        Integer quantidadeFinal = quantidadeAtual + quantidade;
        validarQuantidade(quantidadeFinal);

        estoque.put(semente, quantidade);

    }

    public void remover(Semente semente, Integer quantidade) {

        if (quantidade < ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE) {
            throw new IntegerRemocaoException("Erro: Remoção de número negativo");
        }
        Integer quantidadeAtual = estoque.getOrDefault(semente, ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE);

        if (quantidadeAtual < quantidade){
            throw new QuantidadeNegativaException("Erro: Estoque quantidade negativa maior que quantidade atual.");
        }

        Integer quantidadeFinal = quantidadeAtual - quantidade;
        estoque.put(semente, quantidadeFinal);

    }

    public boolean temSemente(Semente semente) {
        return estoque.getOrDefault(semente, ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE) > 0;
    }

    public void validarQuantidade(Integer quantidadeDesejada) {

        if (quantidadeDesejada == null) {
            throw new IntegerNullException("Erro: Integer está nulo.");
        }
        if (quantidadeDesejada < ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE) {
            throw new IntegerNegativoException("Erro: O número do Integer está negativa: " + quantidadeDesejada);
        }
        if (quantidadeDesejada > ConfiguracaoEstoque.QUANTIDADE_MAX_SEMENTE) {
            throw new LimiteIntegerEstoqueException("Erro: Quantidade final: " + quantidadeDesejada + " acima do que pode: " + ConfiguracaoEstoque.QUANTIDADE_MAX_SEMENTE);
        }
    }

    public Map<Semente, Integer> getEstoque() {
        return Collections.unmodifiableMap(estoque);//devolve a cópia
    }

}

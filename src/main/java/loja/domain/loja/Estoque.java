package main.java.loja.domain.loja;

import config.domain.loja.estoque.ConfiguracaoEstoque;
import config.domain.loja.estoque.RegrasEstoque;
import main.java.loja.sementes.Semente;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private final Map<Semente, Integer> estoque = new HashMap<>();

    public void exibirEstoque() {
        System.out.println("------------------------------------------------------");
        for (Map.Entry<Semente, Integer> entrada : estoque.entrySet()) {
            System.out.println(entrada.getKey() + " | Quantidade: " + entrada.getValue());
        }
        System.out.println("------------------------------------------------------");
    }

    public void adicionar(Semente semente, Integer quantidade) {

        RegrasEstoque.validarQuantidade(quantidade);

        Integer quantidadeAtual = estoque.getOrDefault(semente, ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE);
        Integer quantidadeFinal = quantidadeAtual + quantidade;

        RegrasEstoque.validarQuantidade(quantidadeFinal);

        estoque.put(semente, quantidadeFinal);

    }

    public void remover(Semente semente, Integer quantidade) {

        RegrasEstoque.validarQuantidade(quantidade);
        Integer quantidadeAtual = estoque.getOrDefault(semente, ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE);

        RegrasEstoque.validarRemocao(quantidadeAtual, quantidade);

        Integer quantidadeFinal = quantidadeAtual - quantidade;

        RegrasEstoque.validarQuantidade(quantidadeFinal);
        estoque.put(semente, quantidadeFinal);

    }

    public boolean temSemente(Semente semente) {
        return estoque.getOrDefault(semente, ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE) > 0;
    }


}

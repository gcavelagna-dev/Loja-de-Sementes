package config.domain.loja.estoque;

import main.java.loja.shared.exceptions.config.estoque.IntegerNegativoException;
import main.java.loja.shared.exceptions.config.estoque.IntegerNullPointerException;
import main.java.loja.shared.exceptions.config.estoque.LimiteIntegerEstoqueException;

public final class RegrasEstoque {

    private RegrasEstoque(){

    }

    public static void validarQuantidade(Integer quantidadeSemente) {

        if (quantidadeSemente == null) {
            throw new IntegerNullPointerException("Erro: Quantidade está NULO.");
        }

        if (quantidadeSemente < ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE) {
            throw new IntegerNegativoException("Erro: Valor com quantidade negativa.");
        }
        if (quantidadeSemente > ConfiguracaoEstoque.QUANTIDADE_MAX_SEMENTE) {
            throw new LimiteIntegerEstoqueException("Erro: Valor com quantidade Limite.");
        }
    }

    public static void validarRemocao(Integer quantidadeAtual, Integer quantidade) {
        if (quantidadeAtual < quantidade) {
            throw new IntegerNegativoException("Erro: A quantidade que está no Estoque é menor que a quantidade solicitada.");
        }
    }

}

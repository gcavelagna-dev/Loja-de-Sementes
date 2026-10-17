package config.estoque;

import main.java.loja.shared.exceptions.config.estoque.EstoqueValorLimiteException;
import main.java.loja.shared.exceptions.config.estoque.EstoqueValorNegativoException;

public final class RegrasEstoque {

    //static para não precisar instanciar
    public static void setQuantidadeSemente(int quantidadeSemente){
        if (quantidadeSemente < ConfiguracaoEstoque.QUANTIDADE_MIN_SEMENTE){
            throw new EstoqueValorNegativoException("Erro: Valor com quantidade negativa.");
        }
        if (quantidadeSemente > ConfiguracaoEstoque. QUANTIDADE_MAX_SEMENTE){
            throw new EstoqueValorLimiteException("Erro: Valor com quantidade Limite.");
        }
    }

    public RegrasEstoque(int quantidadeSemente){
        setQuantidadeSemente(quantidadeSemente);
    }
}

package config.sementes;

import main.java.loja.shared.exceptions.config.semente.LimitePrecoSementeException;
import main.java.loja.shared.exceptions.config.semente.PrecoSementeNegativoException;

public final class ValidarPrecoSemente {

    public ValidarPrecoSemente(){
    }

    public static void validar(int precoSemente){
        if (precoSemente < PrecoSemente.PRECO_MIN_SEMENTE){
            throw new PrecoSementeNegativoException("Erro: Preço da semente está negativa.");
        }
        if (precoSemente > PrecoSemente.PRECO_MAX_SEMENTE){
            throw new LimitePrecoSementeException("Erro: Preço da semente ultrapassou o limite.");
        }
    }

}

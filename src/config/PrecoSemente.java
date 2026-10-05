package config;

import main.java.loja.shared.exceptions.domain.config.preco_semente.LimitePrecoSementeException;
import main.java.loja.shared.exceptions.domain.config.preco_semente.PrecoSementeNegativoException;

public final class PrecoSemente {

    private final int valor;

    public PrecoSemente(int valor){
        if (valor < Configuracao.PRECO_MIN_SEMENTE){
            throw new PrecoSementeNegativoException("Erro: Preço da semente está negativa.");
        }
        if (valor > Configuracao.PRECO_MAX_SEMENTE){
            throw new LimitePrecoSementeException("Erro: Preço da semente ultrapassou o limite.");
        }
        this.valor = valor;
    }

    //                                Ler                                        \\
    //não faz sentido ter uma validação e logo abaixo um tanto de constantes variadas
    //se for para só definir e quando for instanciar, daí sim, porque JVM já vai lançar exception

    //PRIMAVERA
    public static final int PRECO_MORANGO = 25;
    public static final int PRECO_BATATA = 20;
    public static final int PRECO_CHIRIVIA = 12;
    //VERÃO
    public static final int PRECO_MELAO = 27;
    public static final int PRECO_CARAMBOLA = 40;
    public static final int PRECO_MIRTILO = 16;
    //OUTONO
    public static final int PRECO_ABOBORA = 38;
    public static final int PRECO_INHAME = 14;
    public static final int PRECO_OXICOCO = 25;
    //INVERNO

    public static final int PRECO_MELAO_POEIRA = 8;

    public int getValor() {
        return valor;
    }
}

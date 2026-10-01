package main.java.loja.domain;

import main.java.loja.shared.exceptions.domain.estoque.IntegerEstoqueAcimaException;
import main.java.loja.shared.exceptions.domain.estoque.IntegerNegativoException;
import main.java.loja.shared.exceptions.domain.estoque.IntegerNullException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private ArrayList<Map> estoqueMap = new ArrayList<>();
    private final Map<Object, Integer> estoque = new HashMap<>();
    private static final int MIN = 0;
    private static final int MAX = 500;

    public Estoque(){
//        |estoque.add|(validarQuantidade(Object semente, Integer quantidadadeDesejada));
    }

    public void validarQuantidade(Object semente, Integer quantidadeDesejada){
        Integer quantidadeAtual = estoque.getOrDefault(semente, MIN);

        if (quantidadeDesejada == null){
            throw new IntegerNullException("Erro: Integer está nulo.");
        }
        if (quantidadeDesejada < MIN){
            throw new IntegerNegativoException("Erro: O número do Integer está negativa: " + quantidadeDesejada);
        }
        if (quantidadeDesejada > MAX){
            throw new IntegerEstoqueAcimaException("Erro: Quantidade final: " + quantidadeDesejada + " acima do que pode: " + MAX);
        }
        estoque.put(semente, quantidadeDesejada);
    }

    public void adicionarMap(Map(Object semente, Integer integer))
    public Map<Object, Integer> getEstoque() {
        return Collections.unmodifiableMap(estoque);//devolve a cópia
    }

    public ArrayList<Map> getEstoqueMap() {
        return new ArrayList<>(this.estoqueMap);
    }

    /*
    exemplo:
    estoque.adicionar(chirivia, 10);
    estoque.remover(chirivia, 2);
    estoque.getQuantidade(chirivia);
    estoque.temDisponivel(chirivia);
     */
}

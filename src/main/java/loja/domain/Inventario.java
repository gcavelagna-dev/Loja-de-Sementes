package main.java.loja.domain;

import main.java.loja.domain.loja.Compra;
import main.java.loja.sementes.Semente;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private final Map<Semente, Integer> sementes = new HashMap<>();
    private final Compra compra = new Compra();

    public Inventario(){
    }



}

package main.java.loja.domain;

import main.java.loja.sementes.Semente;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private final Map<Semente, Integer> sementes = new HashMap<>();
    private final Moeda moeda = new Moeda(400);
}

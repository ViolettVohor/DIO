package com.company.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Tesla"));
        hashSetCarros.add(new Carro("Jeep"));
        hashSetCarros.add(new Carro("Jaguar"));
        hashSetCarros.add(new Carro("Toyota"));
        hashSetCarros.add(new Carro("Ferrari"));
        hashSetCarros.add(new Carro("BMW"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Tesla"));
        treeSetCarros.add(new Carro("Jeep"));
        treeSetCarros.add(new Carro("Jaguar"));
        treeSetCarros.add(new Carro("Toyota"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("BMW"));

        System.out.println(treeSetCarros);
    }
}

package com.company.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(listaCarros.get(0).hashCode());

        System.out.println(listaCarros.get(0).equals(listaCarros.get(1)));
        System.out.println(listaCarros.get(0).marca);
        System.out.println(listaCarros.get(1).marca);
        System.out.println(listaCarros.get(2).marca);
    }
}

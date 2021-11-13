package com.company.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Audi"));
        listCarros.add(new Carro("Tesla"));
        listCarros.add(new Carro("Ferrari"));
        listCarros.add(new Carro("Toyota"));

        System.out.println(listCarros);

        System.out.println(listCarros.contains(new Carro("Audi")));
        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Ferrari")));
        System.out.println(listCarros.indexOf(new Carro("ferrari")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }
}

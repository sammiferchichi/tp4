package com.mycompany.aglcloned;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        ArrayList<String> produits = new ArrayList<>();
        produits.add("Ordinateur portable");
        produits.add("Clavier mecanique");
        produits.add("Souris sans fil");
        produits.add("Ecran 24 pouces");

        System.out.println("Liste des produits disponibles :");
        for (String produit : produits) {
            System.out.println("- " + produit);
        }
    }
}

package com.mycompany.aglcloned;

public class Article {
    private String nom;
    private double prix;

    // Constructeur
    public Article(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Méthode pour afficher les détails
    public void afficherDetails() {
        System.out.println("Article : " + nom + ", Prix : " + prix + " DT");
    }
}

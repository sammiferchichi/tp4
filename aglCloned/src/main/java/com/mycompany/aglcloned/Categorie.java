package com.mycompany.aglcloned;

public class Categorie {
    private String nomCategorie;
    private String description;

    // Constructeur
    public Categorie(String nomCategorie, String description) {
        this.nomCategorie = nomCategorie;
        this.description = description;
    }

    // Getters et Setters
    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Méthode pour afficher les détails
    public void afficherCategorie() {
        System.out.println("Catégorie : " + nomCategorie + " - " + description);
    }
}

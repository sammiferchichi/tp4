package com.mycompany.aglcloned;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Article> articles;

    // Constructeur
    public Stock() {
        this.articles = new ArrayList<>();
    }

    // Ajouter un article au stock
    public void ajouterArticle(Article article) {
        articles.add(article);
    }

    // Afficher tous les articles en stock
    public void afficherStock() {
        System.out.println("Articles en stock :");
        for (Article article : articles) {
            article.afficherDetails();
        }
    }
}

package com.example.tests;

import com.example.dao.EntrepriseDAO;
import com.example.model.Entreprise;

public class Exercice1 {
    public static void main(String[] args) {
        System.out.println("=== EXERCICE 1: Insertion d'entrées dans une table ===");

        EntrepriseDAO dao = new EntrepriseDAO();

        // Création d'une nouvelle entreprise
        Entreprise entreprise = new Entreprise("Apple", "Informatique, Téléphonie", 150000);

        // Ajout de l'entreprise et récupération de l'identifiant
        Integer id = dao.ajouterEntreprise(entreprise);

        System.out.println("Entreprise ajoutée avec succès. ID généré: " + id);

        // Ajout d'autres entreprises pour les tests
        dao.ajouterEntreprise(new Entreprise("Google", "Internet, Logiciel, IA", 180000));
//        dao.ajouterEntreprise(new Entreprise("Microsoft", "Logiciel, Cloud", 165000));
//        dao.ajouterEntreprise(new Entreprise("Amazon", "E-commerce, Cloud", 1500000));
//        dao.ajouterEntreprise(new Entreprise("Tesla", "Automobile, Energie", 100000));
    }
}
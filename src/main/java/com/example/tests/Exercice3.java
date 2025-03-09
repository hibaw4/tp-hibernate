package com.example.tests;

import com.example.dao.EntrepriseDAO;
import com.example.model.Entreprise;
import java.util.List;

public class Exercice3 {
    public static void main(String[] args) {
        System.out.println("=== EXERCICE 3: Utilisation des méthodes find et du langage HQL ===");

        EntrepriseDAO dao = new EntrepriseDAO();

        // 1. Rechercher toutes les entreprises
        System.out.println("\n1. Liste de toutes les entreprises:");
        List<Entreprise> entreprises = dao.getAllEntreprises();
        for (Entreprise e : entreprises) {
            System.out.println(e);
        }

        // 2. Rechercher une entreprise par son nom
        System.out.println("\n2. Recherche d'une entreprise par son nom:");
        String nom = "Apple"; // À adapter selon vos données
        Entreprise entrepriseParNom = dao.getEntrepriseByName(nom);
        if (entrepriseParNom != null) {
            System.out.println("Entreprise trouvée: " + entrepriseParNom);
        } else {
            System.out.println("Aucune entreprise trouvée avec le nom: " + nom);
        }

        // 3. Rechercher toutes les entreprises triées par nombre d'employés
        System.out.println("\n3. Liste des entreprises triées par nombre d'employés:");
        List<Entreprise> entreprisesTriees = dao.getAllEntreprisesSortedByEmployees();
        for (Entreprise e : entreprisesTriees) {
            System.out.println(e);
        }

        // 4. Afficher le nombre d'entreprises
        System.out.println("\n4. Nombre total d'entreprises:");
        Long count = dao.countEntreprises();
        System.out.println("Nombre d'entreprises: " + count);
    }
}
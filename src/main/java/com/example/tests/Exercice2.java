package com.example.tests;

import com.example.dao.EntrepriseDAO;
import com.example.model.Entreprise;

public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("=== EXERCICE 2: Obtenir une occurrence à partir de son identifiant ===");

        EntrepriseDAO dao = new EntrepriseDAO();

        // Récupérer une entreprise par son ID (avec une entreprise existante dans la base)
        Integer id = 1; // Selon nos données
        Entreprise entreprise = dao.getEntrepriseById(id);

        if (entreprise != null) {
            System.out.println("Entreprise trouvée: " + entreprise);
        } else {
            System.out.println("Aucune entreprise trouvée avec l'ID: " + id);
        }
    }
}
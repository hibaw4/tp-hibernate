package com.example.tests;

import com.example.dao.EntrepriseDAO;
import com.example.model.Entreprise;

public class Exercice4 {
    public static void main(String[] args) {
        System.out.println("=== EXERCICE 4: Mettre à jour ou supprimer une occurrence ===");

        EntrepriseDAO dao = new EntrepriseDAO();

        // Afficher une entreprise avant la mise à jour
        Integer idPourUpdate = 2; // À adapter selon vos données
        System.out.println("\n1. Entreprise avant la mise à jour:");
        Entreprise entrepriseAvant = dao.getEntrepriseById(idPourUpdate);
        if (entrepriseAvant != null) {
            System.out.println(entrepriseAvant);

            // 1. Mettre à jour le nom de l'entreprise
            String nouveauNom = "Apple Inc.";
            dao.updateEntrepriseName(idPourUpdate, nouveauNom);

            // Afficher l'entreprise après la mise à jour
            System.out.println("\nEntreprise après la mise à jour:");
            Entreprise entrepriseApres = dao.getEntrepriseById(idPourUpdate);
            System.out.println(entrepriseApres);
        } else {
            System.out.println("Aucune entreprise trouvée avec l'ID: " + idPourUpdate);
        }

        // 2. Supprimer une entreprise
        Integer idPourDelete = 3; // Selon nos données
        System.out.println("\n2. Suppression d'une entreprise:");
        Entreprise entrepriseAvantDelete = dao.getEntrepriseById(idPourDelete);

        if (entrepriseAvantDelete != null) {
            System.out.println("Entreprise à supprimer: " + entrepriseAvantDelete);
            dao.deleteEntreprise(idPourDelete);

            // Vérifier si l'entreprise a été supprimée
            Entreprise entrepriseApresDelete = dao.getEntrepriseById(idPourDelete);
            if (entrepriseApresDelete == null) {
                System.out.println("L'entreprise a été supprimée avec succès.");
            } else {
                System.out.println("Échec de la suppression de l'entreprise.");
            }
        } else {
            System.out.println("Aucune entreprise trouvée avec l'ID: " + idPourDelete);
        }
    }
}
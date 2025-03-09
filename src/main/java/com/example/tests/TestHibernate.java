package com.example.tests;

import org.hibernate.Session;
import com.example.util.HibernateUtil;

// Pour vérifier que Hibernate est bien connecté à MySQL
public class TestHibernate {
    public static void main(String[] args) {
        try {
            // Ouvre une session Hibernate
            Session session = HibernateUtil.getSessionFactory().openSession();
            System.out.println("Connexion réussie à MySQL via Hibernate !");
            session.close();
            HibernateUtil.shutdown();
        } catch (Exception e) {
            System.err.println("Erreur de connexion à MySQL via Hibernate : " + e.getMessage());
        }
    }
}

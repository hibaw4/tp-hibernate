package com.example.dao;

import java.util.List;
import com.example.model.Entreprise;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.example.util.HibernateUtil;

public class EntrepriseDAO {

    // Exercice 1: Insérer une nouvelle entreprise
    public Integer ajouterEntreprise(Entreprise entreprise) {
        Transaction transaction = null;
        Integer idEntreprise = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            // Sauvegarde de l'entreprise
            idEntreprise = (Integer) session.save(entreprise);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        return idEntreprise;
    }

    // Exercice 2: Obtenir une entreprise à partir de son identifiant
    public Entreprise getEntrepriseById(Integer id) {
        Entreprise entreprise = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            entreprise = session.get(Entreprise.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entreprise;
    }

    // Exercice 3.1: Rechercher toutes les entreprises
    public List<Entreprise> getAllEntreprises() {
        List<Entreprise> entreprises = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Entreprise> query = session.createQuery("FROM Entreprise", Entreprise.class);
            entreprises = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entreprises;
    }

    // Exercice 3.2: Rechercher une entreprise par son nom
    public Entreprise getEntrepriseByName(String nom) {
        Entreprise entreprise = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Entreprise> query = session.createQuery("FROM Entreprise WHERE nomEnt = :nom", Entreprise.class);
            query.setParameter("nom", nom);
            entreprise = query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entreprise;
    }

    // Exercice 3.3: Rechercher toutes les entreprises triées par nombre d'employés
    public List<Entreprise> getAllEntreprisesSortedByEmployees() {
        List<Entreprise> entreprises = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Entreprise> query = session.createQuery("FROM Entreprise ORDER BY nbEmployes", Entreprise.class);
            entreprises = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entreprises;
    }

    // Exercice 3.4: Compter le nombre d'entreprises
    public Long countEntreprises() {
        Long count = 0L;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery("SELECT COUNT(*) FROM Entreprise", Long.class);
            count = query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    // Exercice 4.1: Mettre à jour le nom d'une entreprise
    public void updateEntrepriseName(Integer id, String nouveauNom) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Entreprise entreprise = session.get(Entreprise.class, id);
            if (entreprise != null) {
                entreprise.setNomEnt(nouveauNom);
                session.update(entreprise);
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Exercice 4.2: Supprimer une entreprise par son identifiant
    public void deleteEntreprise(Integer id) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Entreprise entreprise = session.get(Entreprise.class, id);
            if (entreprise != null) {
                session.delete(entreprise);
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Entreprises")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEntreprise;

    @Column(name = "nomEnt")
    private String nomEnt;

    @Column(name = "listeActivites")
    private String listeActivites;

    @Column(name = "nbEmployes")
    private Integer nbEmployes;

    // Constructeurs
    public Entreprise() {
    }

    public Entreprise(String nomEnt, String listeActivites, Integer nbEmployes) {
        this.nomEnt = nomEnt;
        this.listeActivites = listeActivites;
        this.nbEmployes = nbEmployes;
    }

    // Getters et Setters
    public Integer getIdEntreprise() {
        return idEntreprise;
    }

    public void setIdEntreprise(Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }

    public String getNomEnt() {
        return nomEnt;
    }

    public void setNomEnt(String nomEnt) {
        this.nomEnt = nomEnt;
    }

    public String getListeActivites() {
        return listeActivites;
    }

    public void setListeActivites(String listeActivites) {
        this.listeActivites = listeActivites;
    }

    public Integer getNbEmployes() {
        return nbEmployes;
    }

    public void setNbEmployes(Integer nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    @Override
    public String toString() {
        return "Entreprise [idEntreprise=" + idEntreprise + ", nomEnt=" + nomEnt +
                ", listeActivites=" + listeActivites + ", nbEmployes=" + nbEmployes + "]";
    }
}
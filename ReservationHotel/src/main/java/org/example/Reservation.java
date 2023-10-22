package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Reservation {

    private String nom;
    private String prenom;
    private Client client;
    private Integer prixAPayer;
    private Date dateArrive;
    private Date dateDepart;
    private List<Chambre> chambres;

    public Reservation() {
    }

    public Reservation(String nom, String prenom, Client client, Integer prixAPayer, Date dateArrive, Date dateDepart) {
        this.nom = nom;
        this.prenom = prenom;
        this.client = client;
        this.prixAPayer = prixAPayer;
        this.dateArrive = dateArrive;
        this.dateDepart = dateDepart;
        this.chambres=new ArrayList<>();
    }

    public void ajouterChambre( Chambre chambre){
        chambres.add(chambre);
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Client getClient() {
        return client;
    }

    public Integer getPrixAPayer() {
        return prixAPayer;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDateArrive() {
        return dateArrive;
    }
}


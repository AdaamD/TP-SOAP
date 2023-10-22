package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chambre {
    private Integer numChambre;
    private  Hotel hotel ;
    private Integer etage;
    private Integer nbLit ;
    private Integer prix ;

    private List<Offre> offres = new ArrayList<>();


    public Chambre(Integer numChambre, Hotel hotel, Integer etage , Integer nbLit, Integer prix){
        this.numChambre=numChambre;
        this.hotel=hotel;
        this.etage=etage;
        this.nbLit=nbLit;
        this.prix=prix ;
    }

    public void ajouterOffre(Offre offre) {
        offres.add(offre);
    }
    public List<Offre> getOffres() { return offres;  }

    public Hotel getHotel() {
        return hotel;
    }

    public Integer getEtage() {
        return etage;
    }

    public Integer getNbLit() {
        return nbLit;
    }

    public Integer getNumChambre() {
        return numChambre;
    }

    public Integer getPrix() {
        return prix;
    }


}

package Model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private  String nom;
    private String categorie;
    private Adresse adresse;
    private Integer nbEtoiles;
    private List<Chambre> chambres;
    public Hotel(){}

    public Hotel(String nom, String categorie, Adresse adresse,Integer nbEtoiles ){
        this.nom=nom;
        this.categorie=categorie;
        this.adresse=adresse;
        this.nbEtoiles=nbEtoiles;
        this.chambres=new ArrayList<>();

    }

    public void ajouterChambre ( Chambre chambre){
        chambres.add(chambre);
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public String getNom() {
        return nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Integer getNbEtoiles() {
        return nbEtoiles;
    }
}


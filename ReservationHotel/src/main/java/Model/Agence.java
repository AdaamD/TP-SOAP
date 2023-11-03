package Model;

import java.util.List;

public class Agence {
    private int id;
    private String nom;
    private String motDePasse;
    private List<Hotel> hotels;

    public Agence(int id, String nom, String motDePasse, List<Hotel> hotels) {
        this.id = id;
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.hotels = hotels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }





}


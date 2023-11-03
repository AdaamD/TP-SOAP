package Model;

import java.util.List;

public class Client {
    private  String nom;
    private String prenom;
    private  String mail;
    private  Integer telephone;
    private  CarteCredit carteCredit;
    private List<Reservation> reservations;

    public Client(){}
    public Client(String nom, String prenom , String mail , Integer telephone, CarteCredit carteCredit){
        this.nom=nom;
        this.prenom=prenom;
        this.mail=mail;
        this.telephone=telephone;
        this.carteCredit=carteCredit;

    }

    public Client(String nom, String prenom, String mail, String numeroTelephone, Object carteCredit) {
    }

    public  void ajouterReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public CarteCredit getCarteCredit() {
        return carteCredit;
    }
}

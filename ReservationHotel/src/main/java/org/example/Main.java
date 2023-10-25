package org.example;

import Service.ServiceReservation;
import ServiceImpl.HotelReservationServiceImpl;
import ServiceImpl.ReservationImpl;
import ServiceImpl.ServiceDisponibiliteHotelsImpl;

import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Créez des instances de classes

        // Adresse
        Adresse adresse1 = new Adresse("Pays Exemple", "Ville Exemple", "123 Rue de l'Exemple", "Lieu Exemple", 123456);

        // CarteCredit
        CarteCredit carte1 = new CarteCredit(123456789, new Date(), 123);
        CarteCredit carte2 = new CarteCredit(987654321, new Date(), 321);


        // Hotel
        Hotel hotel1 = new Hotel("H1", "Catégorie de l'Hôtel", adresse1, 4); // 4 étoiles
        Hotel hotel2 = new Hotel("Autre Hôtel", "Catégorie de l'Hôtel", adresse1, 3); // 3 étoiles

        // Chambre
        Chambre chambre1 = new Chambre(1, hotel1, 2, 2, 100); // Chambre de l'hôtel 1
        Chambre chambre2 = new Chambre(2, hotel1, 2, 2, 120);
        Chambre chambre3 = new Chambre(1, hotel2, 3, 3, 80); // Chambre de l'hôtel 2
        Chambre chambre4 = new Chambre(2, hotel2, 3, 3, 90);

        // Client
        Client client1 = new Client("Prénom", "Nom", "email@example.com", 123456789, carte2);
        Client client2 = new Client("Autre Prénom", "Autre Nom", "autreemail@example.com", 987654321, carte2);
        Client clientJoe = new Client("John", "Doe", "johndoe@example.com", 123456789, carte1);

        // Reservation
        Date dateDebut = new Date();
        Date dateFin = new Date();
        Reservation reservation1 = new Reservation("Nom", "Prénom", client1, 150, dateDebut, dateFin);
        Reservation reservation2 = new Reservation("Autre Nom", "Autre Prénom", client2, 180, dateDebut, dateFin);
        Reservation reservationJoe = new Reservation("Joe", "OEJ", clientJoe, 150, dateDebut, dateFin);

        List<Offre> offres = new ArrayList<>();

        //  Offre
        Offre offre1 = new Offre(1, "Chambre simple", "2023-11-01", "2023-11-10", 80.0);
        Offre offre2 = new Offre(2, "Chambre double", "2023-11-02", "2023-11-12", 120.0);
        Offre offre3 = new Offre(3, "Suite de luxe", "2023-11-01", "2023-11-11", 200.0);

        offres.add(offre1);
        offres.add(offre2);
        offres.add(offre3);

        // Ajoutez des chambres aux réservations
        reservation1.ajouterChambre(chambre1);
        reservation1.ajouterChambre(chambre2);
        reservation2.ajouterChambre(chambre3);
        reservation2.ajouterChambre(chambre4);
        reservationJoe.ajouterChambre(chambre1);
        reservationJoe.ajouterChambre(chambre2);

        // Affichez ou utilisez les instances créées
        System.out.println("Informations sur la réservation 1 :");
        System.out.println("Client : " + reservation1.getPrenom() + " " + reservation1.getNom());
        System.out.println("Hôtel : " + reservation1.getChambres().get(0).getHotel().getNom());
        System.out.println("Chambre : " + reservation1.getChambres().get(0).getNumChambre());
        System.out.println("Dates de réservation : " + reservation1.getDateArrive() + " - " + reservation1.getDateDepart());

        System.out.println("\nInformations sur la réservation 2 :");
        System.out.println("Client : " + reservation2.getPrenom() + " " + reservation2.getNom());
        System.out.println("Hôtel : " + reservation2.getChambres().get(0).getHotel().getNom());
        System.out.println("Chambre : " + reservation2.getChambres().get(0).getNumChambre());
        System.out.println("Dates de réservation : " + reservation2.getDateArrive() + " - " + reservation2.getDateDepart());

        Endpoint.publish("http://localhost:8080/hotelreservationservice", new HotelReservationServiceImpl());
        Endpoint.publish("http://localhost:8080/service-disponibilite", new ServiceDisponibiliteHotelsImpl(offres));
        Endpoint.publish("http://localhost:8080/service-reservation", new ReservationImpl());


        System.out.println("Serveur Ready to use \n");



    }

}

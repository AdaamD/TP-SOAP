package Model;

import ServiceImpl.RechercheChambreAgenceImpl;
import ServiceImpl.RechercheChambreHotelImpl; //ok

import ServiceImpl.ReservationChambreAvecAgenceImpl;
import ServiceImpl.ReservationChambreImpl;

import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//Hotel Ibis
    // Adresse
        Adresse adresseIbis = new Adresse("France", "Montpellier", "123 Rue de ganges", "occitanie", 123456);

    // CarteCredit
        CarteCredit carteIbis1 = new CarteCredit(123456789, new Date(), 123);
        CarteCredit carteIbis2 = new CarteCredit(987654321, new Date(), 321);


    // Hotel
        Hotel hotelIbis = new Hotel("Ibis", " hôtel offre un niveau de luxe", adresseIbis, 4); // 4 étoiles

    // Chambre
        Chambre chambreIbis1 = new Chambre(1, hotelIbis, 1, 2, 100); // Chambre de l'hôtel 1
        Chambre chambreIbis2 = new Chambre(2, hotelIbis, 2, 2, 120);
        Chambre chambreIbis3 = new Chambre(3, hotelIbis, 3, 3, 80); // Chambre de l'hôtel 2
        Chambre chambreIbis4 = new Chambre(4, hotelIbis, 3, 3, 90);

        chambreIbis1.setDisponible(true);
        chambreIbis2.setDisponible(true);
        chambreIbis3.setDisponible(true);
        chambreIbis4.setDisponible(true);

        chambreIbis1.setImage("img/5");
        chambreIbis2.setImage("img/6");
        chambreIbis3.setImage("img/7");
        chambreIbis4.setImage("img/8");

    // Client
        Client clientIbis1 = new Client("NAB", "DAF", "nabil@gmail.com", 123456789, carteIbis1);
        Client clientIbis2 = new Client("AD", "AM", "adam@gmail.com", 987654321, carteIbis2);



    //Liste de clients
        List<Client> clientsIbis = new ArrayList<>();
        clientsIbis.add(clientIbis1);
        clientsIbis.add(clientIbis2);

    //Liste de chambre
        List<Chambre> chambresIbis = new ArrayList<>();
        chambresIbis.add(chambreIbis1);
        chambresIbis.add(chambreIbis2);
        chambresIbis.add(chambreIbis3);
        chambresIbis.add(chambreIbis4);

        System.out.println(chambresIbis);



 /* -------------------------------------------------------*/

//Hotel Kyriad

    // Adresse
        Adresse adresseKyriad1 = new Adresse("France", "Paris", "58 Rue de champ", "Arc", 12345);

    // CarteCredit
        CarteCredit carte1 = new CarteCredit(567891234, new Date(), 980);
        CarteCredit carte2 = new CarteCredit(987321654, new Date(), 001);


    // Hotel
        Hotel hotelKyriad = new Hotel("Kyriad", " hôtel de luxe avec chambredouble", adresseKyriad1, 3); // 4 étoiles

    // Chambre
        Chambre chambreKyriad1 = new Chambre(1, hotelKyriad, 0, 1, 50); // Chambre de l'hôtel 1
        Chambre chambreKyriad2 = new Chambre(2, hotelKyriad, 0, 2, 70);
        Chambre chambreKyriad3 = new Chambre(3, hotelKyriad, 4, 3, 120); // Chambre de l'hôtel 2
        Chambre chambreKyriad4 = new Chambre(4, hotelKyriad, 1, 2, 80);

        chambreKyriad1.setDisponible(true);
        chambreKyriad2.setDisponible(true);
        chambreKyriad3.setDisponible(true);
        chambreKyriad4.setDisponible(true);

        chambreKyriad1.setImage("img/1");
        chambreKyriad2.setImage("img/2");
        chambreKyriad3.setImage("img/3");
        chambreKyriad4.setImage("img/4");

    // Client
        Client clientKyriad1 = new Client("DUPONT", "PIERRE", "paul@gmail.com", 123456789, carte1);
        Client clientKyriad2 = new Client("ANTOINE", "MARC", "marc@gmail.com", 987654321, carte2);


    //Liste de chambre
        List<Chambre> chambresKyriad = new ArrayList<>();
        chambresKyriad.add(chambreKyriad1);
        chambresKyriad.add(chambreKyriad2);
        chambresKyriad.add(chambreKyriad3);
        chambresKyriad.add(chambreKyriad4);

        System.out.println(chambresKyriad);




/*-------------------------------------------------------*/
List<Client> clientsKyriad = new ArrayList<>();
        clientsKyriad.add(clientKyriad1);
        clientsKyriad.add(clientKyriad2);

List<Hotel> listeHotels= new ArrayList<>( );
    listeHotels.add(hotelIbis);
    listeHotels.add(hotelKyriad);

List<Client> listeClients= new ArrayList<>( );
        listeClients.add(clientIbis1);
        listeClients.add(clientIbis2);
        listeClients.add(clientKyriad1);
        listeClients.add(clientKyriad2);

List<Chambre> listeChambres = new ArrayList<>();
        listeChambres.add(chambreKyriad1);
        listeChambres.add(chambreKyriad2);
        listeChambres.add(chambreKyriad3);
        listeChambres.add(chambreKyriad4);

        listeChambres.add(chambreIbis1);
        listeChambres.add(chambreIbis2);
        listeChambres.add(chambreIbis3);
        listeChambres.add(chambreIbis4);



// SW IBIS
        Endpoint.publish("http://localhost:8080/service-recherche-chambre-ibis", new RechercheChambreHotelImpl(chambresIbis));
        Endpoint.publish("http://localhost:8080/service-reservation-chambre-ibis", new ReservationChambreImpl(chambresIbis, clientsIbis));

// SW KYRIAD
        Endpoint.publish("http://localhost:8080/service-recherche-chambre-kyriad", new RechercheChambreHotelImpl(chambresKyriad));
        Endpoint.publish("http://localhost:8080/service-reservation-chambre-kyriad", new ReservationChambreImpl(chambresKyriad, clientsKyriad));

// SW AGENCE
        Endpoint.publish("http://localhost:8080/service-recherche-chambre-agence", new RechercheChambreAgenceImpl(listeHotels));
        Endpoint.publish("http://localhost:8080/service-reservation-chambre-agence", new ReservationChambreAvecAgenceImpl(listeHotels, listeClients, listeChambres));

        System.out.println("Serveur ready to use ");



    }

}

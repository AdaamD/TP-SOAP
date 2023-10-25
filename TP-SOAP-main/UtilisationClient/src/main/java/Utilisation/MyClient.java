package Utilisation;

import java.net.URL;
import java.util.List;

import Consomation.Hotel;
import Consomation.Offre;

import Consomation.ServiceDisponibiliteHotelsImplService;
import Consomation.ServiceDisponibiliteHotels;

import ConsomationReservation.ReservationImplService;
import ConsomationReservation.ServiceReservation;


public class MyClient {
    public static void main(String[] args) {
        try {

    //Service Web : ServiceDisponibiliteHotels

            // Créez une instance de l'URL du service de disponibilité d'hôtel à consommer
            URL urlHotel = new URL("http://localhost:8080/service-disponibilite?wsdl");
            ServiceDisponibiliteHotelsImplService serviceHotel = new ServiceDisponibiliteHotelsImplService(urlHotel);
            ServiceDisponibiliteHotels proxyHotel = serviceHotel.getServiceDisponibiliteHotelsImplPort();

    //Service Web : ServiceReservation
            // Créez une instance de l'URL du service de réservation à consommer
            URL urlReservation = new URL("http://localhost:8080/service-reservation?wsdl");
            ReservationImplService serviceReservation = new ReservationImplService(urlReservation);
            ServiceReservation proxyReservation = serviceReservation.getReservationImplPort();

            // Appelez la méthode "consulterDisponibilites" pour obtenir les disponibilités d'un hôtel
            String hotelRecherche = "hotel1"; // Remplacez "Hotel1" par le nom de l'hôtel que vous recherchez
            List<Offre> offresDisponibles = proxyHotel.consulterDisponibilites(hotelRecherche, "2023-11-01", "2023-11-10", 2);

            // Appelez la méthode "effectuerReservation" pour effectuer une réservation
            String nomHotel = "H1"; // Remplacez par le nom de l'hôtel
            int idOffre = 1; // Remplacez par l'ID de l'offre
            String nomClient = "Adam";
            String prenomClient = "D";
            String emailClient = "AD@example.com";
            int telephoneClient = 123456789;

            String resultatReservation = proxyReservation.effectuerReservation(nomHotel, idOffre, nomClient, prenomClient, emailClient, telephoneClient);
            System.out.println("Résultat de la réservation : " + resultatReservation);

            // Traitez les réponses du service web si nécessaire
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

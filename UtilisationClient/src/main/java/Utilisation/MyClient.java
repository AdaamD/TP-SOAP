package Utilisation;

import java.net.URL;
import java.util.List;


import ConsomationRechercheChambre.Chambre;
import ConsomationRechercheChambre.Offre;
import ConsomationRechercheChambre.RechercheChambreHotel;
import ConsomationRechercheChambre.RechercheChambreHotelImplService;
import ConsomationReservationChambre.ReservationChambre;
import ConsomationReservationChambre.ReservationChambreImplService;


public class MyClient {
    public static void main(String[] args) {
        try {


/* SW Recherche Chambre */

    // Créez une instance du service de recherche de chambres
            URL urlRechercheChambre = new URL("http://localhost:8080/service-recherche-chambre-kyriad?wsdl");
            RechercheChambreHotelImplService serviceRechercheChambre = new RechercheChambreHotelImplService(urlRechercheChambre);
            RechercheChambreHotel proxyRechercheChambre = serviceRechercheChambre.getRechercheChambreHotelImplPort();

            List<Offre> offresTrouvees = proxyRechercheChambre.rechercherChambres(70, 100, 2);

            System.out.println("Offres correspondant à votre demande :");
            for (ConsomationRechercheChambre.Offre offre : offresTrouvees) {
                System.out.println("\nID de l'offre : " + offre.getIdOffre());
                System.out.println("Prix : " + offre.getPrix());
                System.out.println("Nombre de lits : " + offre.getNombreLits() + "\n");
            }


/* SW Reservation Chambre */

            String serviceURL = "http://localhost:8080/service-reservation-chambre-ibis?wsdl";
            ReservationChambreImplService serviceReservationChambre = new ReservationChambreImplService(new URL(serviceURL));
            ReservationChambre proxyReservationChambre = serviceReservationChambre.getReservationChambreImplPort();

            String resultatRES1 = proxyReservationChambre.reserverChambre(1, "AD", "AM", "01/01/2023", "07/01/2023");
            String resultatRES2 = proxyReservationChambre.reserverChambre(1, "NAB", "DAF", "01/01/2023", "07/01/2023");

            System.out.println(resultatRES1);
            System.out.println(resultatRES2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

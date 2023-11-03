package Utilisation;

import java.net.URL;
import java.util.List;


import ConsomationRechercheChambre.Chambre;
import ConsomationRechercheChambre.RechercheChambreHotel;
import ConsomationRechercheChambre.RechercheChambreHotelImplService;
import ConsomationReservationChambre.ReservationChambre;
import ConsomationReservationChambre.ReservationChambreImplService;


public class MyClient {
    public static void main(String[] args) {
        try {


/* Recherche Chambre */

    // Créez une instance du service de recherche de chambres
            URL urlRechercheChambre = new URL("http://localhost:8080/service-recherche-chambre?wsdl");
            RechercheChambreHotelImplService serviceRechercheChambre = new RechercheChambreHotelImplService(urlRechercheChambre);
            RechercheChambreHotel proxyRechercheChambre = serviceRechercheChambre.getRechercheChambreHotelImplPort();

    // Appelez la méthode "rechercherChambres" pour rechercher des chambres
            int prixMin = 80;
            int prixMax = 100;
            int nbLit = 2;

            List<Chambre> chambresTrouvees = proxyRechercheChambre.rechercherChambres(prixMin, prixMax, nbLit);
            System.out.println("Chambres correspondant à votre demande : \n "+chambresTrouvees);

    // Traitez les chambres trouvées
            for (Chambre chambre : chambresTrouvees) {
                System.out.println("\nNuméro de chambre : " + chambre.getNumChambre());
                System.out.println("Prix : " + chambre.getPrix()+"\n");
            }


/*Reservation Chambre */
            // Créez une instance du service de réservation de chambres
            // Spécifiez l'URL du service web de réservation de chambres
            String serviceURL = "http://localhost:8080/service-reservation-chambre?wsdl";
            ReservationChambreImplService serviceReservationChambre = new ReservationChambreImplService(new URL(serviceURL));

            ReservationChambre proxyReservationChambre = serviceReservationChambre.getReservationChambreImplPort();

            // Utilisez le proxy pour appeler la méthode de réservation
           /* int numChambre = 1;
            String nom = "AD";
            String prenom = "AM";
            String dateArrive = "01/01/2023";
            String dateDepart = "07/01/2023"; */

            String resultatRES1 = proxyReservationChambre.reserverChambre(1, "AD", "AM", "01/01/2023", "07/01/2023");
            String resultatRES2 = proxyReservationChambre.reserverChambre(1, "NAB", "DAF", "01/01/2023", "07/01/2023");

            // Affichez le résultat de la réservation
            System.out.println(resultatRES1);
            System.out.println(resultatRES2);

    // Traitez les réponses du service web si nécessaire
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

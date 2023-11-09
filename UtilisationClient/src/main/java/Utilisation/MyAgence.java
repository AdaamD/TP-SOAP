package Utilisation;


import java.net.URL;
import java.util.List;

import ConsomationRechercheChambreAgence.Offre;
import ConsomationReservationChambreAgence.ReservationChambreAvecAgence;
import ConsomationReservationChambreAgence.ReservationChambreAvecAgenceImplService;


import ConsomationRechercheChambreAgence.Chambre;
import ConsomationRechercheChambreAgence.RechercheChambreAgence; // Assurez-vous d'importer la classe générée pour le service de recherche de chambres de l'agence
import ConsomationRechercheChambreAgence.RechercheChambreAgenceImplService; // Assurez-vous d'importer la classe générée pour le service de recherche de chambres de l'agence


public class MyAgence {

        public static void main(String[] args) {
            try {

    /* SW Recherche Chambre */
    System.out.println("Démarrage du SW de Recherche de Chambre \n");

                URL urlRechercheChambreAgence = new URL("http://localhost:8080/service-recherche-chambre-agence?wsdl");
                RechercheChambreAgenceImplService serviceRechercheChambreAgence = new RechercheChambreAgenceImplService(urlRechercheChambreAgence);
                RechercheChambreAgence proxyRechercheChambreAgence = serviceRechercheChambreAgence.getRechercheChambreAgenceImplPort();

                // Appel du service web pour obtenir les offres
                List<ConsomationRechercheChambreAgence.Offre> offresTrouvees = proxyRechercheChambreAgence.rechercherChambresAgence(70, 100, 2);

                System.out.println("Offres correspondant à votre demande :");
        // Traitez les offres trouvées
                for (Offre offre : offresTrouvees) {
                    System.out.println("\nID de l'offre : " + offre.getIdOffre());
                    System.out.println("Prix : " + offre.getPrix());
                    System.out.println("Nombre de lits : " + offre.getNombreLits() + "\n");
                }

    /* SW Reservation Chambre */
         System.out.println("Démarrage du SW de Réservation de Chambre \n");

                URL urlReservationChambreAgence = new URL("http://localhost:8080/service-reservation-chambre-agence");
                ReservationChambreAvecAgenceImplService service = new ReservationChambreAvecAgenceImplService(urlReservationChambreAgence);
                ReservationChambreAvecAgence proxy = service.getReservationChambreAvecAgenceImplPort();

                String Reservation1 = proxy.reserverChambreAvecReduction("DUPONT", "PIERRE", 100, 150, 2,  10.0);
                //String Reservation2 = proxy.reserverChambreAvecReduction("AD", "AM", 50, 80, 1,  5.0);

                System.out.println(Reservation1);
               // System.out.println(Reservation2);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}

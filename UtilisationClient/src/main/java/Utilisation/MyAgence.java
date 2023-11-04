package Utilisation;


import java.net.URL;
import java.util.List;

import ConsomationReservationChambreAgence.ReservationChambreAvecAgence;
import ConsomationReservationChambreAgence.ReservationChambreAvecAgenceImplService;


import ConsomationRechercheChambreAgence.Chambre;
import ConsomationRechercheChambreAgence.RechercheChambreAgence; // Assurez-vous d'importer la classe générée pour le service de recherche de chambres de l'agence
import ConsomationRechercheChambreAgence.RechercheChambreAgenceImplService; // Assurez-vous d'importer la classe générée pour le service de recherche de chambres de l'agence

    public class MyAgence {
        public static void main(String[] args) {
            try {

    /* SW Recherche Chambre */

                URL urlRechercheChambreAgence = new URL("http://localhost:8080/service-recherche-chambre-agence?wsdl");
                RechercheChambreAgenceImplService serviceRechercheChambreAgence = new RechercheChambreAgenceImplService(urlRechercheChambreAgence);
                RechercheChambreAgence proxyRechercheChambreAgence = serviceRechercheChambreAgence.getRechercheChambreAgenceImplPort();

                List<Chambre> chambresTrouvees = proxyRechercheChambreAgence.rechercherChambresAgence(50, 120, 2);

                System.out.println("Chambres correspondant a votre demade : "+chambresTrouvees);
                // Traitez les chambres trouvées
                for (Chambre chambre : chambresTrouvees) {
                    System.out.println("\nNuméro de chambre : " + chambre.getNumChambre());
                    System.out.println("Prix : " + chambre.getPrix() + "\n");
                }

    /* SW Reservation Chambre */

                URL urlReservationChambreAgence = new URL("http://localhost:8080/service-reservation-chambre-agence");
                ReservationChambreAvecAgenceImplService service = new ReservationChambreAvecAgenceImplService(urlReservationChambreAgence);
                ReservationChambreAvecAgence proxy = service.getReservationChambreAvecAgenceImplPort();


                String Reservation1 = proxy.reserverChambreAvecReduction("Kyriad", 1, "DUPONT", "PIERRE", "10/01/2023", "12/01/2023", 10.0);
                String Reservation2 = proxy.reserverChambreAvecReduction("Ibis", 3, "ANTOINE", "MARC", "20/02/2023", "2/03/2023", 5);

                System.out.println(Reservation1);
                System.out.println(Reservation2);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}

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

        /*
                // Créez une instance du service de recherche de chambres de l'agence
                URL urlRechercheChambreAgence = new URL("http://localhost:8080/recherche-chambre-par-agence?wsdl");
                RechercheChambreAgenceImplService serviceRechercheChambreAgence = new RechercheChambreAgenceImplService(urlRechercheChambreAgence);
                RechercheChambreAgence proxyRechercheChambreAgence = serviceRechercheChambreAgence.getRechercheChambreAgenceImplPort();

                // Appelez la méthode de recherche de chambres par l'agence
                int prixMin = 50;
                int prixMax = 120;
                int nbLit = 2;

                List<Chambre> chambresTrouvees = proxyRechercheChambreAgence.rechercherChambresAgence(prixMin, prixMax, nbLit);

                System.out.println("Chambres correspondant a votre demade : "+chambresTrouvees);
                // Traitez les chambres trouvées
                for (Chambre chambre : chambresTrouvees) {
                    System.out.println("\nNuméro de chambre : " + chambre.getNumChambre());
                    System.out.println("Prix : " + chambre.getPrix() + "\n");
                }
        */

                // Spécifiez l'URL du service web WSDL
                URL urlReservationChambreAgence = new URL("http://localhost:8080/service-reservation-chambre-agence");

                // Créez une instance du service web
                ReservationChambreAvecAgenceImplService service = new ReservationChambreAvecAgenceImplService(urlReservationChambreAgence);

                // Obtenez le proxy du service web
                ReservationChambreAvecAgence proxy = service.getReservationChambreAvecAgenceImplPort();

                // Remplacez ces valeurs par les données appropriées
                String nomHotel = "Kyriad";
                int numChambre = 1; // Numéro de la chambre
                String nomClient = "DUPONT";
                String prenomClient = "PIERRE";
                String dateArrive = "10/01/2023";
                String dateDepart = "12/01/2023";
                double pourcentageReduction = 10.0; // Pourcentage de réduction

                // Appelez la méthode du service web
                String resultat = proxy.reserverChambreAvecReduction(nomHotel, numChambre, nomClient, prenomClient, dateArrive, dateDepart, pourcentageReduction);

                // Traitez le résultat de la réservation
                System.out.println("Résultat de la réservation : " + resultat);

                // Traitez les réponses du service web si nécessaire
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}

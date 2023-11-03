package ServiceImpl;


import Service.ReservationChambre;
import Model.Chambre;
import Model.Client;
import Model.Reservation;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "Service.ReservationChambre")
public class ReservationChambreImpl implements ReservationChambre {
    private List<Chambre> chambres; // Assurez-vous que cette liste est initialisée correctement dans votre classe Main.
    private List<Client> clients; // Ajoutez une liste de clients

    public ReservationChambreImpl(List<Chambre> chambres,List<Client> clients ) {
        this.chambres = chambres;
        this.clients = clients; // Initialisez la liste de clients
    }

    public ReservationChambreImpl() {}


    public String reserverChambre(int numChambre, String nom, String prenom, String dateArrive, String dateDepart) {
        // Recherche de la chambre par son numéro
        Chambre chambre = null;
        for (Chambre c : chambres) {
            if (c.getNumChambre() == numChambre) {
                chambre = c;
                break;
            }
        }

        // Recherche du client par nom et prénom
        Client client = null;
        for (Client c : clients) { // clients est la liste d'instances de clients dans votre classe Main
            if (c.getNom().equals(nom) && c.getPrenom().equals(prenom)) {
                client = c;
                break;
            }
        }

        // Vérification de la disponibilité de la chambre
        if (chambre != null && chambre.isDisponible()) {
            // Calcul du prix à payer (utilisation de la méthode getPrix de la classe Chambre)
            int prixAPayer = chambre.getPrix();

            // Création de l'instance de réservation avec le client spécifié
            Reservation reservation = new Reservation(nom, prenom, client, prixAPayer, dateArrive, dateDepart);

            // Marquer la chambre comme non disponible
            chambre.setDisponible(false);

            // Retourner un message de confirmation avec le numéro de réservation
            return "\nRéservation confirmée "+"\n Résumé de la reservation :\n" +
                    "   Numéro de réservation : " + reservation.hashCode()+"\n"+
                    "   Prix : " + chambre.getPrix()+"\n"+
                    "   Date d'arrivé : " + reservation.getDateArrive()+"\n" +
                    "   Date départ : " + reservation.getDateDepart() ;
        } else {
            return "\nLa chambre n'est pas disponible pour la réservation.";
        }
    }

}

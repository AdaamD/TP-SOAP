package ServiceImpl;


import Service.ReservationChambreAvecAgence;
import Model.Chambre;
import Model.Client;
import Model.Hotel;
import Model.Reservation;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "Service.ReservationChambreAvecAgence")
public class ReservationChambreAvecAgenceImpl implements ReservationChambreAvecAgence {
    private List<Hotel> listeHotels;
    private List<Client> clients;

    public ReservationChambreAvecAgenceImpl(List<Hotel> listeHotels, List<Client> clients) {
        this.listeHotels = listeHotels;
        this.clients = clients;
    }
    public ReservationChambreAvecAgenceImpl() {
    }

    @Override
    public String reserverChambreAvecReduction(String nomHotel, int numChambre, String nomClient, String prenomClient, String dateArrive, String dateDepart, double pourcentageReduction) {
        // Recherche de l'hotel par son nom
        Hotel hotel = null;
        for (Hotel h : listeHotels) {
            if (h.getNom().equals(nomHotel)) {
                hotel = h;
                break;
            }
        }

        // Recherche de la chambre par son numéro
        Chambre chambre = null;
        if (hotel != null) {
            List<Chambre> chambres = hotel.getChambres();
            for (Chambre c : chambres) {
                if (c.getNumChambre() == numChambre) {
                    chambre = c;
                    break;
                }
            }
        }

        // Vérification de la disponibilité de la chambre
        if (chambre != null && chambre.isDisponible()) {
            // Calcul du prix à payer avec réduction
            int prixAPayer = (int) (chambre.getPrix() * (1.0 - pourcentageReduction / 100.0));

            // Recherche du client par nom et prénom
            Client client = null;
            for (Client c : clients) {
                if (c.getNom().equals(nomClient) && c.getPrenom().equals(prenomClient)) {
                    client = c;
                    break;
                }
            }

            if (client != null) {
                // Création de l'instance de réservation
                Reservation reservation = new Reservation(nomClient, prenomClient, client, prixAPayer, dateArrive, dateDepart);
                // Marquer la chambre comme non disponible
                chambre.setDisponible(false);
                // Retourner un message de confirmation avec le numéro de réservation
                return "\nRéservation confirmée " + "\n Résumé de la reservation :\n" +
                        "   Numéro de réservation : " + reservation.hashCode() + "\n" +
                        "   Prix : " + prixAPayer + "\n" +
                        "   Date d'arrivé : " + dateArrive + "\n" +
                        "   Date départ : " + dateDepart;
            } else {
                return "\nClient non trouvé.";
            }
        } else {
            return "\nLa chambre n'est pas disponible pour la réservation." ;
        }
    }
}

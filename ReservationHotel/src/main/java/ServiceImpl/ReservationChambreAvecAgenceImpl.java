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
    private List<Chambre> listeChambres;

    public ReservationChambreAvecAgenceImpl(List<Hotel> listeHotels, List<Client> clients, List<Chambre> listeChambres) {
        this.listeHotels = listeHotels;
        this.clients = clients;
        this.listeChambres = listeChambres;
    }

    public ReservationChambreAvecAgenceImpl() {}

    @Override
    public String reserverChambreAvecReduction(String nomHotel, int numChambre, String nomClient, String prenomClient, String dateArrive, String dateDepart, double pourcentageReduction) {

    // Recherche de l'hotel par son nom
        System.out.println("Nom d'hôtel recherché : " + nomHotel);
        Hotel hotel = null;
        for (Hotel h : listeHotels) {
            if (h.getNom().equals(nomHotel)) {
                hotel = h;
                break;
            }
        }
        System.out.println("Hotel sélectionné : " + hotel);

    // Recherche de la chamre par son numero
        Chambre chambre = null;
        for (Chambre c : listeChambres) {
            if (c.getNumChambre() == numChambre && c.getHotel().equals(hotel)) {
                chambre = c;
                break;
            }
        }
        System.out.println("Chambre sélectionnée : " + chambre);

    // Vérification de la disponibilité de la chambre
        if (chambre != null && chambre.isDisponible()) {
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
                Reservation reservation = new Reservation(nomClient, prenomClient, client, prixAPayer, dateArrive, dateDepart);
                chambre.setDisponible(false);


            // Retourner un message de confirmation avec le numéro de réservation et le chemin de l'image
                String message = "\nRéservation confirmée !" + "\nRésumé de la reservation :\n" +
                        "   Numéro de réservation : " + reservation.hashCode() + "\n" +
                        "   Prix : " + prixAPayer + "\n" +
                        "   Date d'arrivé : " + dateArrive + "\n" +
                        "   Date départ : " + dateDepart + "\n" +
                        "   Chemin de l'image de la chambre : " + chambre.getImage();
                return message;
            } else { return "\nClient pas dans le repertoire de l'Agence."; }
        } else { return "\nLa chambre n'est pas disponible pour la réservation."; }
    }

}

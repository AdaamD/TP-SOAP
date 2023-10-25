package ServiceImpl;

import Service.ServiceReservation;
import org.example.*;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(endpointInterface = "Service.ServiceReservation")
public class ReservationImpl implements ServiceReservation {

    private List<Hotel> hotels = new ArrayList<>();
    private List<Offre> offres = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();


    @Override
    public String effectuerReservation(String nomHotel, int idOffre, String nomClient, String prenomClient, String emailClient, int telephoneClient) {
        // Recherche de l'offre par ID
        Offre offreSelectionnee = null;
        for (Offre offre : offres) {
            if (offre.getIdOffre() == idOffre) {
                offreSelectionnee = offre;
                break;
            }
        }

        // Vérification si l'offre a été trouvée
        if (offreSelectionnee == null) {
            return "Offre non trouvée";
        }

        // Recherche de l'hôtel par nom
        Hotel hotelSelectionne = null;
        for (Hotel hotel : hotels) {
            if (hotel.getNom().equals(nomHotel)) {
                hotelSelectionne = hotel;
                break;
            }
        }

        // Vérification si l'hôtel a été trouvé
        if (hotelSelectionne == null) {
            return "Hôtel non trouvé";
        }

        // Création du client
        CarteCredit carteClient = new CarteCredit(123456789, new Date(), 123);
        Client client = new Client(nomClient, prenomClient, emailClient, telephoneClient, carteClient);

        // Création de la réservation
        Date dateDebut = new Date();
        Date dateFin = new Date();
        Reservation reservation = new Reservation(nomClient, prenomClient, client, (int) offreSelectionnee.getPrix(), dateDebut, dateFin);
        reservation.ajouterChambre(new Chambre(1, hotelSelectionne, 1, 2, 100));

        // Ajout de la réservation à la liste
        reservations.add(reservation);

        // Génération d'une référence de réservation (vous pouvez personnaliser cela davantage)
        String referenceReservation = "RES" + reservations.size();

        return "Réservation effectuée avec succès. Référence : " + referenceReservation;
    }


    @Override
    public Reservation getDetailReservation(String referenceReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.getNom().equals(referenceReservation)) {
                return reservation;
            }
        }
        return null; // Réservation non trouvée
    }


}

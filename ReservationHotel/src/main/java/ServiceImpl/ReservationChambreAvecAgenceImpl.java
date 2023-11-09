package ServiceImpl;

import Model.Hotel;
import Service.ReservationChambreAvecAgence;
import Service.RechercheChambreAgence;
import Model.Client;
import Model.Reservation;

import javax.jws.WebService;
import java.util.List;
import java.util.Scanner;

import Model.Offre;

@WebService(endpointInterface = "Service.ReservationChambreAvecAgence")
public class ReservationChambreAvecAgenceImpl implements ReservationChambreAvecAgence {
    private List<Client> clients;
    private List<Hotel> listeHotels;
    private static int id = 1;

    public ReservationChambreAvecAgenceImpl(List<Client> clients, List<Hotel> listeHotels) {
        this.clients = clients;
        this.listeHotels = listeHotels;
    }

    public ReservationChambreAvecAgenceImpl() { }

    @Override
    public String reserverChambreAvecReduction(String nomClient, String prenomClient, int prixMin, int prixMax, int nbLit, double pourcentageReduction) {
        // Utilisez le service web de recherche d'offres de l'agence
        RechercheChambreAgence rechercheService = new RechercheChambreAgenceImpl(listeHotels);
        List<Offre> offres = rechercheService.rechercherChambresAgence(prixMin, prixMax, nbLit);

        if (offres != null && !offres.isEmpty()) {
            // Recherchez le client dans la liste des clients
            Client client = null;

            for (Client c : clients) {
                if (c.getNom().equals(nomClient) && c.getPrenom().equals(prenomClient)) {
                    client = c;
                    break;
                }
            }

            if (client != null) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Liste des offres disponibles :");
                for (int i = 0; i < offres.size(); i++) {
                    Offre offre = offres.get(i);
                    System.out.println("Offre " + (i + 1) + ":");
                    System.out.println("Numéro de l'offre : " + offre.getIdOffre());
                    System.out.println("Prix : " + offre.getPrix());
                    System.out.println("Nombre de lits : " + offre.getNombreLits());
                    System.out.println();
                }

                // Demandez à l'utilisateur de saisir le numéro de l'offre qu'il souhaite
                System.out.print("Saisissez le numéro de l'offre que vous souhaitez (1, 2, ...) : ");
                int choixUtilisateur = scanner.nextInt();

                if (choixUtilisateur >= 1 && choixUtilisateur <= offres.size()) {
                    Offre offreSelectionnee = offres.get(choixUtilisateur - 1);

                    // Calculez le prix à payer en appliquant la réduction
                    double prixAPayer = offreSelectionnee.getPrix() * (1.0 - pourcentageReduction / 100.0);

                    // Créez une instance de Reservation
                    Reservation reservation = new Reservation(id++, nomClient, prenomClient, client, prixAPayer);

                    // Ajoutez la réservation à la liste des réservations du client
                    // client.ajouterReservation(reservation);

                    // Retournez un message de confirmation
                    return "Réservation confirmée !\n Résumé de la réservation :\n" +
                            "   Numéro de réservation : " + reservation.getId() + "\n" +
                            "   Client : " + nomClient + " " + prenomClient + "\n" +
                            "   Prix à payer : " + prixAPayer + "\n" +
                            "   Offre sélectionnée : " + offreSelectionnee.getIdOffre();
                } else {
                    return "Numéro d'offre non valide. Veuillez choisir un numéro valide.";
                }
            } else {
                return "Client non trouvé.";
            }
        } else {
            return "Aucune offre correspondante aux critères de recherche n'a été trouvée.";
        }
    }
}

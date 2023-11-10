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

import Model.Agence;

@WebService(endpointInterface = "Service.ReservationChambreAvecAgence")
public class ReservationChambreAvecAgenceImpl implements ReservationChambreAvecAgence {
    private List<Client> clients;
    private List<Hotel> listeHotels;
    private Agence agence;
    private static int id = 1;

    public ReservationChambreAvecAgenceImpl(List<Client> clients, List<Hotel> listeHotels, Agence agence) {
        this.clients = clients;
        this.listeHotels = listeHotels;
        this.agence = agence;
    }

    public ReservationChambreAvecAgenceImpl() { }

    @Override
    public String reserverChambreAvecReduction(String nomClient, String prenomClient, int prixMin, int prixMax, int nbLit, double pourcentageReduction) {
        Scanner scanner = new Scanner(System.in);

// Demandez à l'utilisateur de saisir le Nom et le mot de Passe de l'agence
        System.out.print("Saisissez le nom de l'agence : ");
        String nomAgence = scanner.nextLine();
        System.out.print("Saisissez le mot de passe de l'agence : ");
        String motDePasse = scanner.nextLine();

        // Vérifiez les informations d'identification de l'agence
        if (!agence.getNom().equals(nomAgence) || !agence.getMotDePasse().equals(motDePasse)) {
            return "Nom d'agence ou mot de passe incorrect. Veuillez réessayer.";
        }

        // Utilisation du service web de recherche d'offres de l'agence
        RechercheChambreAgence rechercheService = new RechercheChambreAgenceImpl(listeHotels);
        List<Offre> offres = rechercheService.rechercherChambresAgence(prixMin, prixMax, nbLit);

        if (offres == null || offres.isEmpty()) {
            return "Aucune offre correspondante aux critères de recherche n'a été trouvée.";
        }

        Client client = null;

        for (Client c : clients) {
            if (c.getNom().equals(nomClient) && c.getPrenom().equals(prenomClient)) {
                client = c;
                break;
            }
        }

        if (client == null) {
            return "Client non trouvé.";
        }

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

            double prixAPayer = offreSelectionnee.getPrix() * (1.0 - pourcentageReduction / 100.0);

            Reservation reservation = new Reservation(id++, nomClient, prenomClient, client, prixAPayer);

            // Retournez un message de confirmation
            return "Réservation confirmée !\n Résumé de la réservation :\n" +
                    "   Numéro de réservation : " + reservation.getId() + "\n" +
                    "   Client : " + nomClient + " " + prenomClient + "\n" +
                    "   Prix à payer : " + prixAPayer + "\n" +
                    "   Offre sélectionnée : " + offreSelectionnee.getIdOffre();
        } else {
            return "Numéro d'offre non valide. Veuillez choisir un numéro valide.";
        }
    }
}

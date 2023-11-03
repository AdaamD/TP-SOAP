package Model;


public class Reservation {

    private String nom;
    private String prenom;
    private Client client;
    private Integer prixAPayer;
    private String dateArrive;
    private String dateDepart;
//    private List<Chambre> chambres;

    public Reservation() {
    }

    public Reservation(String nom, String prenom, Client client, Integer prixAPayer, String dateArrive, String dateDepart) {
        this.nom = nom;
        this.prenom = prenom;
        this.client = client;
        this.prixAPayer = prixAPayer;
        this.dateArrive = dateArrive;
        this.dateDepart = dateDepart;
    }
/*
    public void ajouterChambre( Chambre chambre){
        chambres.add(chambre);
    }

    public List<Chambre> getChambres() {
        return chambres;
    }
*/
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Client getClient() {
        return client;
    }

    public Integer getPrixAPayer() {
        return prixAPayer;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public String getDateArrive() {
        return dateArrive;
    }
}


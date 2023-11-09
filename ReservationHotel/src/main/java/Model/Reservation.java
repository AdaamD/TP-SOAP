package Model;


public class Reservation {

    private int id;
    private String nom;
    private String prenom;
    private Client client;
    private double prixAPayer;
    private String dateArrive;
    private String dateDepart;
//    private List<Chambre> chambres;

    public Reservation() {
    }

    public Reservation(int id,String nom, String prenom, Client client, double prixAPayer, String dateArrive, String dateDepart) {
        this.id = id ;
        this.nom = nom;
        this.prenom = prenom;
        this.client = client;
        this.prixAPayer = prixAPayer;
        this.dateArrive = dateArrive;
        this.dateDepart = dateDepart;
    }

    public Reservation(int id, String nom, String prenom, Client client, double prixAPayer) {
        this.id = id ;
        this.nom = nom;
        this.prenom = prenom;
        this.client = client;
        this.prixAPayer = prixAPayer;
    }
/*
    public void ajouterChambre( Chambre chambre){
        chambres.add(chambre);
    }

    public List<Chambre> getChambres() {
        return chambres;
    }
*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Client getClient() {
        return client;
    }

    public double getPrixAPayer() {
        return prixAPayer;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public String getDateArrive() {
        return dateArrive;
    }
}


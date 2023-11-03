package Model;

public class Offre {
    private int idOffre;
    private String typeChambre;
    private String dateDisponibilite;
    private String dateExpiration;

    private double prix;
    private int nombreLits;


    public Offre() {
    }

    public Offre(int idOffre, String typeChambre, String dateDisponibilite, String dateExpiration, double prix) {
        this.idOffre = idOffre;
        this.typeChambre = typeChambre;
        this.dateDisponibilite = dateDisponibilite;
        this.dateExpiration = dateExpiration;
        this.prix = prix;
    }



    public boolean isDisponible(String dateArrivee, String dateDepart, int nombrePersonnes) {
        return dateArrivee.compareTo(dateDisponibilite) >= 0 && dateDepart.compareTo(dateExpiration) <= 0;
    }
    public int getNombreLits() {
        return nombreLits;
    }
    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }

    public String getDateDisponibilite() {
        return dateDisponibilite;
    }

    public void setDateDisponibilite(String dateDisponibilite) {
        this.dateDisponibilite = dateDisponibilite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}

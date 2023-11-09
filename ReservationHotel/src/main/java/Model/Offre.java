package Model;

public class Offre {
    private int idOffre;
    private String dateDisponibilite;
    private String dateExpiration;

    private int prix;
    private int nombreLits;


    public Offre() {
    }

    public Offre(int idOffre, String dateDisponibilite, String dateExpiration, int prix) {
        this.idOffre = idOffre;
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

    public String getDateDisponibilite() {
        return dateDisponibilite;
    }

    public void setDateDisponibilite(String dateDisponibilite) {
        this.dateDisponibilite = dateDisponibilite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void setNombreLits(int nombreLits) {
        this.nombreLits = nombreLits;
    }
}

package Model;

public class Adresse {
    private String pays;
    private String ville;
    private  String rue;
    private String lieuDit;
    private Integer positionGPS;


    public Adresse(){}
    public Adresse ( String pays, String ville, String rue, String lieuDit, Integer positionGPS){
        this.pays=pays;
        this.ville=ville;
        this.rue=rue;
        this.lieuDit=lieuDit;
        this.positionGPS=positionGPS ;
    }

    public String getPays() {
        return pays;
    }

    public String getVille() {
        return ville;
    }

    public String getRue() {
        return rue;
    }

    public String getLieuDit() {
        return lieuDit;
    }

    public Integer getPositionGPS() {
        return positionGPS;
    }
}

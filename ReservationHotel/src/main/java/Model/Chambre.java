package Model;



public class Chambre {


    private int numChambre;
    private  Hotel hotel ;
    private int étage;
    private int nombreLit ;
    private int prix ;
    private boolean disponible ;

    private String image;


    public Chambre() {}

    public Chambre(int numChambre, Hotel hotel, int étage , int nombreLit, int prix){

        this.numChambre=numChambre;
        this.hotel=hotel;
        this.étage=étage;
        this.nombreLit=nombreLit;
        this.prix=prix ;
    }



    public Hotel getHotel() {
        return hotel;
    }

    public int getEtage() {
        return étage;
    }

    public int getNbLit() {
        return nombreLit;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public int getPrix() {
        return prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}


package ConsomationRechercheChambre;

import Model.Hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour chambre complex type.
 *
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="chambre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
        "disponible","numChambre","hotel", "étage","nombreLit", "prix"})
public class Chambre {

    private int numChambre;
    private Model.Hotel hotel ;
    private int étage;
    private int nombreLit ;
    private int prix ;
    private boolean disponible ;


    public Chambre() {}

    public Chambre(int numChambre, Model.Hotel hotel, int étage , int nombreLit, int prix){

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

}

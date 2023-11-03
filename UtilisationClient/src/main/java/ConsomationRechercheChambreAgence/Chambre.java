
package ConsomationRechercheChambreAgence;

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
    "disponible"
})
public class Chambre {

    private int numChambre;

    private int prix ;

    protected boolean disponible;

    public Chambre(int numChambre, int prix){

        this.numChambre=numChambre;
        this.prix=prix ;
    }

    public Chambre(){}
    /**
     * Obtient la valeur de la propri�t� disponible.
     * 
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * D�finit la valeur de la propri�t� disponible.
     * 
     */
    public void setDisponible(boolean value) {
        this.disponible = value;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public int getPrix() {
        return prix;
    }

}

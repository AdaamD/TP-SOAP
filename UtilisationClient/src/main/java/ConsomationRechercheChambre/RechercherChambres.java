
package ConsomationRechercheChambre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rechercherChambres complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rechercherChambres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prixMinimum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="prixMaximum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nbLit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercherChambres", propOrder = {
    "prixMinimum",
    "prixMaximum",
    "nbLit"
})
public class RechercherChambres {

    protected float prixMinimum;
    protected float prixMaximum;
    protected int nbLit;

    /**
     * Obtient la valeur de la propriété prixMinimum.
     * 
     */
    public float getPrixMinimum() {
        return prixMinimum;
    }

    /**
     * Définit la valeur de la propriété prixMinimum.
     * 
     */
    public void setPrixMinimum(float value) {
        this.prixMinimum = value;
    }

    /**
     * Obtient la valeur de la propriété prixMaximum.
     * 
     */
    public float getPrixMaximum() {
        return prixMaximum;
    }

    /**
     * Définit la valeur de la propriété prixMaximum.
     * 
     */
    public void setPrixMaximum(float value) {
        this.prixMaximum = value;
    }

    /**
     * Obtient la valeur de la propriété nbLit.
     * 
     */
    public int getNbLit() {
        return nbLit;
    }

    /**
     * Définit la valeur de la propriété nbLit.
     * 
     */
    public void setNbLit(int value) {
        this.nbLit = value;
    }

}

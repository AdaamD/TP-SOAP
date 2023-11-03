
package ConsomationRechercheChambreAgence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rechercherChambresAgence complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rechercherChambresAgence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prixMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prixMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "rechercherChambresAgence", propOrder = {
    "prixMin",
    "prixMax",
    "nbLit"
})
public class RechercherChambresAgence {

    protected int prixMin;
    protected int prixMax;
    protected int nbLit;

    /**
     * Obtient la valeur de la propriété prixMin.
     * 
     */
    public int getPrixMin() {
        return prixMin;
    }

    /**
     * Définit la valeur de la propriété prixMin.
     * 
     */
    public void setPrixMin(int value) {
        this.prixMin = value;
    }

    /**
     * Obtient la valeur de la propriété prixMax.
     * 
     */
    public int getPrixMax() {
        return prixMax;
    }

    /**
     * Définit la valeur de la propriété prixMax.
     * 
     */
    public void setPrixMax(int value) {
        this.prixMax = value;
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

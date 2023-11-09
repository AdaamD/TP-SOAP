
package ConsomationRechercheChambreAgence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour offre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDisponibilite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOffre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreLits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offre", propOrder = {
    "dateDisponibilite",
    "idOffre",
    "nombreLits",
    "prix"
})
public class Offre {

    protected String dateDisponibilite;
    protected int idOffre;
    protected int nombreLits;
    protected int prix;

    /**
     * Obtient la valeur de la propriété dateDisponibilite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDisponibilite() {
        return dateDisponibilite;
    }

    /**
     * Définit la valeur de la propriété dateDisponibilite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDisponibilite(String value) {
        this.dateDisponibilite = value;
    }

    /**
     * Obtient la valeur de la propriété idOffre.
     * 
     */
    public int getIdOffre() {
        return idOffre;
    }

    /**
     * Définit la valeur de la propriété idOffre.
     * 
     */
    public void setIdOffre(int value) {
        this.idOffre = value;
    }

    /**
     * Obtient la valeur de la propriété nombreLits.
     * 
     */
    public int getNombreLits() {
        return nombreLits;
    }

    /**
     * Définit la valeur de la propriété nombreLits.
     * 
     */
    public void setNombreLits(int value) {
        this.nombreLits = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(int value) {
        this.prix = value;
    }

}

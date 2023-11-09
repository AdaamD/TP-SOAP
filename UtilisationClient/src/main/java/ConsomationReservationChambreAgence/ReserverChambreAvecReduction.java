
package ConsomationReservationChambreAgence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reserverChambreAvecReduction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reserverChambreAvecReduction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prixMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prixMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbLit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pourcentageReduction" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserverChambreAvecReduction", propOrder = {
    "nomClient",
    "prenomClient",
    "prixMin",
    "prixMax",
    "nbLit",
    "pourcentageReduction"
})
public class ReserverChambreAvecReduction {

    protected String nomClient;
    protected String prenomClient;
    protected int prixMin;
    protected int prixMax;
    protected int nbLit;
    protected double pourcentageReduction;

    /**
     * Obtient la valeur de la propriété nomClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * Définit la valeur de la propriété nomClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomClient(String value) {
        this.nomClient = value;
    }

    /**
     * Obtient la valeur de la propriété prenomClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomClient() {
        return prenomClient;
    }

    /**
     * Définit la valeur de la propriété prenomClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomClient(String value) {
        this.prenomClient = value;
    }

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

    /**
     * Obtient la valeur de la propriété pourcentageReduction.
     * 
     */
    public double getPourcentageReduction() {
        return pourcentageReduction;
    }

    /**
     * Définit la valeur de la propriété pourcentageReduction.
     * 
     */
    public void setPourcentageReduction(double value) {
        this.pourcentageReduction = value;
    }

}

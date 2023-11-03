
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
 *         &lt;element name="nomHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numChambre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateArrive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nomHotel",
    "numChambre",
    "nomClient",
    "prenomClient",
    "dateArrive",
    "dateDepart",
    "pourcentageReduction"
})
public class ReserverChambreAvecReduction {

    protected String nomHotel;
    protected int numChambre;
    protected String nomClient;
    protected String prenomClient;
    protected String dateArrive;
    protected String dateDepart;
    protected double pourcentageReduction;

    /**
     * Obtient la valeur de la propriété nomHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomHotel() {
        return nomHotel;
    }

    /**
     * Définit la valeur de la propriété nomHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomHotel(String value) {
        this.nomHotel = value;
    }

    /**
     * Obtient la valeur de la propriété numChambre.
     * 
     */
    public int getNumChambre() {
        return numChambre;
    }

    /**
     * Définit la valeur de la propriété numChambre.
     * 
     */
    public void setNumChambre(int value) {
        this.numChambre = value;
    }

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
     * Obtient la valeur de la propriété dateArrive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateArrive() {
        return dateArrive;
    }

    /**
     * Définit la valeur de la propriété dateArrive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateArrive(String value) {
        this.dateArrive = value;
    }

    /**
     * Obtient la valeur de la propriété dateDepart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDepart() {
        return dateDepart;
    }

    /**
     * Définit la valeur de la propriété dateDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDepart(String value) {
        this.dateDepart = value;
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

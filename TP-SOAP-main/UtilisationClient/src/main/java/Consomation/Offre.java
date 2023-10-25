
package Consomation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour offre complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDisponibilite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOffre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="typeChambre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "prix",
    "typeChambre"
})
public class Offre {

    protected String dateDisponibilite;
    protected int idOffre;
    protected double prix;
    protected String typeChambre;

    /**
     * Obtient la valeur de la propri�t� dateDisponibilite.
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
     * D�finit la valeur de la propri�t� dateDisponibilite.
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
     * Obtient la valeur de la propri�t� idOffre.
     * 
     */
    public int getIdOffre() {
        return idOffre;
    }

    /**
     * D�finit la valeur de la propri�t� idOffre.
     * 
     */
    public void setIdOffre(int value) {
        this.idOffre = value;
    }

    /**
     * Obtient la valeur de la propri�t� prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * D�finit la valeur de la propri�t� prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeChambre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeChambre() {
        return typeChambre;
    }

    /**
     * D�finit la valeur de la propri�t� typeChambre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeChambre(String value) {
        this.typeChambre = value;
    }

}

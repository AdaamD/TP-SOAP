
package ConsomationRechercheChambre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rechercherChambres complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rechercherChambres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "arg0",
    "arg1",
    "arg2"
})
public class RechercherChambres {

    protected float arg0;
    protected float arg1;
    protected int arg2;

    /**
     * Obtient la valeur de la propri�t� arg0.
     * 
     */
    public float getArg0() {
        return arg0;
    }

    /**
     * D�finit la valeur de la propri�t� arg0.
     * 
     */
    public void setArg0(float value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg1.
     * 
     */
    public float getArg1() {
        return arg1;
    }

    /**
     * D�finit la valeur de la propri�t� arg1.
     * 
     */
    public void setArg1(float value) {
        this.arg1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg2.
     * 
     */
    public int getArg2() {
        return arg2;
    }

    /**
     * D�finit la valeur de la propri�t� arg2.
     * 
     */
    public void setArg2(int value) {
        this.arg2 = value;
    }

}
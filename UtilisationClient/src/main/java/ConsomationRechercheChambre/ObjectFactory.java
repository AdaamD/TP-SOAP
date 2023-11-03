
package ConsomationRechercheChambre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ConsomationRechercheChambre package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RechercherChambres_QNAME = new QName("http://Service/", "rechercherChambres");
    private final static QName _RechercherChambresResponse_QNAME = new QName("http://Service/", "rechercherChambresResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ConsomationRechercheChambre
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RechercherChambres }
     * 
     */
    public RechercherChambres createRechercherChambres() {
        return new RechercherChambres();
    }

    /**
     * Create an instance of {@link RechercherChambresResponse }
     * 
     */
    public RechercherChambresResponse createRechercherChambresResponse() {
        return new RechercherChambresResponse();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherChambres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "rechercherChambres")
    public JAXBElement<RechercherChambres> createRechercherChambres(RechercherChambres value) {
        return new JAXBElement<RechercherChambres>(_RechercherChambres_QNAME, RechercherChambres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherChambresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "rechercherChambresResponse")
    public JAXBElement<RechercherChambresResponse> createRechercherChambresResponse(RechercherChambresResponse value) {
        return new JAXBElement<RechercherChambresResponse>(_RechercherChambresResponse_QNAME, RechercherChambresResponse.class, null, value);
    }

}

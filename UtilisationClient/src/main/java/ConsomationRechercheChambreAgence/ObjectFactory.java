
package ConsomationRechercheChambreAgence;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ConsomationRechercheChambreAgence package. 
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

    private final static QName _RechercherChambresAgenceResponse_QNAME = new QName("http://Service/", "rechercherChambresAgenceResponse");
    private final static QName _RechercherChambresAgence_QNAME = new QName("http://Service/", "rechercherChambresAgence");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ConsomationRechercheChambreAgence
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RechercherChambresAgence }
     * 
     */
    public RechercherChambresAgence createRechercherChambresAgence() {
        return new RechercherChambresAgence();
    }

    /**
     * Create an instance of {@link RechercherChambresAgenceResponse }
     * 
     */
    public RechercherChambresAgenceResponse createRechercherChambresAgenceResponse() {
        return new RechercherChambresAgenceResponse();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherChambresAgenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "rechercherChambresAgenceResponse")
    public JAXBElement<RechercherChambresAgenceResponse> createRechercherChambresAgenceResponse(RechercherChambresAgenceResponse value) {
        return new JAXBElement<RechercherChambresAgenceResponse>(_RechercherChambresAgenceResponse_QNAME, RechercherChambresAgenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherChambresAgence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "rechercherChambresAgence")
    public JAXBElement<RechercherChambresAgence> createRechercherChambresAgence(RechercherChambresAgence value) {
        return new JAXBElement<RechercherChambresAgence>(_RechercherChambresAgence_QNAME, RechercherChambresAgence.class, null, value);
    }

}

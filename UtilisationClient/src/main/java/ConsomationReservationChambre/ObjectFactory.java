
package ConsomationReservationChambre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ConsomationReservationChambre package. 
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

    private final static QName _ReserverChambre_QNAME = new QName("http://Service/", "reserverChambre");
    private final static QName _ReserverChambreResponse_QNAME = new QName("http://Service/", "reserverChambreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ConsomationReservationChambre
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserverChambre }
     * 
     */
    public ReserverChambre createReserverChambre() {
        return new ReserverChambre();
    }

    /**
     * Create an instance of {@link ReserverChambreResponse }
     * 
     */
    public ReserverChambreResponse createReserverChambreResponse() {
        return new ReserverChambreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "reserverChambre")
    public JAXBElement<ReserverChambre> createReserverChambre(ReserverChambre value) {
        return new JAXBElement<ReserverChambre>(_ReserverChambre_QNAME, ReserverChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "reserverChambreResponse")
    public JAXBElement<ReserverChambreResponse> createReserverChambreResponse(ReserverChambreResponse value) {
        return new JAXBElement<ReserverChambreResponse>(_ReserverChambreResponse_QNAME, ReserverChambreResponse.class, null, value);
    }

}

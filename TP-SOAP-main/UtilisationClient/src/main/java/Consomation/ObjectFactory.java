
package Consomation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Consomation package. 
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

    private final static QName _ConsulterDisponibilites_QNAME = new QName("http://Service/", "consulterDisponibilites");
    private final static QName _ConsulterDisponibilitesResponse_QNAME = new QName("http://Service/", "consulterDisponibilitesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Consomation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulterDisponibilites }
     * 
     */
    public ConsulterDisponibilites createConsulterDisponibilites() {
        return new ConsulterDisponibilites();
    }

    /**
     * Create an instance of {@link ConsulterDisponibilitesResponse }
     * 
     */
    public ConsulterDisponibilitesResponse createConsulterDisponibilitesResponse() {
        return new ConsulterDisponibilitesResponse();
    }

    /**
     * Create an instance of {@link Offre }
     * 
     */
    public Offre createOffre() {
        return new Offre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterDisponibilites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "consulterDisponibilites")
    public JAXBElement<ConsulterDisponibilites> createConsulterDisponibilites(ConsulterDisponibilites value) {
        return new JAXBElement<ConsulterDisponibilites>(_ConsulterDisponibilites_QNAME, ConsulterDisponibilites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterDisponibilitesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "consulterDisponibilitesResponse")
    public JAXBElement<ConsulterDisponibilitesResponse> createConsulterDisponibilitesResponse(ConsulterDisponibilitesResponse value) {
        return new JAXBElement<ConsulterDisponibilitesResponse>(_ConsulterDisponibilitesResponse_QNAME, ConsulterDisponibilitesResponse.class, null, value);
    }

}

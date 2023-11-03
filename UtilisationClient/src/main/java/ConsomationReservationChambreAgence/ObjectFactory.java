
package ConsomationReservationChambreAgence;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ConsomationReservationChambreAgence package. 
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

    private final static QName _ReserverChambreAvecReductionResponse_QNAME = new QName("http://Service/", "reserverChambreAvecReductionResponse");
    private final static QName _ReserverChambreAvecReduction_QNAME = new QName("http://Service/", "reserverChambreAvecReduction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ConsomationReservationChambreAgence
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserverChambreAvecReduction }
     * 
     */
    public ReserverChambreAvecReduction createReserverChambreAvecReduction() {
        return new ReserverChambreAvecReduction();
    }

    /**
     * Create an instance of {@link ReserverChambreAvecReductionResponse }
     * 
     */
    public ReserverChambreAvecReductionResponse createReserverChambreAvecReductionResponse() {
        return new ReserverChambreAvecReductionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambreAvecReductionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "reserverChambreAvecReductionResponse")
    public JAXBElement<ReserverChambreAvecReductionResponse> createReserverChambreAvecReductionResponse(ReserverChambreAvecReductionResponse value) {
        return new JAXBElement<ReserverChambreAvecReductionResponse>(_ReserverChambreAvecReductionResponse_QNAME, ReserverChambreAvecReductionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambreAvecReduction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "reserverChambreAvecReduction")
    public JAXBElement<ReserverChambreAvecReduction> createReserverChambreAvecReduction(ReserverChambreAvecReduction value) {
        return new JAXBElement<ReserverChambreAvecReduction>(_ReserverChambreAvecReduction_QNAME, ReserverChambreAvecReduction.class, null, value);
    }

}

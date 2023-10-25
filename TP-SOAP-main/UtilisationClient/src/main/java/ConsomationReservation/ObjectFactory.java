
package ConsomationReservation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ConsomationReservation package. 
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

    private final static QName _EffectuerReservationResponse_QNAME = new QName("http://Service/", "effectuerReservationResponse");
    private final static QName _GetDetailReservation_QNAME = new QName("http://Service/", "getDetailReservation");
    private final static QName _GetDetailReservationResponse_QNAME = new QName("http://Service/", "getDetailReservationResponse");
    private final static QName _EffectuerReservation_QNAME = new QName("http://Service/", "effectuerReservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ConsomationReservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EffectuerReservation }
     * 
     */
    public EffectuerReservation createEffectuerReservation() {
        return new EffectuerReservation();
    }

    /**
     * Create an instance of {@link EffectuerReservationResponse }
     * 
     */
    public EffectuerReservationResponse createEffectuerReservationResponse() {
        return new EffectuerReservationResponse();
    }

    /**
     * Create an instance of {@link GetDetailReservation }
     * 
     */
    public GetDetailReservation createGetDetailReservation() {
        return new GetDetailReservation();
    }

    /**
     * Create an instance of {@link GetDetailReservationResponse }
     * 
     */
    public GetDetailReservationResponse createGetDetailReservationResponse() {
        return new GetDetailReservationResponse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectuerReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "effectuerReservationResponse")
    public JAXBElement<EffectuerReservationResponse> createEffectuerReservationResponse(EffectuerReservationResponse value) {
        return new JAXBElement<EffectuerReservationResponse>(_EffectuerReservationResponse_QNAME, EffectuerReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getDetailReservation")
    public JAXBElement<GetDetailReservation> createGetDetailReservation(GetDetailReservation value) {
        return new JAXBElement<GetDetailReservation>(_GetDetailReservation_QNAME, GetDetailReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getDetailReservationResponse")
    public JAXBElement<GetDetailReservationResponse> createGetDetailReservationResponse(GetDetailReservationResponse value) {
        return new JAXBElement<GetDetailReservationResponse>(_GetDetailReservationResponse_QNAME, GetDetailReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectuerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "effectuerReservation")
    public JAXBElement<EffectuerReservation> createEffectuerReservation(EffectuerReservation value) {
        return new JAXBElement<EffectuerReservation>(_EffectuerReservation_QNAME, EffectuerReservation.class, null, value);
    }

}

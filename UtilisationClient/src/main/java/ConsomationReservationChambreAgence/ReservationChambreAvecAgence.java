
package ConsomationReservationChambreAgence;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservationChambreAvecAgence", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationChambreAvecAgence {


    /**
     * 
     * @param prixMin
     * @param prixMax
     * @param prenomClient
     * @param nbLit
     * @param pourcentageReduction
     * @param nomClient
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserverChambreAvecReduction", targetNamespace = "http://Service/", className = "ConsomationReservationChambreAgence.ReserverChambreAvecReduction")
    @ResponseWrapper(localName = "reserverChambreAvecReductionResponse", targetNamespace = "http://Service/", className = "ConsomationReservationChambreAgence.ReserverChambreAvecReductionResponse")
    @Action(input = "http://Service/ReservationChambreAvecAgence/reserverChambreAvecReductionRequest", output = "http://Service/ReservationChambreAvecAgence/reserverChambreAvecReductionResponse")
    public String reserverChambreAvecReduction(
        @WebParam(name = "nomClient", targetNamespace = "")
        String nomClient,
        @WebParam(name = "prenomClient", targetNamespace = "")
        String prenomClient,
        @WebParam(name = "prixMin", targetNamespace = "")
        int prixMin,
        @WebParam(name = "prixMax", targetNamespace = "")
        int prixMax,
        @WebParam(name = "nbLit", targetNamespace = "")
        int nbLit,
        @WebParam(name = "pourcentageReduction", targetNamespace = "")
        double pourcentageReduction);

}

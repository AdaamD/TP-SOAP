
package ConsomationRechercheChambre;

import java.util.List;
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
@WebService(name = "RechercheChambreHotel", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RechercheChambreHotel {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<ConsomationRechercheChambre.Chambre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rechercherChambres", targetNamespace = "http://Service/", className = "ConsomationRechercheChambre.RechercherChambres")
    @ResponseWrapper(localName = "rechercherChambresResponse", targetNamespace = "http://Service/", className = "ConsomationRechercheChambre.RechercherChambresResponse")
    @Action(input = "http://Service/RechercheChambreHotel/rechercherChambresRequest", output = "http://Service/RechercheChambreHotel/rechercherChambresResponse")
    public List<Chambre> rechercherChambres(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
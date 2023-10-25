
package Consomation;

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
@WebService(name = "ServiceDisponibiliteHotels", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceDisponibiliteHotels {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<Consomation.Offre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consulterDisponibilites", targetNamespace = "http://Service/", className = "Consomation.ConsulterDisponibilites")
    @ResponseWrapper(localName = "consulterDisponibilitesResponse", targetNamespace = "http://Service/", className = "Consomation.ConsulterDisponibilitesResponse")
    @Action(input = "http://Service/ServiceDisponibiliteHotels/consulterDisponibilitesRequest", output = "http://Service/ServiceDisponibiliteHotels/consulterDisponibilitesResponse")
    public List<Offre> consulterDisponibilites(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

}
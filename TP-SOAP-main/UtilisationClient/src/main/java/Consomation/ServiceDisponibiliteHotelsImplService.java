
package Consomation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceDisponibiliteHotelsImplService", targetNamespace = "http://ServiceImpl/", wsdlLocation = "http://localhost:8080/service-disponibilite?wsdl")
public class ServiceDisponibiliteHotelsImplService
    extends Service
{

    private final static URL SERVICEDISPONIBILITEHOTELSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEDISPONIBILITEHOTELSIMPLSERVICE_EXCEPTION;
    private final static QName SERVICEDISPONIBILITEHOTELSIMPLSERVICE_QNAME = new QName("http://ServiceImpl/", "ServiceDisponibiliteHotelsImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/service-disponibilite?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEDISPONIBILITEHOTELSIMPLSERVICE_WSDL_LOCATION = url;
        SERVICEDISPONIBILITEHOTELSIMPLSERVICE_EXCEPTION = e;
    }

    public ServiceDisponibiliteHotelsImplService() {
        super(__getWsdlLocation(), SERVICEDISPONIBILITEHOTELSIMPLSERVICE_QNAME);
    }

    public ServiceDisponibiliteHotelsImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEDISPONIBILITEHOTELSIMPLSERVICE_QNAME, features);
    }

    public ServiceDisponibiliteHotelsImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEDISPONIBILITEHOTELSIMPLSERVICE_QNAME);
    }

    public ServiceDisponibiliteHotelsImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEDISPONIBILITEHOTELSIMPLSERVICE_QNAME, features);
    }

    public ServiceDisponibiliteHotelsImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceDisponibiliteHotelsImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceDisponibiliteHotels
     */
    @WebEndpoint(name = "ServiceDisponibiliteHotelsImplPort")
    public ServiceDisponibiliteHotels getServiceDisponibiliteHotelsImplPort() {
        return super.getPort(new QName("http://ServiceImpl/", "ServiceDisponibiliteHotelsImplPort"), ServiceDisponibiliteHotels.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceDisponibiliteHotels
     */
    @WebEndpoint(name = "ServiceDisponibiliteHotelsImplPort")
    public ServiceDisponibiliteHotels getServiceDisponibiliteHotelsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ServiceImpl/", "ServiceDisponibiliteHotelsImplPort"), ServiceDisponibiliteHotels.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEDISPONIBILITEHOTELSIMPLSERVICE_EXCEPTION!= null) {
            throw SERVICEDISPONIBILITEHOTELSIMPLSERVICE_EXCEPTION;
        }
        return SERVICEDISPONIBILITEHOTELSIMPLSERVICE_WSDL_LOCATION;
    }

}
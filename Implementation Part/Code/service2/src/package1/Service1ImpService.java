
package package1;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Service1ImpService", targetNamespace = "http://package1/", wsdlLocation = "http://localhost:8080/service1/?wsdl")
public class Service1ImpService
    extends Service
{

    private final static URL SERVICE1IMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICE1IMPSERVICE_EXCEPTION;
    private final static QName SERVICE1IMPSERVICE_QNAME = new QName("http://package1/", "Service1ImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/service1/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICE1IMPSERVICE_WSDL_LOCATION = url;
        SERVICE1IMPSERVICE_EXCEPTION = e;
    }

    public Service1ImpService() {
        super(__getWsdlLocation(), SERVICE1IMPSERVICE_QNAME);
    }

    public Service1ImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICE1IMPSERVICE_QNAME, features);
    }

    public Service1ImpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE1IMPSERVICE_QNAME);
    }

    public Service1ImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE1IMPSERVICE_QNAME, features);
    }

    public Service1ImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service1ImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Service1Interface
     */
    @WebEndpoint(name = "Service1ImpPort")
    public Service1Interface getService1ImpPort() {
        return super.getPort(new QName("http://package1/", "Service1ImpPort"), Service1Interface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Service1Interface
     */
    @WebEndpoint(name = "Service1ImpPort")
    public Service1Interface getService1ImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://package1/", "Service1ImpPort"), Service1Interface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICE1IMPSERVICE_EXCEPTION!= null) {
            throw SERVICE1IMPSERVICE_EXCEPTION;
        }
        return SERVICE1IMPSERVICE_WSDL_LOCATION;
    }

}

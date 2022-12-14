
package package2;

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
@WebServiceClient(name = "Service2ImpService", targetNamespace = "http://package2/", wsdlLocation = "http://localhost:8080/service2/?wsdl")
public class Service2ImpService
    extends Service
{

    private final static URL SERVICE2IMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICE2IMPSERVICE_EXCEPTION;
    private final static QName SERVICE2IMPSERVICE_QNAME = new QName("http://package2/", "Service2ImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/service2/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICE2IMPSERVICE_WSDL_LOCATION = url;
        SERVICE2IMPSERVICE_EXCEPTION = e;
    }

    public Service2ImpService() {
        super(__getWsdlLocation(), SERVICE2IMPSERVICE_QNAME);
    }

    public Service2ImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICE2IMPSERVICE_QNAME, features);
    }

    public Service2ImpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE2IMPSERVICE_QNAME);
    }

    public Service2ImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE2IMPSERVICE_QNAME, features);
    }

    public Service2ImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service2ImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Service2Interface
     */
    @WebEndpoint(name = "Service2ImpPort")
    public Service2Interface getService2ImpPort() {
        return super.getPort(new QName("http://package2/", "Service2ImpPort"), Service2Interface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Service2Interface
     */
    @WebEndpoint(name = "Service2ImpPort")
    public Service2Interface getService2ImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://package2/", "Service2ImpPort"), Service2Interface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICE2IMPSERVICE_EXCEPTION!= null) {
            throw SERVICE2IMPSERVICE_EXCEPTION;
        }
        return SERVICE2IMPSERVICE_WSDL_LOCATION;
    }

}


package client;

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
@WebServiceClient(name = "CreateOrder", targetNamespace = "http://create_order/", wsdlLocation = "http://localhost:8081/CreateOrder?wsdl")
public class CreateOrder
    extends Service
{

    private final static URL CREATEORDER_WSDL_LOCATION;
    private final static WebServiceException CREATEORDER_EXCEPTION;
    private final static QName CREATEORDER_QNAME = new QName("http://create_order/", "CreateOrder");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/CreateOrder?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREATEORDER_WSDL_LOCATION = url;
        CREATEORDER_EXCEPTION = e;
    }

    public CreateOrder() {
        super(__getWsdlLocation(), CREATEORDER_QNAME);
    }

    public CreateOrder(WebServiceFeature... features) {
        super(__getWsdlLocation(), CREATEORDER_QNAME, features);
    }

    public CreateOrder(URL wsdlLocation) {
        super(wsdlLocation, CREATEORDER_QNAME);
    }

    public CreateOrder(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CREATEORDER_QNAME, features);
    }

    public CreateOrder(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreateOrder(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CreateOrderService
     */
    @WebEndpoint(name = "CreateOrderPort")
    public CreateOrderService getCreateOrderPort() {
        return super.getPort(new QName("http://create_order/", "CreateOrderPort"), CreateOrderService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreateOrderService
     */
    @WebEndpoint(name = "CreateOrderPort")
    public CreateOrderService getCreateOrderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://create_order/", "CreateOrderPort"), CreateOrderService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREATEORDER_EXCEPTION!= null) {
            throw CREATEORDER_EXCEPTION;
        }
        return CREATEORDER_WSDL_LOCATION;
    }

}

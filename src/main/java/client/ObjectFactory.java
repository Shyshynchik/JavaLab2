
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _ReserveProducts_QNAME = new QName("http://create_order/", "ReserveProducts");
    private final static QName _ReserveProductsResponse_QNAME = new QName("http://create_order/", "ReserveProductsResponse");
    private final static QName _Create_QNAME = new QName("http://create_order/", "Create");
    private final static QName _CreateResponse_QNAME = new QName("http://create_order/", "CreateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserveProducts }
     * 
     */
    public ReserveProducts createReserveProducts() {
        return new ReserveProducts();
    }

    /**
     * Create an instance of {@link ReserveProductsResponse }
     * 
     */
    public ReserveProductsResponse createReserveProductsResponse() {
        return new ReserveProductsResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://create_order/", name = "ReserveProducts")
    public JAXBElement<ReserveProducts> createReserveProducts(ReserveProducts value) {
        return new JAXBElement<ReserveProducts>(_ReserveProducts_QNAME, ReserveProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://create_order/", name = "ReserveProductsResponse")
    public JAXBElement<ReserveProductsResponse> createReserveProductsResponse(ReserveProductsResponse value) {
        return new JAXBElement<ReserveProductsResponse>(_ReserveProductsResponse_QNAME, ReserveProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://create_order/", name = "Create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://create_order/", name = "CreateResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

}

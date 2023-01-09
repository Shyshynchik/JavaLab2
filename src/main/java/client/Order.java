
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="orderPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderProduct" type="{http://create_order/}product" minOccurs="0"/>
 *         &lt;element name="orderUser" type="{http://create_order/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "orderCost",
    "orderPayment",
    "orderProduct",
    "orderUser"
})
public class Order {

    protected double orderCost;
    protected boolean orderPayment;
    protected Product orderProduct;
    protected User orderUser;

    /**
     * Gets the value of the orderCost property.
     * 
     */
    public double getOrderCost() {
        return orderCost;
    }

    /**
     * Sets the value of the orderCost property.
     * 
     */
    public void setOrderCost(double value) {
        this.orderCost = value;
    }

    /**
     * Gets the value of the orderPayment property.
     * 
     */
    public boolean isOrderPayment() {
        return orderPayment;
    }

    /**
     * Sets the value of the orderPayment property.
     * 
     */
    public void setOrderPayment(boolean value) {
        this.orderPayment = value;
    }

    /**
     * Gets the value of the orderProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getOrderProduct() {
        return orderProduct;
    }

    /**
     * Sets the value of the orderProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setOrderProduct(Product value) {
        this.orderProduct = value;
    }

    /**
     * Gets the value of the orderUser property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getOrderUser() {
        return orderUser;
    }

    /**
     * Sets the value of the orderUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setOrderUser(User value) {
        this.orderUser = value;
    }

}

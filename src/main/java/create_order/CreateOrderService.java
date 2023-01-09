package create_order;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.management.OperationsException;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "CreateOrder", portName = "CreateOrderPort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class CreateOrderService {
    @WebMethod(operationName = "Create")
    public Order createOrder(User user, int productNumber) {

        Order order = new Order();
        order.setOrderUser(user);
        order.setOrderProduct(user.getUserCart().get(productNumber));
        order.setOrderCost(order.getOrderProduct().getProductCost());
        order.setOrderPayment(false);

        System.out.println(user.getNickName() + " order was created.");

        return order;
    }

    @WebMethod(operationName = "ReserveProducts")
    public Order reserveProducts(Order order) {

        order.orderProduct.setReserved(true);
        System.out.println("Your order products are reserved in the warehouse.");

        return order;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/CreateOrder", new CreateOrderService());
    }
}

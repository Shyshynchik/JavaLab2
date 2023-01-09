package client;

import org.camunda.bpm.client.ExternalTaskClient;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CreateOrderClient {

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }
    public User generateUser() {
        User user = new User();
        user.setFirstName("Igor");
        user.setLastName("Kostenko");
        user.setNickName("Anime");
        user.setPassWord("Anime");

        Product product1 = new Product();
        Product product2 = new Product();

        product1.setProductName("Bible");
        product1.setProductType("Book");
        product1.setProductCost(100);
        product1.setReserved(false);

        product2.setProductName("IPhone 20");
        product2.setProductType("Smartphone");
        product2.setProductCost(100000);
        product2.setReserved(false);

        user.getUserCart().add(product1);
        user.getUserCart().add(product2);

        return user;
    }
    public void process(URL url) {
        User user = generateUser();

        CreateOrder createOrder = new CreateOrder(url);
        CreateOrderService createOrderService = createOrder.getCreateOrderPort();

        System.out.println("Creating order...");

        Random random = new Random();
        int productNumber = random.nextInt(2);
        Order order = createOrderService.create(user, productNumber);

        System.out.println("Order was created");
        System.out.println("Reserving " + order.getOrderProduct().getProductName() + "...");

        order = createOrderService.reserveProducts(order);

        System.out.println("Success!");
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // long polling timeout
                .build();

        Order finalOrder = order;
        client.subscribe("CreateOrderTopic")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {

                    try {
                        Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //
                    Map<String, Object> map = new HashMap<>();
                    map.put("order", finalOrder);

                    // Complete the task
                    externalTaskService.complete(externalTask, map);
                })
                .open();
    }


    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8081/CreateOrder?wsdl");
        CreateOrderClient client = new CreateOrderClient();
        client.process(url);
    }
}

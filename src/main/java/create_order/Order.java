package create_order;

import java.util.ArrayList;

public class Order {
    User orderUser;
    Product orderProduct;
    double orderCost;
    boolean orderPayment;

    public User getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }

    public Product getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(Product orderProduct) {
        this.orderProduct = orderProduct;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public boolean isOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(boolean orderPayment) {
        this.orderPayment = orderPayment;
    }
}

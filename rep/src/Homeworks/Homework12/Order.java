package Homeworks.Homework12;

import java.util.ArrayList;
import java.util.List;

abstract public class Order {
    private List<Product> products;
    private String customer;
    private String deliveryAddress;
    private boolean paymentStatus;

    public Order(String customer, String deliveryAddress) {
        this.products = new ArrayList<>();
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
        this.paymentStatus = false;
    }

    abstract public void addProduct(Product product) ;

    abstract public void removeProduct(Product product) ;

    abstract void changePaymentStatus(boolean status) ;


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}

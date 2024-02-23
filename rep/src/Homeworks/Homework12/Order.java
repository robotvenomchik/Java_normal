package Homeworks.Homework12;

import java.util.ArrayList;
import java.util.List;

public class Order {
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

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }
    public void removeProductByName(String name){

        for(int i=0; i<products.size(); i++){
            System.out.println(products.stream().map(Product::getName));
          if(products.stream().map(Product::getName).anyMatch(productName -> productName.equals(name))){
              products.remove(name);
          }
          else System.out.println("not found");
        }



    }



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

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", customer='" + customer + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", paymentStatus=" + paymentStatus +
                '}';
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}

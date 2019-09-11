package se.ecutb.loffe.model;

public class Candy extends Product {

    public Candy(String name, String productInfo, int price) {
        super(name, productInfo, price);
    }

    @Override
    public String toString() {
        return "Candy: " +
                "name='" + name + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", price=" + price;
    }
}

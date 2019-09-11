package se.ecutb.loffe.model;

public class Beverage extends Product {

    public Beverage(String name, String productInfo, int price) {
        super(name, productInfo, price);
    }

    @Override
    public String use(int index){
        return "You drink " + getName();
    }
}

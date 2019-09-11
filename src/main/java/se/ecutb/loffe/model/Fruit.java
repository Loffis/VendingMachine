package se.ecutb.loffe.model;

public class Fruit extends Product {

    public Fruit(String name, String productInfo, int price) {
        super(name, productInfo, price);
    }

    @Override
    public String use(int index){
        return "You eat the " + getName() + " because it's healthy.";
    }
}

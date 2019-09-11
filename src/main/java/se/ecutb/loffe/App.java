package se.ecutb.loffe;


import se.ecutb.loffe.model.*;

import java.lang.reflect.ParameterizedType;

public class App
{
    public static void main( String[] args )
    {
        VendingMachine vendingMachine = new ImplementVM();
        Product[] products = new Product[6];
        Product candy1 = new Candy("Daim", "Gott me en massa choklad i", 20);
        Product candy2 = new Candy("Mars", "blah blah", 25);
        Product fruit1 = new Fruit("Banana", "Brownish", 2);
        Product fruit2 = new Fruit("Apple", "Is a fruit and nothin else", 3);
        Product beverage1 = new Beverage("Guinness", "ABV 4.5%", 30);
        Product beverage2 = new Beverage("Omnipollo Noah Pecan Mud Cake", "ABV 11%", 50);
        products[0] = candy1;
        products[1] = candy2;
        products[2] = fruit1;
        products[3] = fruit2;
        products[4] = beverage1;
        products[5] = beverage2;

        for (Product p : products) {
            System.out.println(p);
        }


    }
}

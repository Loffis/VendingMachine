package se.ecutb.loffe.model;


public class ImplementVM implements VendingMachine{

    int balance = 0;
    Product[] products = new Product[6];

    @Override
    public void addCurrency(int amount) {
        int beforeDeposit = 0;
        int[] validMoney = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
        for (int i = 0; i < validMoney.length; i++) {
            if (amount == validMoney[i]) {
                balance += validMoney[i];
                System.out.println(validMoney[i] + " kr added.");
                beforeDeposit = balance;
                break;
            }
        }
        if(beforeDeposit == 0){
            System.out.println("No money added");
        }
    }

    @Override
    public Product request(int productNumber) {


        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        String description = products.toString();
        System.out.println(description);
        return description;
    }

    @Override
    public int getBalance() {

        return balance;
    }

    @Override
    public String[] getProducts() {
        String[] returnProduct = new String[6];
        returnProduct[0] = products[0].toString();
        returnProduct[1] = products[1].toString();
        returnProduct[2] = products[2].toString();
        returnProduct[3] = products[3].toString();
        returnProduct[4] = products[4].toString();
        returnProduct[5] = products[5].toString();
        return returnProduct;
    }



    public void setProducts(Product[] products) {

        Product candy1 = new Candy("Daim", "Gott me en massa choklad i", 20);
        Product candy2 = new Candy("Mars", "blah blah", 25);
        Product fruit1 = new Fruit("Banana", "Brownish", 2);
        Product fruit2 = new Fruit("Apple", "Is a fruit and nothin else", 3);
        Product beverage1 = new Beverage("Guinness", "ABV 4.5%", 30);
        Product beverage2 = new Beverage("Omnipollo Noa Pecan Mud Cake", "ABV 11%", 50);
        products[0] = candy1;
        products[1] = candy2;
        products[2] = fruit1;
        products[3] = fruit2;
        products[4] = beverage1;
        products[5] = beverage2;
    }
}

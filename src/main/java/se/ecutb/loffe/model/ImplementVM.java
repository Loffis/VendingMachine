package se.ecutb.loffe.model;


public class ImplementVM implements VendingMachine{

    int balance = 0;

    @Override
    public void addCurrency(int amount) {
        int beforeDeposit = 0;
        int[] validMoney = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
        for (int i = 0; i < validMoney.length; i++) {
            if (amount == validMoney[i]) {
                balance = balance + validMoney[i];
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
    public String getDescription() {
        return null;
    }

    @Override
    public int getBalance() {

        return balance;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }



    public void setProducts(Product[] products) {

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
    }
}

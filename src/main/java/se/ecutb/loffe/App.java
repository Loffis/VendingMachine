package se.ecutb.loffe;


import se.ecutb.loffe.model.*;

import java.util.Scanner;

public class App
{
    public static Scanner sc = new Scanner(System.in);
    private static VendingMachine vendingMachine = new ImplementVM();

    public static void main( String[] args )
    {

        String input;
        boolean isRunning = true;


        while(isRunning){
            printMenu();
            switch(inputEvaluation(sc.nextLine())){
                case 1:
                    inputMoney();
                    break;
                case 2:
                    // Vet inte om det behövs mer än nedanstående rad här...
                    // men den funkar inte nu, så bortkommenterad.
                    //vendingMachine.getProducts();
                    System.out.println("Här visas alla produkter. Kommer snart!");
                    break;
                case 3:
                    // hämta int från en frågemeny?
                    // Denna visar bara minnesadress nu...
                    getDescriptionMenu();
                    break;
                case 4:
                    buyProduct();
                    break;
                case 5:
                    // use-funktionen från de product, fruit o beverage. når inte den.
                    System.out.println("Hej.");
                    break;
                case 6:
                    vendingMachine.endSession();
                    break;


            }


        }
//        Product[] products = new Product[6];
//        Product candy1 = new Candy("Daim", "Gott me en massa choklad i", 20);
//        Product candy2 = new Candy("Mars", "blah blah", 25);
//        Product fruit1 = new Fruit("Banana", "Brownish", 2);
//        Product fruit2 = new Fruit("Apple", "Is a fruit and nothin else", 3);
//        Product beverage1 = new Beverage("Guinness", "ABV 4.5%", 30);
//        Product beverage2 = new Beverage("Omnipollo Noah Pecan Mud Cake", "ABV 11%", 50);
//        products[0] = candy1;
//        products[1] = candy2;
//        products[2] = fruit1;
//        products[3] = fruit2;
//        products[4] = beverage1;
//        products[5] = beverage2;
//
//
//        for (Product p : products) {
//            System.out.println(p);
//
//        }

        vendingMachine.getProducts();




    }

    private static int getDescriptionMenu() {
        System.out.print("Please choose product: ");
        vendingMachine.getDescription(inputEvaluation(sc.nextLine()));
        return 0;
    }

    private static void buyProduct() {
        System.out.print("Please choose product: ");
        vendingMachine.request(inputEvaluation(sc.nextLine()));
        // vendingmachine.request sköter resten?
    }

    private static void inputMoney() {
        System.out.println("This machine accepts (kr): 1, 5, 10, 20, 50, 100, 500 & 1000.");
        System.out.print("Please enter amount (kr) : ");
        vendingMachine.addCurrency(inputEvaluation(sc.nextLine()));
    }

    private static int inputEvaluation(String input) {
        boolean valid = false;
        int number = 0;
        while(!valid){
            try{
                number = Integer.parseInt(input);
                valid = true;
            }catch (NumberFormatException exception){
                System.out.println(exception);
            }
        }
        return number;
    }

    public static void printMenu(){

        System.out.println("####################################");
        System.out.println("### 1 #### Add money ###############");
        System.out.println("### 2 #### View all products #######");
        System.out.println("### 3 #### Get product info ########");
        System.out.println("### 4 #### Buy product #############");
        System.out.println("### 5 #### Consume product #########");
        System.out.println("### 6 #### Quit ####################");
        System.out.println("####################################");
        System.out.println("\t\tBalance: " + vendingMachine.getBalance());
        System.out.print("\nPlease make your choice: ");
    }
}

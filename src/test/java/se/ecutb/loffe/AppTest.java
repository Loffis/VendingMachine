package se.ecutb.loffe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutb.loffe.model.ImplementVM;
import se.ecutb.loffe.model.Product;
import se.ecutb.loffe.model.VendingMachine;


public class AppTest 
{


    @Test
    public void test_add_money(){
        VendingMachine vendingMachine = new ImplementVM();
        vendingMachine.addCurrency(100);
        vendingMachine.addCurrency(1);

        Assert.assertEquals(101, vendingMachine.getBalance());

    }

    @Test
    public void test_add_wrong_money(){
        VendingMachine vendingMachine = new ImplementVM();
        vendingMachine.addCurrency(1);
        vendingMachine.addCurrency(3);
        vendingMachine.addCurrency(20);
        vendingMachine.addCurrency(25);

        Assert.assertEquals(21, vendingMachine.getBalance());

    }
    @Test
    public void test_get_description() {
        VendingMachine vendingMachine = new ImplementVM();
        String expected = "ABV 11%";

        Assert.assertEquals(expected, vendingMachine.getDescription(5));

    }

}

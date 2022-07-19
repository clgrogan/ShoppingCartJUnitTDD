package src.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Cart;
import src.main.models.Item;

public class CartTest {

    Cart cart;

    @Before
    public void setup() {
        cart = new Cart();
        cart.addItem(new Item("Tacos", 9.99));
        cart.addItem(new Item("Coke Zero Sugar", 2.99));
    }

    @Test
    public void itemAddedTest() {
        assertTrue(cart.contains(new Item("Tacos", 9.99)));
    }

}

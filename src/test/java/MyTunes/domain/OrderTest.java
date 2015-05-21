package MyTunes.domain;

import MyTunes.conf.factory.OrderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by Dillan on 5/19/2015.
 */
public class OrderTest {
    ShoppingCart cart;
    Date purchaseDate;
    List<Album> cartItems;


    @Before
    public void setUp() throws Exception {
        ShoppingCart cart = null;
        Date purchaseDate = new Date();
    }

    @Test
    public void testOrder() throws Exception {
        System.out.print(purchaseDate);
        Order order = OrderFactory.createOrder(cart, purchaseDate);
        Assert.assertNull(order.getPurchaseDate());
    }
}

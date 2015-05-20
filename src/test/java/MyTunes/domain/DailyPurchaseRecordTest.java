package MyTunes.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Dillan on 5/19/2015.
 */
public class DailyPurchaseRecordTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testDailyPurchaseRecord() throws Exception {
        List<Order> orders = new ArrayList<Order>();
        Date date = new Date();
        DailyPurchaseRecord purchaseRecord = new DailyPurchaseRecord.Builder(orders, date).build();
        Assert.assertEquals(new Date(), purchaseRecord.getDate());
    }
}

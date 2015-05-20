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
public class ChartTest {
    private Date month;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCourse() throws Exception {
        Date date = new Date();
        List<Album> topForty = new ArrayList<Album>();
        Chart chart = new Chart.Builder(topForty, new Date(), "Top Forty", "List of Top Forty Albums").build();
        Assert.assertEquals("Top fifty", chart.getChartName());
    }
}

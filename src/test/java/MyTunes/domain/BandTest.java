package MyTunes.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dillan on 5/19/2015.
 */
public class BandTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCourse() throws Exception {
        IPerformer band = new Band.Builder("Coldplay", "Alternative Rock").build();
        Assert.assertEquals("Some Title", band.getName());
    }
}

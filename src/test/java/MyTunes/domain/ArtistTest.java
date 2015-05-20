package MyTunes.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dillan on 5/19/2015.
 */
public class ArtistTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCourse() throws Exception {
        IPerformer artist = new Artist.Builder("Olly Murs", "Acoustic").build();
        Assert.assertEquals("Some Title", artist.getName());
    }
}

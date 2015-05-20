package MyTunes.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dillan on 5/19/2015.
 */
public class AlbumTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCourse() throws Exception {
        IPerformer artist = new Artist.Builder("Imagine Dragons", "Acoustic").build();
        Album album = new Album.Builder("Smoke + Mirrors", artist).build();
        Assert.assertEquals("Smoke + Mirrors", album.getAlbumName());
    }
}

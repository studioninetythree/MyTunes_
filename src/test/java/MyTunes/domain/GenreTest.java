package MyTunes.domain;

import MyTunes.conf.factory.GenreFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Dillan on 5/19/2015.
 */
public class GenreTest {

    String genreName;
    String genreDescription;
    List<Album> albums;

    @Before
    public void setUp() throws Exception {
        genreName = "Rock";
        genreDescription = "Rock and Roll";
        albums = null;
    }

    @Test
    public void testGenre() throws Exception {
        Genre genre = GenreFactory.createGenre(genreName, genreDescription, albums);
        Assert.assertEquals("Rock", genre.getGenreName());
    }
}

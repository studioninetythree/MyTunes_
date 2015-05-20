package MyTunes.api;

import MyTunes.domain.Album;
import MyTunes.domain.Artist;
import MyTunes.domain.IPerformer;
import MyTunes.services.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Dillan on 4/23/2015.
 */
@RestController
@RequestMapping("/api/**")
public class Index {
    @Autowired
    private IAlbumService service;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String Index() {
        return "This is a Home Page";
    }

    @RequestMapping(value = "/album", method = RequestMethod.GET)
    public Album getAlbum() {
        IPerformer artist = new Artist.Builder("Imagine Dragons", "Acoustic").build();
        Album album = new Album.Builder("Smoke + Mirros", artist).build();
        return album;
    }

    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public List<Album> getAlbums() {
        return service.getAlbums();
    }
}

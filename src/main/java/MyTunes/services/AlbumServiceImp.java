package MyTunes.services;

import MyTunes.domain.Album;
import MyTunes.repository.IRepoAlbum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dillan on 4/23/2015.
 */

@Service
public class AlbumServiceImp implements IAlbumService {
    @Autowired
    IRepoAlbum repository;

    public List<Album> getAlbums() {
        List<Album> allAlbums = new ArrayList<Album>();

        Iterable<Album> albums = repository.findAll();
        for (Album album : albums) {
            allAlbums.add(album);
        }
        return allAlbums;
    }
}

package MyTunes.services;

import MyTunes.domain.Album;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dillan on 4/23/2015.
 */

@Service
public class AlbumServiceImp implements AlbumService
{
    @Autowired
    CourseRepository repository;
    public List<Album> getAlbums()
    {
        List<Album> allAlbums = new ArrayList<Album>();

        Iterable<Album> courses = repository.findAll();
        for (Album course : courses) {
            allAlbums.add(course);
        }
        return allAlbums;
    }
}

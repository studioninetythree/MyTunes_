package MyTunes.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Embeddable
public class Genre implements Serializable {
    private String genreID;
    private String genreName;
    private String genreDescription;
    private List<Album> albums;

    public Genre(Builder builder) {
        this.genreID = builder.genreID;
        this.genreName = builder.genreName;
        this.genreDescription = builder.genreDescription;
        this.albums = builder.albums;
    }

    public String getGenreID()
    {
        return genreID;
    }

    public String getGenreName()
    {
        return genreName;
    }

    public String getGenreDescription()
    {
        return genreDescription;
    }

    public List<Album> getAlbums()
    {
        return albums;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder
    {
        private String genreID;
        private String genreName;
        private String genreDescription;
        private List<Album> albums;

        public Builder(String genreID, String genreName, String genreDescription, List<Album> albums)
        {
            this.genreID = genreID;
            this.genreName = genreName;
            this.genreDescription = genreDescription;
            this.albums = albums;
        }

        public Builder copy(Genre genre){
            this.genreID = genre.genreID;
            this.genreName = genre.genreName;
            this.genreDescription = genre.genreDescription;
            this.albums = genre.albums;
            return this;
        }

        public Genre build()
        {
            return new Genre(this);
        }
    }
}

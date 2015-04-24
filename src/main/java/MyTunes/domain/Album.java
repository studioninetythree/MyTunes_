package MyTunes.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by 211299820 on 16/04/15.
 */
@Entity
public class Album implements Serializable {
    @Column(unique = true) private String albumID;
    private String albumName;
    private String albumDescription;
    private Artist artist;
    private Reviewer reviewer;
    private Double price;

    public Album(Builder builder) {
        albumID = builder.albumID;
        albumName = builder.albumName;
        albumDescription = builder.albumDescription;
        artist = builder.artist;
        price = builder.price;
    }
    public String getAlbumID() {
        return albumID;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumDescription() {
        return albumDescription;
    }

    public Artist getArtistId() {
        return artist;
    }

    public Double getPrice()
    {
        return price;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder
    {
        private String albumID;
        private String albumName;
        private String albumDescription;
        private Artist artist;
        private Reviewer reviewer;
        private Double price;

        public Builder(String albumID, String albumName, String albumDescription, Artist artist, Reviewer reviewer, Double price)
        {
            this.albumID = albumID;
            this.albumName = albumName;
            this.albumDescription = albumDescription;
            this.artist = artist;
            this.reviewer = reviewer;
            this.price = price;
        }

        public Builder copy(Album album){
            this.albumID = album.albumID;
            this.albumName = album.albumName;
            this.albumDescription = album.albumDescription;
            this.artist = album.artist;
            this.price = album.price;
            this.reviewer = album.reviewer;
            return this;
        }

        public Album build(){
            return new Album(this);
        }
    }
}

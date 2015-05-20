package MyTunes.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 211299820 on 16/04/15.
 */
@Entity
public class Album implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int albumID;
    private String albumName;
    private String albumDescription;
    private IPerformer performer;
    private Reviewer reviewer;
    private Double price;

    public Album(Builder builder) {
        albumName = builder.albumName;
        albumDescription = builder.albumDescription;
        performer = builder.performer;
        price = builder.price;
    }

    public int getAlbumID() {
        return albumID;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumDescription() {
        return albumDescription;
    }

    public IPerformer getArtist() {
        return performer;
    }

    public Double getPrice() {
        return price;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder {
        private int albumID;
        private String albumName;
        private String albumDescription;
        private IPerformer performer;
        private Reviewer reviewer;
        private Double price;

        public Builder(String albumName, String albumDescription, IPerformer performer, Reviewer reviewer, Double price) {
            this.albumID = albumID;
            this.albumName = albumName;
            this.albumDescription = albumDescription;
            this.performer = performer;
            this.reviewer = reviewer;
            this.price = price;
        }

        public Builder(String name) {
            this.albumName = name;
        }

        public Builder(String name, IPerformer performer) {
            this.albumName = name;
            this.performer = performer;
        }

        public Builder copy(Album album) {
            this.albumID = album.albumID;
            this.albumName = album.albumName;
            this.albumDescription = album.albumDescription;
            this.performer = album.performer;
            this.price = album.price;
            this.reviewer = album.reviewer;
            return this;
        }

        public Builder albumId(int albumID) {
            this.albumID = albumID;
            return this;
        }

        public Builder albumName(String albumName) {
            this.albumName = albumName;
            return this;
        }

        public Builder albumDecription(String albumDescription) {
            this.albumDescription = albumDescription;
            return this;
        }

        public Builder albumArtist(IPerformer performer) {
            this.performer = performer;
            return this;
        }

        public Builder albumReviewer(Reviewer reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        public Builder albumPrice(double price) {
            this.price = price;
            return this;
        }

        public Album build() {
            return new Album(this);
        }
    }
}

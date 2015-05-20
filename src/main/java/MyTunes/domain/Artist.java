package MyTunes.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Embeddable
public class Artist implements IPerformer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int artistId;
    private String name;
    private String description;
    private List<Album> albumList;
    private RecordStudio recordStudio;

    public Artist(Builder builder) {
        this.artistId = builder.artistId;
        this.name = builder.name;
        this.description = builder.description;
        this.albumList = builder.albumList;
        this.recordStudio = builder.recordStudio;
    }

    public int getId() {
        return artistId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public RecordStudio getRecordStudio() {
        return recordStudio;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder {

        private int artistId;
        private String name;
        private String description;
        private List<Album> albumList;
        private RecordStudio recordStudio;

        public Builder(int artistId, String name, String description, List<Album> albumList, RecordStudio recordStudio) {
            this.artistId = artistId;
            this.name = name;
            this.description = description;
            this.albumList = albumList;
            this.recordStudio = recordStudio;
        }

        public Builder(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public Builder(String name) {
            this.name = name;
        }

        public Builder copy(Artist artist) {
            this.artistId = artist.artistId;
            this.name = artist.name;
            this.description = artist.description;
            return this;
        }

        public Builder artistId(int artistId) {
            this.artistId = artistId;
            return this;
        }

        public Builder artistName(String name) {
            this.name = name;
            return this;
        }

        public Builder artistDescription(String artistDescription) {
            this.description = description;
            return this;
        }

        public Builder artistAlbumList(List<Album> albumList) {
            this.albumList = albumList;
            return this;
        }

        public Builder artistRecordStudio(RecordStudio recordStudio) {
            this.recordStudio = recordStudio;
            return this;
        }

        public Artist build() {
            return new Artist(this);
        }
    }
}

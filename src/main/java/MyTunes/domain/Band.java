package MyTunes.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dillan on 4/23/2015.
 */
@Embeddable
public class Band implements IPerformer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int bandId;
    private String name;
    private String description;
    private List<Album> albumList;
    private RecordStudio recordStudio;

    public Band(Builder builder) {
        this.bandId = builder.bandId;
        this.name = builder.name;
        this.description = builder.description;
        this.albumList = builder.albumList;
        this.recordStudio = builder.recordStudio;
    }

    public int getId() {
        return bandId;
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
        private int bandId;
        private String name;
        private String description;
        private List<Album> albumList;
        private RecordStudio recordStudio;

        public Builder(int bandId, String name, String description, List<Album> albumList, RecordStudio recordStudio) {
            this.bandId = bandId;
            this.name = name;
            this.description = description;
            this.albumList = albumList;
            this.recordStudio = recordStudio;
        }

        public Builder(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public Builder copy(Band band) {
            this.bandId = band.bandId;
            this.name = band.name;
            this.description = band.description;
            this.albumList = band.albumList;
            this.recordStudio = band.recordStudio;
            return this;
        }

        public Builder bandId(int artistId) {
            this.bandId = artistId;
            return this;
        }

        public Builder bandName(String name) {
            this.name = name;
            return this;
        }

        public Builder bandDescription(String bandDescription) {
            this.description = bandDescription;
            return this;
        }

        public Builder bandAlbumList(List<Album> albumList) {
            this.albumList = albumList;
            return this;
        }

        public Builder bandRecordStudio(RecordStudio recordStudio) {
            this.recordStudio = recordStudio;
            return this;
        }

        public Band build() {
            return new Band(this);
        }
    }
}

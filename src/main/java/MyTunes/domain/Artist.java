package MyTunes.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Embeddable
public class Artist implements Performer  {
    private String id;
    private String name;
    private String description;
    private List<Album> albumList;
    private RecordStudio recordStudio;

    public Artist(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.albumList = builder.albumList;
        this.recordStudio = builder.recordStudio;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public List<Album> getAlbumList()
    {
        return albumList;
    }

    public RecordStudio getRecordStudio()
    {
        return recordStudio;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder
    {
        private String id;
        private String name;
        private String description;
        private List<Album> albumList;
        private RecordStudio recordStudio;

        public Builder(String id, String name, String description, List<Album> albumList, RecordStudio recordStudio)
        {
            this.id = id;
            this.name = name;
            this.description = description;
            this.albumList = albumList;
            this.recordStudio = recordStudio;
        }

        public Builder copy(Artist artist){
            this.id = artist.id;
            this.name = artist.name;
            this.description = artist.description;
            return this;
        }

        public Album build(){
            return new Artist(this);
        }
    }
}

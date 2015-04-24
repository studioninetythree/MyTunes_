package MyTunes.domain;

import java.util.List;

/**
 * Created by Dillan on 4/23/2015.
 */
@Embeddable
public class Band implements Performer
{
    private String id;
    private String name;
    private String description;
    private List<Album> albumList;
    private RecordStudio recordStudio;

    public Band(Builder builder) {
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

        public Builder copy(Band band){
            this.id = band.id;
            this.name = band.name;
            this.description = band.description;
            this.albumList = band.albumList;
            this.recordStudio = band.recordStudio;
            return this;
        }

        public Band build(){
            return new Band(this);
        }
    }
}

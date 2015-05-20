package MyTunes.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Embeddable
public class RecordStudio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int recordStudioID;
    private String recordStudioName;
    private String recordStudioDescription;
    private List<Artist> affiliateArtists;

    public RecordStudio(Builder builder) {
        this.recordStudioID = builder.recordStudioID;
        this.recordStudioName = builder.recordStudioName;
        this.recordStudioDescription = builder.recordStudioDescription;
        this.affiliateArtists = builder.affiliateArtists;
    }

    public int getRecordStudioID() {
        return recordStudioID;
    }

    public String getRecordStudioName() {
        return recordStudioName;
    }

    public String getRecordStudioDescription() {
        return recordStudioDescription;
    }

    public List<Artist> getAffiliateArtists() {
        return affiliateArtists;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder {


        private int recordStudioID;
        private String recordStudioName;
        private String recordStudioDescription;
        private List<Artist> affiliateArtists;

        public Builder(int recordStudioID, String recordStudioName, String recordStudioDescription, List<Artist> affiliateArtists) {
            this.recordStudioID = recordStudioID;
            this.recordStudioName = recordStudioName;
            this.recordStudioDescription = recordStudioDescription;
            this.affiliateArtists = affiliateArtists;
        }

        public Builder(String recordStudioName, String recordStudioDescription, List<Artist> affiliateArtists) {
            this.recordStudioName = recordStudioName;
            this.recordStudioDescription = recordStudioDescription;
            this.affiliateArtists = affiliateArtists;
        }

        public Builder copy(RecordStudio recordStudio) {
            this.recordStudioID = recordStudio.recordStudioID;
            this.recordStudioName = recordStudio.recordStudioName;
            this.recordStudioDescription = recordStudio.recordStudioDescription;
            this.affiliateArtists = recordStudio.affiliateArtists;
            return this;
        }

        public RecordStudio build() {
            return new RecordStudio(this);
        }
    }
}

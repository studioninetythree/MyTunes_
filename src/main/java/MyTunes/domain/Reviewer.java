package MyTunes.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Embeddable
public class Reviewer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int reviewerID;
    private String reviewerName;
    private List<Album> albumsReviewed;

    public Reviewer(Builder builder) {
        this.reviewerID = builder.reviewerID;
        this.reviewerName = builder.reviewerName;
    }

    public int getReviewerID() {
        return reviewerID;
    }

    public String getReviewerName() {
        return reviewerName;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder {


        private int reviewerID;
        private String reviewerName;
        private List<Album> albumsReviewed;

        public Builder(int reviewerID, String reviewerName, List<Album> albumsReviewed) {
            this.reviewerID = reviewerID;
            this.reviewerName = reviewerName;
            this.albumsReviewed = albumsReviewed;
        }

        public Builder(String reviewerName, List<Album> albumsReviewed) {
            this.reviewerID = reviewerID;
            this.reviewerName = reviewerName;
            this.albumsReviewed = albumsReviewed;
        }

        public Builder(String name) {
            this.reviewerName = name;
        }

        public Builder copy(Reviewer reviewer) {
            this.reviewerID = reviewer.reviewerID;
            this.reviewerName = reviewer.reviewerName;
            this.albumsReviewed = reviewer.albumsReviewed;
            return this;
        }

        public Reviewer build() {
            return new Reviewer(this);
        }
    }
}

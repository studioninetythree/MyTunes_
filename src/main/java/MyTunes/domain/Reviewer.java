package MyTunes.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Embeddable
public class Reviewer implements Serializable {
    private String reviewerID;
    private String reviewerName;
    private List<Album> albumsReviewed;

    public Reviewer(String reviewerID, String reviewerName)
    {
        this.reviewerID = reviewerID;
        this.reviewerName = reviewerName;
    }

    public String getReviewerID() {
        return reviewerID;
    }

    public String getReviewerName() {
        return reviewerName;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder
    {
        private String reviewerID;
        private String reviewerName;
        private List<Album> albumsReviewed;

        public Builder(String reviewerID, String reviewerName, List<Album> albumsReviewed)
        {
            this.reviewerID = reviewerID;
            this.reviewerName = reviewerName;
            this.albumsReviewed = albumsReviewed;
        }

        public Builder copy(Reviewer reviewer){
            this.reviewerID = reviewer.reviewerID;
            this.reviewerName = reviewer.reviewerName;
            this.albumsReviewed = reviewer.albumsReviewed;
            return this;
        }

        public Reviewer build()
        {
            return new Reviewer(this);
        }
    }
}

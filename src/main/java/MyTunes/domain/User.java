package MyTunes.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Entity
public class User implements Serializable {
    private String userID;
    private String userName;
    private String userEmail;
    private String userPassword;

    public User(Builder builder) {
        this.userID = builder.userID;
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;
        this.userPassword = builder.userPassword;
    }

    public String getUserID()
    {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder
    {
        private String userID;
        private String userName;
        private String userEmail;
        private String userPassword;

        public Builder(String userID, String userName, String userEmail, String userPassword)
        {
            this.userID = userID;
            this.userName = userName;
            this.userEmail = userEmail;
            this.userPassword = userPassword;
        }

        public Builder copy(User user){
            this.userID = user.userID;
            this.userName = user.userName;
            this.userEmail = user.userEmail;
            this.userPassword = user.userPassword;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}

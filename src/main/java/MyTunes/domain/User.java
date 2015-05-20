package MyTunes.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 211299820 on 16/04/15.
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int userID;
    @Column(unique = true)
    private String userName;
    private String userEmail;
    private String userPassword;

    public User(Builder builder) {
        this.userID = builder.userID;
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;
        this.userPassword = builder.userPassword;
    }

    public int getUserID() {
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

    public static class Builder {
        private int userID;
        private String userName;
        private String userEmail;
        private String userPassword;

        public Builder(int userID, String userName, String userEmail, String userPassword) {
            this.userID = userID;
            this.userName = userName;
            this.userEmail = userEmail;
            this.userPassword = userPassword;
        }

        public Builder(String userName, String userEmail, String userPassword) {
            this.userName = userName;
            this.userEmail = userEmail;
            this.userPassword = userPassword;
        }

        public Builder copy(User user) {
            this.userID = user.userID;
            this.userName = user.userName;
            this.userEmail = user.userEmail;
            this.userPassword = user.userPassword;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

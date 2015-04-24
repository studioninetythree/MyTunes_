package MyTunes.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.security.Timestamp;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Embeddable
public class ShoppingCart implements Serializable {
    private User user;
    private List<Album> albumsPurchased;
    private double totalPrice;
    private Timestamp timestamp;

    public ShoppingCart(Builder builder) {
        this.user = builder.user;
        this.albumsPurchased = builder.albumsPurchased;
        this.totalPrice = builder.totalPrice;
        this.timestamp = builder.timestamp;
    }

    public User getUser()
    {
        return user;
    }

    public List<Album> getAlbumOrdered()
    {
        return albumsPurchased;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    public Timestamp getTimestamp()
    {
        return timestamp;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder
    {
        private User user;
        private List<Album> albumsPurchased;
        private double totalPrice;
        private Timestamp timestamp;

        public Builder(User user, List<Album> albumsPurchased, double totalPrice, Timestamp timestamp)
        {
            this.user = user;
            this.albumsPurchased = albumsPurchased;
            this.totalPrice = totalPrice;
            this.timestamp = timestamp;
        }

        public Builder copy(ShoppingCart shoppingCart){
            this.user = shoppingCart.user;
            this.albumsPurchased = shoppingCart.albumsPurchased;
            this.totalPrice = shoppingCart.totalPrice;
            this.timestamp = shoppingCart.timestamp;
            return this;
        }

        public ShoppingCart build()
        {
            return new ShoppingCart(this);
        }
    }
}

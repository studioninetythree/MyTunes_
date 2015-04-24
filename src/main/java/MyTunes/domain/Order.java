package MyTunes.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by 211299820 on 16/04/15.
 */
@Entity
public class Order implements Serializable {
    private ShoppingCart cart ;
    private Date purchaseDate;

    public Order(Builder builder) {
        this.cart = builder.cart;
        this.purchaseDate = builder.purchaseDate;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder
    {
        private ShoppingCart cart ;
        private Date purchaseDate;

        public Builder(ShoppingCart cart, Date purchaseDate)
        {
            this.cart = cart;
            this.purchaseDate = purchaseDate;
        }

        public Builder copy(Order order){
            this.cart = order.cart;
            this.purchaseDate = order.purchaseDate;
            return this;
        }

        public Order build()
        {
            return new Order(this);
        }
    }
}

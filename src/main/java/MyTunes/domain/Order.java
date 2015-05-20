package MyTunes.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 211299820 on 16/04/15.
 */
@Entity
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int id;
    private ShoppingCart cart;
    private Date purchaseDate;

    public Order(Builder builder) {
        this.id = builder.id;
        this.cart = builder.cart;
        this.purchaseDate = builder.purchaseDate;
    }

    public int getId() {
        return id;
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

    public static class Builder {

        private int id;
        private ShoppingCart cart;
        private Date purchaseDate;

        public Builder(int id, ShoppingCart cart, Date purchaseDate) {
            this.id = id;
            this.cart = cart;
            this.purchaseDate = purchaseDate;
        }

        public Builder(ShoppingCart cart, Date purchaseDate) {
            this.cart = cart;
            this.purchaseDate = purchaseDate;
        }

        public Builder copy(Order order) {
            this.id = order.id;
            this.cart = order.cart;
            this.purchaseDate = order.purchaseDate;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}

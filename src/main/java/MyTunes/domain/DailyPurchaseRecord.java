package MyTunes.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dillan on 4/17/2015.
 */
@Entity
public class DailyPurchaseRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int id;
    private List<Order> orders;
    private java.util.Date date;

    public DailyPurchaseRecord(Builder builder) {
        this.orders = builder.orders;
        this.date = builder.date;
    }

    public int getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public java.util.Date getDate() {
        return date;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder {
        private int id;
        private List<Order> orders;
        private java.util.Date date;

        public Builder(List<Order> orders, java.util.Date date) {
            this.orders = orders;
            this.date = date;
        }

        public Builder copy(DailyPurchaseRecord dailyPurchaseRecord) {
            this.orders = dailyPurchaseRecord.orders;
            this.date = dailyPurchaseRecord.date;
            return this;
        }

        public DailyPurchaseRecord build() {
            return new DailyPurchaseRecord(this);
        }

    }
}

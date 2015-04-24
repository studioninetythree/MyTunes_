package MyTunes.domain;

import java.sql.Date;
import java.util.List;

/**
 * Created by Dillan on 4/17/2015.
 */
@Entity
public class DailyPurchaseRecord
{
    private List<Order> orders;
    private Date date;

    public DailyPurchaseRecord(Builder builder) {
        this.orders = builder.orders;
        this.date = builder.date;
    }

    public List<Order> getOrders()
    {
        return orders;
    }

    public Date getDate()
    {
        return date;
    }


    // **********************************************************************
    //              Inner Builder Class
    // **********************************************************************

    public static class Builder
    {
        private List<Order> orders;
        private Date date;

        public Builder(List<Order> orders, Date date)
        {
            this.orders = orders;
            this.date = date;
        }

        public Builder copy(DailyPurchaseRecord dailyPurchaseRecord){
            this.orders = dailyPurchaseRecord.orders;
            this.date = dailyPurchaseRecord.date;
            return this;
        }

        public DailyPurchaseRecord build()
        {
            return new DailyPurchaseRecord(this);
        }
    }
}

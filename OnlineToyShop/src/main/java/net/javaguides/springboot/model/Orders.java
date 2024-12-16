

package net.javaguides.springboot.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    long id;
    double total_price;
    Date date_delivery;

    public Orders() {
    }

    public Orders(long id, double total_price, Date date_delivery) {
        this.id = id;
        this.total_price = total_price;
        this.date_delivery = date_delivery;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public Date getDate_delivery() {
        return date_delivery;
    }

    public void setDate_delivery(Date date_delivery) {
        this.date_delivery = date_delivery;
    }
}

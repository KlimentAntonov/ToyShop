package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "toy")
public class Toy {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    public Toy() {
    }

    public Toy(long id, String description, double price, String name, String image) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.name = name;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

package cz.osu.swidemo.entity;

import jakarta.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "pricing")
public class Pricing {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "price")
    private int price;

    // Konstruktory
    public Pricing() {
    }

    public Pricing(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

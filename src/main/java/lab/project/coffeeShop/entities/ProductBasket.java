package lab.project.coffeeShop.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_basket")
@Data
public class ProductBasket implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "basket_id")
    private Basket basket;

    private int quanity;
}

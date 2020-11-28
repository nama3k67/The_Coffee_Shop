package lab.project.coffeeShop.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "basket")
@Data
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL)
    private Set<Payment> payments;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL)
    private Set<ProductBasket> productBaskets;
}

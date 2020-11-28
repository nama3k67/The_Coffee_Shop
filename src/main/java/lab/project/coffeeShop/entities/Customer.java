package lab.project.coffeeShop.entities;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Nationalized;

import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(nullable = false)
	@Nationalized
	private String name; 
	
	@Column(length = 10, nullable = false)
	private String phoneNumber; 
	
	@Column(unique = true, nullable = false)
	private String email; 
	
	@Column(nullable = false)
	@Nationalized
	private String address; 
	
	@Column(nullable = false)
	private String password; 
	
	private String photo; 
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Payment> payments;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Comment> comments;

	@OneToOne(mappedBy = "customer")
	private Basket basket;
}

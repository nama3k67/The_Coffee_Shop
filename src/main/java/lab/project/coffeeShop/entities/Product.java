package lab.project.coffeeShop.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(nullable = false)
	private String name; 
	
	private long price; 
	
	private String image; 
	
	@Column(columnDefinition = "TEXT")
	private String description; 

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category; 
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<PaymentDetail> paymentDetails; 
}

package lab.project.coffeeShop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "payment_details")
@Data
public class PaymentDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;  
	
	@ManyToOne
	@JoinColumn(name = "payment_id", nullable = false)
	private Payment payment; 

	private int quantity; 
}

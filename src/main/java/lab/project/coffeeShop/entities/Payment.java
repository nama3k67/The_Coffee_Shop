package lab.project.coffeeShop.entities;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Nationalized;
import org.springframework.format.annotation.DateTimeFormat;


import lombok.Data;

@Entity
@Table(name = "payments")
@Data
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderDate; 
	
	private long totalPrice; 
	
	@Column(nullable = false)
	@Nationalized
	private String customerName; 
	
	@Column(nullable = false)
	@Nationalized
	private String customerAddress; 
	
	@Column(length = 10, nullable = false)
	private String phoneNumber; 

	private boolean status; 

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer; 
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "basket_id")
	private Basket basket;
}

package lab.project.coffeeShop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity 
@Table(name = "comments")
@Data
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user; 
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer; 
}

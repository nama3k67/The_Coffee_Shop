package lab.project.coffeeShop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Nationalized;

import lombok.Data;

@Entity
@Table(name = "contacts")
@Data
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Nationalized
	private String name; 
	
	private String email; 
	
	@Column(length = 10)
	private String phoneNumber; 
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String content; 
}

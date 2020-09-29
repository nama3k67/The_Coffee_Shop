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

import org.springframework.format.annotation.DateTimeFormat;


import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(nullable = false)
	private String name; 
	
	@Column(length = 10, nullable = false)
	private String phoneNumber; 
	
	private String photo; 
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthday; 
	
	@Column(unique = true, nullable = false)
	private String email; 
	
	@Column(nullable = false)
	private String address; 
	
	@Column(nullable = false)
	private String password; 
	
	@ManyToOne
	@JoinColumn(name = "roleId", nullable = false)
	private Role role; 
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Payment> payments; 
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Comment> comments; 
}

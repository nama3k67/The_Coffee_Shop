package lab.project.coffeeShop.entities;

import javax.persistence.*;


import lombok.Data;

import java.util.Set;

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

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "father_comment_id")
	private Comment comment;

	@OneToMany(mappedBy = "comment")
	private Set<Comment> child_comments;
}

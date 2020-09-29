package lab.project.coffeeShop.models;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class CommentInfo {
	private int id;
	
	@NotBlank(message = "Not Empty!")
	private String content; 
	
	private int userId, customerId; 
}

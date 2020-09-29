package lab.project.coffeeShop.models;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ContactInfo {
	private int id; 
	private String name; 
	private String email; 
	private String phoneNumber; 
	
	@NotBlank(message = "Not Empty!")
	private String content; 
}

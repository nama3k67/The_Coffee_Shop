package lab.project.coffeeShop.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CustomerInfo {
	private int id; 
	
	@NotBlank(message = "Name is required!")
	@Size(max = 255, message = "Length is over limited!")
	private String name; 
	
	@NotBlank(message = "Phone number is required!")
	@Size(max = 255, message = "Length is over limited!")
	private String phoneNumber; 
	
	@NotBlank(message = "Email is required!")
	@Size(max = 255, message = "Length is over limited!")
	private String email; 
	
	@NotBlank(message = "Address is required!")
	@Size(max = 255, message = "Length is over limited!")
	private String address; 
	
	@NotBlank(message = "Password is required!")
	@Size(max = 255, message = "Length is over limited!")
	private String password; 
	
	private String photo; 
}

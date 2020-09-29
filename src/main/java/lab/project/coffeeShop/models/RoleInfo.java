package lab.project.coffeeShop.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class RoleInfo {
	private int id; 
	
	@NotBlank(message = "Name is required!")
	@Size(max = 255, message = "Length is over limited!")
	private String name; 
}

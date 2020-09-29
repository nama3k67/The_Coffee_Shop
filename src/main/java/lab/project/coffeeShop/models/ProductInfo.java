package lab.project.coffeeShop.models;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ProductInfo {
	private int id; 
	
	@NotBlank(message = "Name is required!")
	@Size(max = 255, message = "Length is over limited!")
	private String name; 
	
	@DecimalMin(value = "0", message = "Wrong format")
	private long price; 
	
	private String image; 
	private String description; 
	private int categoryId; 
}

package lab.project.coffeeShop.models;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class PaymentInfo {
	private int id;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderDate;
	
	private double totalPrice;
	private String customerName; 
	private String customerAddress; 
	private String phoneNumber; 
	private boolean status; 
	private int customerId; 
}

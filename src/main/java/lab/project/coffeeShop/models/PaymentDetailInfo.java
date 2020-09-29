package lab.project.coffeeShop.models;

import lombok.Data;

@Data
public class PaymentDetailInfo {
	private int id; 
	private int productId; 
	private int paymentId; 
	private int quantity; 
}

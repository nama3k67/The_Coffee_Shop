package lab.project.coffeeShop.models;

import java.util.List;

import lombok.Data;
@Data
public class BasketInfo {
	private List<PaymentDetailInfo> paymentDetailInfos; 
	private ProductInfo productInfo; 
	
}

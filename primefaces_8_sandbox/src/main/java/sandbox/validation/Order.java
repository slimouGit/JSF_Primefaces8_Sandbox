package sandbox.validation;

import java.time.LocalDate;

public class Order {
	
	private LocalDate orderDate;
	private LocalDate shippingDate;
	private LocalDate deliveryDate;
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	
	
	
	
	

}

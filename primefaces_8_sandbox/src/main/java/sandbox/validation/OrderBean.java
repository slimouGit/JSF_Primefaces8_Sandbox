package sandbox.validation;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped
public class OrderBean extends AbstractBean {
	
	private String title;
	private Order order;
	
	@PostConstruct
	public void init() {
		this.title = "validation";
		this.order = new Order();
	}
	
	public void checkOrder() {
		System.out.println("Order "+ this.order);
		this.order.setOrderDate(this.order.getOrderDate());
		System.out.println("Order "+ this.order.getOrderDate());
		System.out.println("Order "+ this.order.getShippingDate());
		System.out.println("Order "+ this.order.getDeliveryDate());
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	

}

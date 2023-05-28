package fr.lotus.entity;

import java.io.Serializable;

import fr.lotus.common.IConstant;

public class OrderLine extends PickUpItem implements IConstant, Serializable {
	
	
	private static final long serialVersionUID = -23153027186502371L;
	private Order order;
	
	
	
	
	public OrderLine() {
		this(DEFAULT_ID,
				DEFAULT_QUANTITY,null,null);
		
	}
	public OrderLine(int id, int quantity, Item item, Order order) {
		this.setId ( id);
		this.setQuantity ( quantity);
		this.setItem ( item);
		this.setOrder (order);
	}
	
	
	
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return String.format("OrderLine [getOrder()=%s]", getOrder());
	}
	@Override
	public void preWrite() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void postRead() {
		// TODO Auto-generated method stub
		
	}
	
	

}

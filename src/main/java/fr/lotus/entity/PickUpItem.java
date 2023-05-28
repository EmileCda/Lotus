package fr.lotus.entity;

import java.io.Serializable;

import fr.lotus.common.IConstant;
import fr.lotus.model.implement.ClassDao;

public abstract class PickUpItem  extends ClassDao implements IConstant, Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int quantity;
	private Item item;

	
	
	
	
	
	public PickUpItem() {
		this(DEFAULT_ID,
				DEFAULT_QUANTITY,null
				);
		
	}

	public PickUpItem(int id, int quantity,  Item item) {
		this.setId ( id);
		this.setQuantity ( quantity);
		this.setItem ( item);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return String.format("CartItem [getId()=%s, getQuantity()=%s,  getItem()=%s]", getId(),
				getQuantity(), getItem());
	}

	@Override
	public abstract void preWrite() ;

	@Override
	public abstract void postRead();
	
	
	

}

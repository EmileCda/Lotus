package fr.lotus.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import fr.lotus.common.IConstant;


@Entity
@DiscriminatorValue("cart_item")
@Table(name="cart_item")
//https://en.wikibooks.org/wiki/Java_Persistence/Inheritance#Example_single_table_inheritance_table_in_database
public class CartItem  extends PickUpItem implements IConstant, Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private User user; 
	
	
	
	
	public CartItem() {
		this(DEFAULT_ID,
				DEFAULT_QUANTITY,null,null
				);
		
	}
	public CartItem(int quantity, User user, Item item) {
		this(DEFAULT_ID,quantity,user,item);
	}

	public CartItem(int id, int quantity, User user, Item item) {
		
		this.setId ( id);
		this.setQuantity ( quantity);
		this.setUser ( user);
		this.setItem ( item);
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	@Override
	public String toString() {
		return String.format("CartItem [getId()=%s, getQuantity()=%s, getUser()=%s, getItem()=%s]", getId(),
				getQuantity(), getUser(), getItem());
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

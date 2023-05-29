package fr.lotus.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.lotus.common.IConstant;
import fr.lotus.model.implement.ClassDao;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="item_type")
@Table(name="pickup_item")
public abstract class PickUpItem  extends ClassDao implements IConstant, Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int quantity;
	
	
	@OneToOne(cascade = CascadeType.DETACH, mappedBy = "pickup_item", fetch = FetchType.LAZY)
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

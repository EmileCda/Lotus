package fr.lotus.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Locale.Category;

import fr.lotus.common.IConstant;
import fr.lotus.model.implement.ClassDao;

public class Item  extends ClassDao implements IConstant, Serializable {
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int discount; // in %
	private int inventory;
	private boolean isSalable;
	private String picture;
	private String video;

	private Category category;

	private List<Comment> commentList;
	
	private CartItem cartItem;
	
	
	public Item() {

		this(DEFAULT_ID, DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_PRICE, DEFAULT_DISCOUNT, 
				DEFAULT_INVENTORY, true,null,
				DEFAULT_PICTURE, DEFAULT_VIDEO);
	}
	
	
	public Item(int id, String name, String description, double price, int discount, 
			int inventory, boolean isSalable,Category category,
			String picture, String video) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.setDiscount(discount);
		this.setInventory(inventory);
		this.setSalable(isSalable);
		this.setPicture(picture);
		this.setVideo(video);
		this.setCategory(category);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public boolean isSalable() {
		return isSalable;
	}

	public void setSalable(boolean isSalable) {
		this.isSalable = isSalable;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

	@Override
	public String toString() {
		return String.format(
				"Item [getId()=%s, getName()=%s, getDescription()=%s, getPrice()=%s, getDiscount()=%s, getInventory()=%s, isSalable()=%s, getPicture()=%s, getVideo()=%s, getCategory()=%s, getCommentList()=%s, getCartItem()=%s]",
				getId(), getName(), getDescription(), getPrice(), getDiscount(), getInventory(), isSalable(),
				getPicture(), getVideo(), getCategory(), getCommentList(), getCartItem());
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

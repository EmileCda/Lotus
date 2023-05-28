package fr.lotus.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import fr.lotus.common.IConstant;
import fr.lotus.model.implement.ClassDao;

public class Order extends ClassDao implements IConstant, Serializable {
	
	
	private int id;
	private String orderNumber;

	private Date createDate;
	private Date deliveryDate;

	private float totalDiscount; // in value (not in%)
	private float shippingCosts;
	private float grandTotal;

	private Address deliveryAddress;
	
	private Address billingAddress;
	private BankCard bankCardUsed;
	
	private User user;

	private List<OrderLine> orderLine ;
	
	public Order() {
		this(DEFAULT_ID, DEFAULT_ORDER_NUMBER, DEFAULT_DATE, DEFAULT_DATE, DEFAULT_FLOAT_VALUE, DEFAULT_FLOAT_VALUE,
				DEFAULT_FLOAT_VALUE, null, null, null, null);
	}
	
	
	

	public Order(int id, String orderNumber, Date createDate, Date deliveryDate, float totalDiscount,
			float shippingCosts, float grandTotal, 
			Address deliveryAddress, Address billingAddress,
			BankCard bankCardUsed, User user) {
		this.setId ( id);
		this.setOrderNumber (orderNumber);
		this.setCreateDate (createDate);
		this.setDeliveryDate (deliveryDate);
		this.setTotalDiscount (totalDiscount);
		this.setShippingCosts ( shippingCosts);
		this.setGrandTotal ( grandTotal);
		this.setDeliveryAddress (deliveryAddress);
		this.setBillingAddress ( billingAddress);
		this.setBankCardUsed ( bankCardUsed);
		this.setUser (user);
		this.setOrderLine (orderLine);
	}

	
	public void preWrite(){
		
	}

	public void postRead(){
		
		
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public float getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(float totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public float getShippingCosts() {
		return shippingCosts;
	}

	public void setShippingCosts(float shippingCosts) {
		this.shippingCosts = shippingCosts;
	}

	public float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public BankCard getBankCardUsed() {
		return bankCardUsed;
	}

	public void setBankCardUsed(BankCard bankCardUsed) {
		this.bankCardUsed = bankCardUsed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderLine> getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(List<OrderLine> orderLine) {
		this.orderLine = orderLine;
	}
	
	
	

}

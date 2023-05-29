package fr.lotus.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import fr.lotus.common.IConstant;
import fr.lotus.model.implement.ClassDao;

public class Order extends ClassDao implements IConstant, Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String orderNumber;

	private Date createDate;
	private Date deliveryDate;

	private float totalDiscount; // in value (not in%)
	private float shippingCosts;
	private float grandTotal;

	@OneToOne(cascade = CascadeType.DETACH, mappedBy = "Address", fetch = FetchType.LAZY)
	private Address deliveryAddress;
	
	@OneToOne(cascade = CascadeType.DETACH, mappedBy = "Address", fetch = FetchType.LAZY)
	private Address billingAddress;
	
	@OneToOne(cascade = CascadeType.DETACH, mappedBy = "BankCard", fetch = FetchType.LAZY)
	private BankCard bankCardUsed;
	
	@ManyToOne
	@JoinColumn(name = "costumer_id", nullable = false)
	private Costumer costumer;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Order", fetch = FetchType.LAZY)
	private List<OrderLine> orderLineList ;
	
	public Order() {
		this(DEFAULT_ID, DEFAULT_ORDER_NUMBER, DEFAULT_DATE, DEFAULT_DATE, DEFAULT_FLOAT_VALUE, DEFAULT_FLOAT_VALUE,
				DEFAULT_FLOAT_VALUE, null, null, null, null);
	}
	
	
	

	public Order(int id, String orderNumber, Date createDate, Date deliveryDate, float totalDiscount,
			float shippingCosts, float grandTotal, 
			Address deliveryAddress, Address billingAddress,
			BankCard bankCardUsed, Costumer costumer) {
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
		this.setCostumer (costumer);

		if (this.getOrderLineList()== null)
			this.setOrderLineList(new ArrayList<OrderLine>());

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





	public Costumer getCostumer() {
		return costumer;
	}




	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}




	public List<OrderLine> getOrderLineList() {
		return orderLineList;
	}




	public void setOrderLineList(List<OrderLine> orderLineList) {
		this.orderLineList = orderLineList;
	}
	
	
	

}

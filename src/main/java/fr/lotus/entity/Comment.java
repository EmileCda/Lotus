package fr.lotus.entity;

import fr.lotus.common.IConstant;
import fr.lotus.model.implement.ClassDao;

public class Comment  extends ClassDao implements IConstant {

	private static final long serialVersionUID = 1L;
	private int id; 
	private String  text;
	private int   grade ; // from 0 to 5 
	private Item item;
	private User user;
	
	
	public Comment() {
		this(DEFAULT_ID,DEFAULT_TEXT,DEFAULT_GRADE,null,null);
	}
	
	public Comment( String text, int grade, Item item, User user) {
		this(DEFAULT_ID,text, grade, item, user);
	}
	
	public Comment(int id, String text, int grade, Item item, User user) {
		this.setId ( id);
		this.setText ( text);
		this.setGrade ( grade);
		this.setItem ( item);
		this.setUser ( user);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
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

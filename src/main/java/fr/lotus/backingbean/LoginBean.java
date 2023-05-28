package fr.lotus.backingbean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.lotus.common.IConstant;
import fr.lotus.entity.User;
import fr.lotus.enums.Gender;
import fr.lotus.enums.Profile;
import fr.lotus.model.implement.UserDao;
import fr.lotus.model.interfaces.IUserDao;
import fr.lotus.utils.DataTest;
import fr.lotus.utils.Utils;

@ManagedBean (name ="loginBean")
@SessionScoped
public class LoginBean  implements IConstant{
	
	private User user ; 
	
	public LoginBean() {
		user = new User();
		String firstname = DataTest.firstname();
		this.getUser().setEmail(DataTest.email(firstname,DataTest.lastname()));
		this.getUser().setPassword(firstname);
		
	}

	
	public String checkUser() throws Exception {
				
		IUserDao userDao = new UserDao();
		String emailInput = this.getUser().getEmail();
		
//		String emailInput = this.getUser().getEmail();
		
		User userRetreive = userDao.read(emailInput);
		
//		this.setUser(userRetreive);
//		this.getUser().setProfile(Profile.CLIENT);
//		this.getUser().setProfile(Profile.STORE_KEEPER);
//		this.getUser().setProfile(Profile.MANAGER);

		
		
		switch (this.getUser().getProfile()) {
		case CLIENT : return  CLIENT_HOME;
		case MANAGER : return ADMIN_HOME; 
		case STORE_KEEPER : return  STOREKEEPER_HOME;
		default: return HOME;
		} 
	
		
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	

}

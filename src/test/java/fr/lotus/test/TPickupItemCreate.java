package fr.lotus.test;

import fr.lotus.entity.Address;
import fr.lotus.entity.BankCard;
import fr.lotus.entity.User;
import fr.lotus.entity.User;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.DataTest;
import fr.lotus.utils.Utils;

public class TPickupItemCreate {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		int maxIndex = 10;
		User user = DataTest.genUser() ;
		User userAdded = new User() ;
		ICrudDao userDao = new CrudDao(user);
		
		try {
			for (int index = 0 ; index < maxIndex; index++) {

				user = DataTest.genUser() ;		// generate random user
				userAdded = (User) userDao.create(user); // create user in database
				if (userAdded != null)
					Utils.trace(userAdded.toString());
				else
					Utils.trace("userAdded is null ");
			}
		} catch (Exception e) {
			Utils.trace("catch create " + e.toString());
		}finally {
			userDao.close();
		}
		
		
		
		Utils.trace("*************************** end ************************************");
		
	}
}

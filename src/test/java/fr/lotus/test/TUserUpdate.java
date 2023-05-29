package fr.lotus.test;

import fr.lotus.entity.User;
import fr.lotus.entity.User;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TUserUpdate {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		int rowId = 12;
		User user =  new User();
		ICrudDao userDao = new CrudDao(user) ;
		try {
			user = (User) userDao.read(rowId );
			if (user == null )
				Utils.trace("User null ");
			else {
				Utils.trace("Before" + user.toString());

				// -------------------------- update ----------------------
				user.setIsActif(false);
				userDao.update(user);
	
				user = (User) userDao.read(rowId);
				if (user != null )
					Utils.trace("After" + user.toString());
				else
					Utils.trace("User null ");
			}

		} catch (

				Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}finally {
			userDao.close();
		}
		
		
		Utils.trace("*************************** end ************************************");
		
	}
}

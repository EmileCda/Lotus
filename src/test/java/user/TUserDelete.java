package user;

import fr.lotus.entity.User;
import fr.lotus.entity.User;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TUserDelete {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		
		int rowId =  4;
		User user = new User();
		ICrudDao userDao = new CrudDao(user);
		try {
			user = (User) userDao.read(rowId);
			if (user == null) 
				Utils.trace("Error : l'adresse n'existe pas");
			else {
				Utils.trace(user.toString());
				userDao.delete(user );
				user = (User) userDao.read(rowId);
				if (user != null)
					Utils.trace("Error not remove");
				else
					Utils.trace("remove ok");
			}
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}finally {
			userDao.close();
		}
		
		Utils.trace("*************************** end ************************************");
		
	}
}

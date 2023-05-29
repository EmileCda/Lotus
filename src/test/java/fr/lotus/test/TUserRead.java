package fr.lotus.test;

import java.util.ArrayList;
import java.util.List;

import fr.lotus.entity.User;
import fr.lotus.entity.User;
import fr.lotus.model.implement.ClassDao;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TUserRead {
	public static void main(String[] args) {
		Utils.trace("*************************** Begin ************************************");
		readMany();
		readOne();
		Utils.trace("*************************** end ************************************");
		
	}
	//-------------------------------------------------------------------------------------------------	
	public static void readMany() {
		Utils.trace("=========================== read many  ===========================");

		List<ClassDao> userList = new ArrayList<ClassDao>() ;
		User user = new User() ;
		ICrudDao userDao = new CrudDao(user);
		try {
			userList = userDao.read();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			userDao.close();
		}
		if ((userList.size() >0  ) && (userList != null)) {
			for (ClassDao classDao : userList) {
				user = (User)classDao ; 
				Utils.trace(user.toString()); 
			}
		}
		else
			Utils.trace(" userList vide");
	}
	//-------------------------------------------------------------------------------------------------	
	public static void readOne() {
		Utils.trace("=========================== read One  ===========================");
		int userId = 3;
		User user = new User() ;
		ICrudDao userDao = new CrudDao(user);
		try {
			user = (User) userDao.read(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (user != null )
			Utils.trace(user.toString());
		else 
			Utils.trace("user null");
		
	}
}

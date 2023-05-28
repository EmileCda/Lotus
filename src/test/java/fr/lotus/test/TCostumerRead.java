package fr.lotus.test;

import fr.lotus.entity.Costumer;

import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TCostumerRead {
	public static void main(String[] args) {
		int maxUserId = 10; 
		Utils.trace("*************************** Begin ************************************");
		
		Costumer costumer = new Costumer() ;
		ICrudDao costumerDao = new CrudDao() ;
		try {
			for (int userId = 1; userId <= maxUserId; userId ++) {
				costumer = (Costumer) costumerDao.read(userId,costumer.getClass());
				Utils.trace(costumer.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utils.trace("*************************** end ************************************");
		
	}
}

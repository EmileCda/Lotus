package fr.lotus.test;

import fr.lotus.entity.Param;
import fr.lotus.entity.User;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TParamRead {
	public static void main(String[] args) {
		
		int maxRow = 10; 
		Utils.trace("*************************** Begin ************************************");
		
		Param param = new Param() ;
		ICrudDao paramDao = new CrudDao() ;
		try {
			for (int rowId = 1; rowId <= maxRow; rowId ++) {
				param = (Param) paramDao.read(rowId,param.getClass());
				Utils.trace(param.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utils.trace("*************************** end ************************************");
		
	}
}

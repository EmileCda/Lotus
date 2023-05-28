package fr.lotus.test;

import fr.lotus.entity.Param;
import fr.lotus.entity.User;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TParamUpdate {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		int maxRow = 1; 
		Param param = new Param() ;
		ICrudDao paramDao = new CrudDao() ;
		try {
			for (int rowId = 2; rowId <= maxRow; rowId ++) {
				param = (Param) paramDao.read(rowId,param.getClass());
				Utils.trace("Before"+param.toString());

				//-------------------------- update ----------------------
				param.setIntValue(rowId);
				paramDao.update(param);
				param = (Param) paramDao.read(rowId,param.getClass());
				Utils.trace("After"+param.toString());
				paramDao.delete(param);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		Utils.trace("*************************** end ************************************");
		
	}
}

package fr.lotus.test;

import fr.lotus.entity.Param;

import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.DataTest;
import fr.lotus.utils.Utils;

public class TParamCreate {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		int maxIndex = 10 ; 
		
		
		ICrudDao paramDao = new CrudDao();
		Param paramAdded = new Param() ;
		Param param = new Param() ;
		param = DataTest.genParam();
		
		try {
			for (int index = 0 ; index< maxIndex; index++) {
				
				param = DataTest.genParam();
				paramAdded = (Param) paramDao.create(param);
			}
			
		} catch (Exception e) {
			Utils.trace("catch create " + e.toString());
		}
		
		Utils.trace(paramAdded.toString());

		Utils.trace("*************************** end ************************************");
		
	}
}

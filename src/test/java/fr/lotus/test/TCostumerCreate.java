package fr.lotus.test;

import fr.lotus.entity.Address;
import fr.lotus.entity.Costumer;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.DataTest;
import fr.lotus.utils.Utils;

public class TCostumerCreate {
	public static void main(String[] args) {
		int maxIndex = 10 ;
		Utils.trace("*************************** Begin ************************************");
		
		Costumer costumer = DataTest.genCostumer() ;
		
		Utils.trace(costumer.toString());
		
		
		Address address = new Address() ;
		address = DataTest.genAddress();
		Utils.trace(address.toString());
		
		address.setCostumer(costumer);
		costumer.addAddress(address);
		
		
		
//		IObjectDao costumerDao = new CostumerDao();
		ICrudDao costumerDao = new CrudDao();
		Costumer costumerAdded = new Costumer() ;
		
		try {
			for (int index = 0 ; index < maxIndex; index++) {
				costumer = DataTest.genCostumer() ;
				int maxAddress = Utils.randInt(1, 4);
				for (int nbAddress = 0 ; nbAddress < maxAddress; nbAddress++) {
				
					address = DataTest.genAddress();
					address.setCostumer(costumer);
					costumer.addAddress(address);
				}

				costumerAdded = (Costumer) costumerDao.create(costumer);
			}
		} catch (Exception e) {
			Utils.trace("catch create " + e.toString());
		}
		
		Utils.trace(costumerAdded.toString());
		Utils.trace("*************************** end ************************************");
		
	}
}

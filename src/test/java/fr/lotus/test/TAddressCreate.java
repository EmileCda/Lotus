package fr.lotus.test;

import fr.lotus.entity.Address;
import fr.lotus.entity.Costumer;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.DataTest;
import fr.lotus.utils.Utils;

public class TAddressCreate {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		int userId = 1;
		Costumer costumer = new Costumer() ;
//		IObjectDao costumerDao = new CostumerDao();
		ICrudDao costumerDao = new CrudDao();
		try {
			costumer = (Costumer) costumerDao.read(userId,costumer.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.trace(costumer.toString());
		

		Address address = new Address() ;
		address = DataTest.genAddress();
		Utils.trace(address.toString());
		
		address.setCostumer(costumer);
//		costumer.addAddress(address);
//		Utils.trace(costumer.getAddressList().get(0).toString());
		
		ICrudDao addressDao = new CrudDao();
		Address addressAdded = new Address() ;
		
		try {
			addressAdded = (Address) addressDao.create(address);
		} catch (Exception e) {
			Utils.trace("catch create " + e.toString());
		}
		
		Utils.trace(addressAdded.toString());

		Utils.trace("*************************** end ************************************");
		
	}
}

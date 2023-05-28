package fr.lotus.test;

import fr.lotus.entity.Address;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TAddressRead {
	public static void main(String[] args) {
		int AddressId = 1 ; 
		Utils.trace("*************************** Begin ************************************");
		

		Address address = new Address() ;
//		IObjectDao addressDao = new ObjectDao ();
		ICrudDao addressDao = new CrudDao() ;
		try {
			address = (Address) addressDao.read(AddressId,address.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.trace(address.toString());
		
		Utils.trace("*************************** end ************************************");
		
	}
}

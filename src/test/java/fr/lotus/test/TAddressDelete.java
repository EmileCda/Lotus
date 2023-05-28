package fr.lotus.test;

import fr.lotus.entity.Address;
import fr.lotus.entity.User;
import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TAddressDelete {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		

		int rowId = 1;
		Address address = new Address();
		ICrudDao addressDao = new CrudDao();
		try {
			address = (Address) addressDao.read(rowId, address.getClass());
			addressDao.delete(address );

			address = (Address) addressDao.read(rowId, address.getClass());

			if (address != null)
				Utils.trace("Erros remove");
			else
				Utils.trace("remove ok");

		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
;
		
		Utils.trace("*************************** end ************************************");
		
	}
}

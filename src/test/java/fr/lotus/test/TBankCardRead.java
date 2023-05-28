package fr.lotus.test;

import fr.lotus.entity.BankCard;

import fr.lotus.model.implement.CrudDao;
import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class TBankCardRead {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		int bankCardId = 4 ;

		BankCard bankCard = new BankCard() ;
//		IObjectDao bankCardDao = new ObjectDao ();
		ICrudDao bankCardDao = new CrudDao() ;
		try {
			bankCard = (BankCard) bankCardDao.read(bankCardId,bankCard.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (bankCard != null )
			Utils.trace(bankCard.toString());
		else
			Utils.trace(" bankCard == null ");
		
		Utils.trace("*************************** end ************************************");
		
	}
}

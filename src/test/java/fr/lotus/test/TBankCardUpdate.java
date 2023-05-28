package fr.lotus.test;

import fr.lotus.entity.User;
import fr.lotus.utils.Utils;

public class TBankCardUpdate {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		
		User user = new User() ;
		
		Utils.trace(user.toString());
		
		Utils.trace("*************************** end ************************************");
		
	}
}

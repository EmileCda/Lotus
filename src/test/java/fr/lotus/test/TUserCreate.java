package fr.lotus.test;

import fr.lotus.entity.User;
import fr.lotus.utils.DataTest;
import fr.lotus.utils.Utils;

public class TUserCreate {
	public static void main(String[] args) {
		
		Utils.trace("*************************** Begin ************************************");
		
		User user = DataTest.genUser() ;
		
		Utils.trace(user.toString());
		
		Utils.trace("*************************** end ************************************");
		
	}
}

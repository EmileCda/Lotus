package fr.lotus.model.interfaces;

import fr.lotus.model.implement.ClassDao;

public interface ICrudDao {
	
	public Object create (ClassDao myDao)  throws Exception;
	public Object  read (int id,Class<?> objectClass)  throws Exception;
	public void update(ClassDao myDao) throws Exception; 
	public void delete (ClassDao myDao)  throws Exception;

}

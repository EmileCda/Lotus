package fr.lotus.model.implement;

import fr.lotus.model.interfaces.ICrudDao;
import fr.lotus.utils.Utils;

public class CrudDao extends UtilDao implements ICrudDao {

	@Override
	public ClassDao create(ClassDao myDao) throws Exception {

		try {
			beginTransaction();
		
			myDao.preWrite();
			this.getSession().save(myDao);
			commit();


		} catch (Exception e) {

			Utils.trace("catch create "+ e.toString());
			rollBack();

		} finally {
			close();

		}
		return myDao;
	}

//-------------------------------------------------------------------------------------------------

	@Override
	public ClassDao read(int id, Class<?> objectClass) throws Exception {
		ClassDao myDao  = null;
		try {
			myDao = (ClassDao) this.getSession().find(objectClass, id);
			if (myDao != null)
				myDao.postRead();

		} catch (Exception e) {
			Utils.trace("catch Read " +e.toString());

		} finally {
			close();
		}

		return myDao;
	}

//-------------------------------------------------------------------------------------------------
	@Override
	public void update(ClassDao myDao) throws Exception {
		try {
			beginTransaction();
		
			myDao.preWrite();
			this.getSession().update(myDao);
			commit();


		} catch (Exception e) {

			Utils.trace("catch update "+ e.toString());
			rollBack();

		} finally {
			close();

		}
	}

//-------------------------------------------------------------------------------------------------
	@Override
	public void delete(ClassDao myDao) throws Exception {
		try {
			beginTransaction();
		
			this.getSession().remove(myDao);
			commit();


		} catch (Exception e) {

			Utils.trace("catch update "+ e.toString());
			rollBack();

		} finally {
			close();

		}
		
	}


//-------------------------------------------------------------------------------------------------
}

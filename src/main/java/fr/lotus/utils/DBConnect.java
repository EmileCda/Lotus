package fr.lotus.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public  final class DBConnect {
	private static DBConnect instance;
	private static SessionFactory sessionFactory;
	private static Session session;
	private static int nbOpenSession;

	
	
	private DBConnect() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration()
					.configure()
					.buildSessionFactory();
		}
	}


	public static Session getSession() {
		if (instance == null) {
			instance = new DBConnect();
		}
		
		if (session == null || !session.isOpen()) {
			Utils.trace(String.format("*******************************open connection : %d",DBConnect.nbOpenSession));
			DBConnect.nbOpenSession++;
			session = sessionFactory.openSession();
		}
		
		return session;
		
	}

	public static int close() {
		Utils.trace(String.format("*******************************close connection : %d",DBConnect.nbOpenSession));
		DBConnect.nbOpenSession--;
		if (DBConnect.nbOpenSession <=0) {
			if (session != null && session.isOpen())
				session.close();
		}
		return DBConnect.nbOpenSession;
		
		
	}

}

package app;
import jakarata.persistance.EntityManagerFactory;
import jakarata.persistance.persistance;

public class HibernateUtil {

	private static final EntityManagerFactory  entityManagerFactory;
	static {
		try {
		
			entityManagerFactory=persistance.createEntityManagerFactory("persistence");
			
		}catch(Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
		
		}
	public static EntityManagerFactory getentityManagerFactory() {
		return entityManagerFactory;
		
	}
	
	public static void shutDown() {
		if(entityManagerFactory!=null && entityManagerFactory.isOpen()) {
			entityManagerFactory.close();
			
	}
	}
}

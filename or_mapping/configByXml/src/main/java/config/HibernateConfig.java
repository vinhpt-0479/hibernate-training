package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

	@SuppressWarnings("unused")
	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	public static void setFactory(SessionFactory factory) {
		HibernateConfig.factory = factory;
	}

	public static void config() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			factory = configuration.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}

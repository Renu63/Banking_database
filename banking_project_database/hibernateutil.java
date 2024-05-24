package banking_project_database;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import banking.Accdetail;

public class hibernateutil {
	private static SessionFactory sf;

	public static SessionFactory getssessionFactory() {
		Map<String, Object> property = new HashMap<String, Object>();
		property.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		property.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
		property.put(Environment.USER, "root");
		property.put(Environment.PASS, "Root");
		property.put(Environment.SHOW_SQL, "true");
		property.put(Environment.DIALECT, "org.hibernate.dialect.MySQL55Dialect");
		property.put(Environment.HBM2DDL_AUTO, "update");

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(property).build();
		MetadataSources ms = new MetadataSources(registry);
		ms.addAnnotatedClass(Accdetail.class);
		Metadata msd = ms.getMetadataBuilder().build();
		SessionFactory sf = msd.getSessionFactoryBuilder().build();
		return sf;
	}
}

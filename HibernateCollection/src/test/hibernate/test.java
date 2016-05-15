package test.hibernate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import test.dto.Address;
import test.dto.Employee;

public class test {

	
	public static void main(String[] args) {
	
	Employee employee= new Employee();
	
		Address a1=new Address();
		a1.setCity("bkn");
		a1.setPincode("334001");
		a1.setStreet("rajasthan");
		
		Address a2=new Address();
		a2.setCity("delhi");
		a2.setPincode("201301");
		a2.setStreet("delhi");
	
		Collection<Address> set = new ArrayList<Address>();
		set.add(a1);
		set.add(a2);
		employee.setUser_name("vijay apurva");
		employee.setList(set);
		
		
		Configuration configuration= new Configuration().configure();
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
	
		session.beginTransaction();
		
		session.save(employee);
		
		session.getTransaction().commit();
		
		session.close();

	}
	
}


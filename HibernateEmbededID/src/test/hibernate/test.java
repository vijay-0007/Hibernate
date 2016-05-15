package test.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import test.dto.Address;
import test.dto.Employee;
import test.dto.LoginID;



public class test {

	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		LoginID id = new LoginID();
		
		id.setUserId(1);
		id.setUserName("vijay");
		emp.setLoginId(id);
		emp.setDisciption("good employee");
		
		
		Address a1=new Address();
		a1.setPincode("334001");
		a1.setStreet("rajasthan");
		
		Address a2=new Address();
		a2.setPincode("201301");
		a2.setStreet("delhi");
	
		Set<Address> set = new HashSet<Address>();
		set.add(a1);
		set.add(a2);
		
		emp.setAdd(set);
		
		Configuration configuration = new Configuration().configure();
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		
		
		
		
	}
	
}

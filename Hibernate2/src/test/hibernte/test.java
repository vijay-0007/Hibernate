package test.hibernte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import test.dto.Address;
import test.dto.Employee;

public class test {

	
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		emp.setUser_name("vijay_apurva");
		
		Address add = new Address();
		add.setCity("bkn");
		add.setCountry("india");
		add.setPinCode("334001");
		add.setStreet("b-3-250");
		emp.setAddress(add);
		
		Configuration configuration = new Configuration().configure();
		
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties()).build();

			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			Session session = sessionFactory.openSession();
			
			session.beginTransaction();
			
			session.save(emp);
			
			session.getTransaction().commit();
			session.close();
		
			
			emp=null ;
			
			session=sessionFactory.openSession();
			
			session.beginTransaction();
			
			emp = (Employee) session.get(Employee.class, 1);
			
			session.getTransaction().commit();
			
			session.close();
			
			System.out.println(emp);
			
	}
	
}

package test.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import test.dto.Employee;

public class test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
	
		e1.setUserName("vijay");
		e1.setAddress("B-3-250 sudarshana nagar");
		e1.setDisciption("vijay is good employee");
		e1.setJoiningDate(new Date());
			
		
		Employee e2 = new Employee();
		
		e2.setUserName("vijay apurva");
		e2.setAddress("B-3-250 sudarshana nagar");
		e2.setDisciption("good employee");
		e2.setJoiningDate(new Date());
		
		Configuration  configuration  = new Configuration().configure();
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.getTransaction().commit();
		session.close();
		
		e1=null ;
		
		
		session=sessionFactory.openSession();
		session.beginTransaction();
		
		e1 =(Employee)session.get(Employee.class, 1);
		
		session.getTransaction().commit();
		
		System.out.println(e1.getUserName()+"  "+e1.getUserId()+"  "+e1.getDisciption());
		
	}
	
}

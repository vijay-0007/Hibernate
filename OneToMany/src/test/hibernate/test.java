package test.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import test.dto.UserDetails;
import test.dto.Vehicle;

public class test {

	public static void main(String[] args) {
		
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("honda_city");
	
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("civic");
		
		UserDetails details= new UserDetails();
		details.setUserName("vijay");
		ArrayList<Vehicle> lst= new ArrayList<>();
		
		lst.add(vehicle);
		lst.add(vehicle2);
		
		details.setVehicle(lst);	
		
		Configuration configuration = new Configuration().configure();
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory factory = configuration.buildSessionFactory(registry);
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(details);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
		
	}
	
	
	
}

package test.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Address_test")
public class Employee {

	@Id @GeneratedValue
	int user_id ; 
	String user_name;
	
	@AttributeOverrides(
			{
			@AttributeOverride(name="country" ,column=@Column(name="emp_country")),
			@AttributeOverride(name="city" ,column=@Column(name="emp_city"))
			}
			)
	Address address;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [user_id=" + user_id + ", user_name=" + user_name
				+ ", address=" + address + "]";
	}
	
	
	
}

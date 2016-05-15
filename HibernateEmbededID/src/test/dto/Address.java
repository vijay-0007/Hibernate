package test.dto;
import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class Address implements Serializable {
	
	String street ; 
	String pincode ;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}

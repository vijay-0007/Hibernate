package test.dto;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USER_EMP")
public class Employee {

	@Id @GeneratedValue
	@Column(name="USER_ID")
	int userId ;
	
	@Column(name="USER_NAME")
	String userName ;
	
	@Column(name="USER_Address")
	String Address ;
	
	@Temporal(TemporalType.DATE)
	Date joiningDate;
	
	@Lob
	String Disciption ; 
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDisciption() {
		return Disciption;
	}
	public void setDisciption(String disciption) {
		Disciption = disciption;
	}
	
}

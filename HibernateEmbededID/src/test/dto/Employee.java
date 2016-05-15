package test.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.jgroups.util.AdditionalDataUUID;

@Entity
@Table(name="loginTest")
public class Employee {

	@EmbeddedId
	LoginID loginId ;
	String disciption ;
	
	@ElementCollection
	@CollectionTable(name="loginMemberAddress")
	Set<Address> add = new HashSet<Address>();

	public LoginID getLoginId() {
		return loginId;
	}

	public void setLoginId(LoginID loginId) {
		this.loginId = loginId;
	}

	public String getDisciption() {
		return disciption;
	}

	public void setDisciption(String disciption) {
		this.disciption = disciption;
	}

	public Set<Address> getAdd() {
		return add;
	}

	public void setAdd(Set<Address> add) {
		this.add = add;
	}
	
	
	
	
}

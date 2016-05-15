package test.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="collection_test")
public class Employee {

	@Id @GeneratedValue
	int user_id;
	String user_name;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(joinColumns=@JoinColumn(name="userID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name="Address_id") }, generator = "hilo-gen", type = @Type(type="long"))
	
	Collection<Address> list  = new ArrayList<>();

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

	public Collection<Address> getList() {
		return list;
	}

	public void setList(Collection<Address> list) {
		this.list = list;
	}
	
}

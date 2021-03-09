package tn.esprit.spring.entity;
import java.io.Serializable;

import java.util.* ;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import tn.esprit.spring.entity.Claims;
@Entity 
@Table(name="T_User")
public class User implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_ID")
	
	private Long User_Id ; 
	private String User_Email ;
	private String User_Password ;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set <Claims> l_Claims ;

	public Long getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(Long user_Id) {
		User_Id = user_Id;
	}

	public String getUser_Email() {
		return User_Email;
	}

	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}

	public String getUser_Password() {
		return User_Password;
	}

	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}

	public Set<Claims> getL_Claims() {
		return l_Claims;
	}

	public void setL_Claims(Set<Claims> l_Claims) {
		this.l_Claims = l_Claims;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((User_Email == null) ? 0 : User_Email.hashCode());
		result = prime * result + ((User_Id == null) ? 0 : User_Id.hashCode());
		result = prime * result + ((User_Password == null) ? 0 : User_Password.hashCode());
		result = prime * result + ((l_Claims == null) ? 0 : l_Claims.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (User_Email == null) {
			if (other.User_Email != null)
				return false;
		} else if (!User_Email.equals(other.User_Email))
			return false;
		if (User_Id == null) {
			if (other.User_Id != null)
				return false;
		} else if (!User_Id.equals(other.User_Id))
			return false;
		if (User_Password == null) {
			if (other.User_Password != null)
				return false;
		} else if (!User_Password.equals(other.User_Password))
			return false;
		if (l_Claims == null) {
			if (other.l_Claims != null)
				return false;
		} else if (!l_Claims.equals(other.l_Claims))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [User_Id=" + User_Id + ", User_Email=" + User_Email + ", User_Password=" + User_Password
				+ ", l_Claims=" + l_Claims + "]";
	}

	public User(Long user_Id, String user_Email, String user_Password, Set<Claims> l_Claims) {
		super();
		User_Id = user_Id;
		User_Email = user_Email;
		User_Password = user_Password;
		this.l_Claims = l_Claims;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}

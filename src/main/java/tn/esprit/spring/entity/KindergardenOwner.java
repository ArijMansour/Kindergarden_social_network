package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import tn.esprit.spring.entity.User;
@Entity
@Table(name="T_Staff")
public class KindergardenOwner extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="KindergardenOwner_ID")
    private Long KindergardenOwner_Id ;

	public Long getKindergardenOwner_Id() {
		return KindergardenOwner_Id;
	}

	public void setKindergardenOwner_Id(Long kindergardenOwner_Id) {
		KindergardenOwner_Id = kindergardenOwner_Id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((KindergardenOwner_Id == null) ? 0 : KindergardenOwner_Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KindergardenOwner other = (KindergardenOwner) obj;
		if (KindergardenOwner_Id == null) {
			if (other.KindergardenOwner_Id != null)
				return false;
		} else if (!KindergardenOwner_Id.equals(other.KindergardenOwner_Id))
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "KindergardenOwner [KindergardenOwner_Id=" + KindergardenOwner_Id + "]";
	}

	public KindergardenOwner(Long user_Id, String user_Email, String user_Password, Set<Claims> l_Claims,
			Long kindergardenOwner_Id) {
		super(user_Id, user_Email, user_Password, l_Claims);
		KindergardenOwner_Id = kindergardenOwner_Id;
	}
	
	public KindergardenOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

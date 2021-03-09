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
import javax.persistence.OneToOne;
import javax.persistence.Table; 
import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.Club;
import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.Activity;
@Entity 
@Table(name="T_Kindergarden")
public class Kindergarden implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Kindergarden_ID")
	
	private Long Kindergarden_Id ;
	private String Kindergarden_name ;
	private String kindergarden_adresse ; 
	private Long Kindergarden_phone ; 
	private String Kindergarden_Matricule_Fiscale ; 
	private Date Kindergarden_Date ; 
	private String Kindergarden_Email ; 

	@OneToMany(cascade = CascadeType.ALL)
	private Set <Appointment> l_Appointment ; 
	@OneToMany(cascade = CascadeType.ALL)
	private Set <Club> l_Club ; 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Event> l_Event ;
	@OneToMany(cascade = CascadeType.ALL)
	private Set< Child> l_child ;
	@OneToMany(cascade = CascadeType.ALL)
	private Set< Activity> l_Activity;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Meeting> l_Meeting;
	@OneToOne 
	private Staff Staff ;
	public Long getKindergarden_Id() {
		return Kindergarden_Id;
	}
	public void setKindergarden_Id(Long kindergarden_Id) {
		Kindergarden_Id = kindergarden_Id;
	}
	public String getKindergarden_name() {
		return Kindergarden_name;
	}
	public void setKindergarden_name(String kindergarden_name) {
		Kindergarden_name = kindergarden_name;
	}
	public String getKindergarden_adresse() {
		return kindergarden_adresse;
	}
	public void setKindergarden_adresse(String kindergarden_adresse) {
		this.kindergarden_adresse = kindergarden_adresse;
	}
	public Long getKindergarden_phone() {
		return Kindergarden_phone;
	}
	public void setKindergarden_phone(Long kindergarden_phone) {
		Kindergarden_phone = kindergarden_phone;
	}
	public String getKindergarden_Matricule_Fiscale() {
		return Kindergarden_Matricule_Fiscale;
	}
	public void setKindergarden_Matricule_Fiscale(String kindergarden_Matricule_Fiscale) {
		Kindergarden_Matricule_Fiscale = kindergarden_Matricule_Fiscale;
	}
	public Date getKindergarden_Date() {
		return Kindergarden_Date;
	}
	public void setKindergarden_Date(Date kindergarden_Date) {
		Kindergarden_Date = kindergarden_Date;
	}
	public String getKindergarden_Email() {
		return Kindergarden_Email;
	}
	public void setKindergarden_Email(String kindergarden_Email) {
		Kindergarden_Email = kindergarden_Email;
	}
	public Set<Appointment> getL_Appointment() {
		return l_Appointment;
	}
	public void setL_Appointment(Set<Appointment> l_Appointment) {
		this.l_Appointment = l_Appointment;
	}
	public Set<Club> getL_Club() {
		return l_Club;
	}
	public void setL_Club(Set<Club> l_Club) {
		this.l_Club = l_Club;
	}
	public Set<Event> getL_Event() {
		return l_Event;
	}
	public void setL_Event(Set<Event> l_Event) {
		this.l_Event = l_Event;
	}
	public Set<Child> getL_child() {
		return l_child;
	}
	public void setL_child(Set<Child> l_child) {
		this.l_child = l_child;
	}
	public Set<Activity> getL_Activity() {
		return l_Activity;
	}
	public void setL_Activity(Set<Activity> l_Activity) {
		this.l_Activity = l_Activity;
	}
	public Set<Meeting> getL_Meeting() {
		return l_Meeting;
	}
	public void setL_Meeting(Set<Meeting> l_Meeting) {
		this.l_Meeting = l_Meeting;
	}
	public Staff getStaff() {
		return Staff;
	}
	public void setStaff(Staff staff) {
		Staff = staff;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Kindergarden_Date == null) ? 0 : Kindergarden_Date.hashCode());
		result = prime * result + ((Kindergarden_Email == null) ? 0 : Kindergarden_Email.hashCode());
		result = prime * result + ((Kindergarden_Id == null) ? 0 : Kindergarden_Id.hashCode());
		result = prime * result
				+ ((Kindergarden_Matricule_Fiscale == null) ? 0 : Kindergarden_Matricule_Fiscale.hashCode());
		result = prime * result + ((Kindergarden_name == null) ? 0 : Kindergarden_name.hashCode());
		result = prime * result + ((Kindergarden_phone == null) ? 0 : Kindergarden_phone.hashCode());
		result = prime * result + ((Staff == null) ? 0 : Staff.hashCode());
		result = prime * result + ((kindergarden_adresse == null) ? 0 : kindergarden_adresse.hashCode());
		result = prime * result + ((l_Activity == null) ? 0 : l_Activity.hashCode());
		result = prime * result + ((l_Appointment == null) ? 0 : l_Appointment.hashCode());
		result = prime * result + ((l_Club == null) ? 0 : l_Club.hashCode());
		result = prime * result + ((l_Event == null) ? 0 : l_Event.hashCode());
		result = prime * result + ((l_Meeting == null) ? 0 : l_Meeting.hashCode());
		result = prime * result + ((l_child == null) ? 0 : l_child.hashCode());
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
		Kindergarden other = (Kindergarden) obj;
		if (Kindergarden_Date == null) {
			if (other.Kindergarden_Date != null)
				return false;
		} else if (!Kindergarden_Date.equals(other.Kindergarden_Date))
			return false;
		if (Kindergarden_Email == null) {
			if (other.Kindergarden_Email != null)
				return false;
		} else if (!Kindergarden_Email.equals(other.Kindergarden_Email))
			return false;
		if (Kindergarden_Id == null) {
			if (other.Kindergarden_Id != null)
				return false;
		} else if (!Kindergarden_Id.equals(other.Kindergarden_Id))
			return false;
		if (Kindergarden_Matricule_Fiscale == null) {
			if (other.Kindergarden_Matricule_Fiscale != null)
				return false;
		} else if (!Kindergarden_Matricule_Fiscale.equals(other.Kindergarden_Matricule_Fiscale))
			return false;
		if (Kindergarden_name == null) {
			if (other.Kindergarden_name != null)
				return false;
		} else if (!Kindergarden_name.equals(other.Kindergarden_name))
			return false;
		if (Kindergarden_phone == null) {
			if (other.Kindergarden_phone != null)
				return false;
		} else if (!Kindergarden_phone.equals(other.Kindergarden_phone))
			return false;
		if (Staff == null) {
			if (other.Staff != null)
				return false;
		} else if (!Staff.equals(other.Staff))
			return false;
		if (kindergarden_adresse == null) {
			if (other.kindergarden_adresse != null)
				return false;
		} else if (!kindergarden_adresse.equals(other.kindergarden_adresse))
			return false;
		if (l_Activity == null) {
			if (other.l_Activity != null)
				return false;
		} else if (!l_Activity.equals(other.l_Activity))
			return false;
		if (l_Appointment == null) {
			if (other.l_Appointment != null)
				return false;
		} else if (!l_Appointment.equals(other.l_Appointment))
			return false;
		if (l_Club == null) {
			if (other.l_Club != null)
				return false;
		} else if (!l_Club.equals(other.l_Club))
			return false;
		if (l_Event == null) {
			if (other.l_Event != null)
				return false;
		} else if (!l_Event.equals(other.l_Event))
			return false;
		if (l_Meeting == null) {
			if (other.l_Meeting != null)
				return false;
		} else if (!l_Meeting.equals(other.l_Meeting))
			return false;
		if (l_child == null) {
			if (other.l_child != null)
				return false;
		} else if (!l_child.equals(other.l_child))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kindergarden [Kindergarden_Id=" + Kindergarden_Id + ", Kindergarden_name=" + Kindergarden_name
				+ ", kindergarden_adresse=" + kindergarden_adresse + ", Kindergarden_phone=" + Kindergarden_phone
				+ ", Kindergarden_Matricule_Fiscale=" + Kindergarden_Matricule_Fiscale + ", Kindergarden_Date="
				+ Kindergarden_Date + ", Kindergarden_Email=" + Kindergarden_Email + ", l_Appointment=" + l_Appointment
				+ ", l_Club=" + l_Club + ", l_Event=" + l_Event + ", l_child=" + l_child + ", l_Activity=" + l_Activity
				+ ", l_Meeting=" + l_Meeting + ", Staff=" + Staff + "]";
	}
	public Kindergarden(Long kindergarden_Id, String kindergarden_name, String kindergarden_adresse,
			Long kindergarden_phone, String kindergarden_Matricule_Fiscale, Date kindergarden_Date,
			String kindergarden_Email, Set<Appointment> l_Appointment, Set<Club> l_Club, Set<Event> l_Event,
			Set<Child> l_child, Set<Activity> l_Activity, Set<Meeting> l_Meeting, tn.esprit.spring.entity.Staff staff) {
		super();
		Kindergarden_Id = kindergarden_Id;
		Kindergarden_name = kindergarden_name;
		this.kindergarden_adresse = kindergarden_adresse;
		Kindergarden_phone = kindergarden_phone;
		Kindergarden_Matricule_Fiscale = kindergarden_Matricule_Fiscale;
		Kindergarden_Date = kindergarden_Date;
		Kindergarden_Email = kindergarden_Email;
		this.l_Appointment = l_Appointment;
		this.l_Club = l_Club;
		this.l_Event = l_Event;
		this.l_child = l_child;
		this.l_Activity = l_Activity;
		this.l_Meeting = l_Meeting;
		Staff = staff;
	}
	public Kindergarden() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
}

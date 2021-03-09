package tn.esprit.spring.entity;

import java.io.Serializable;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
@Entity 
@Table(name="T_Appointment")
public class Appointment implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Appointment_ID")
	private Long Appoinment_Id ; 
	private Date  Appoinment_Date ; 
	private String  Appoinment_Subject ; 
	
	@Enumerated(EnumType.STRING ) 
	private Place_Appoinment  place_appoinment ; 
	private Type_Appoinment   type_appoinment ;
	public Long getAppoinment_Id() {
		return Appoinment_Id;
	}
	public void setAppoinment_Id(Long appoinment_Id) {
		Appoinment_Id = appoinment_Id;
	}
	public Date getAppoinment_Date() {
		return Appoinment_Date;
	}
	public void setAppoinment_Date(Date appoinment_Date) {
		Appoinment_Date = appoinment_Date;
	}
	public String getAppoinment_Subject() {
		return Appoinment_Subject;
	}
	public void setAppoinment_Subject(String appoinment_Subject) {
		Appoinment_Subject = appoinment_Subject;
	}
	public Place_Appoinment getPlace_appoinment() {
		return place_appoinment;
	}
	public void setPlace_appoinment(Place_Appoinment place_appoinment) {
		this.place_appoinment = place_appoinment;
	}
	public Type_Appoinment getType_appoinment() {
		return type_appoinment;
	}
	public void setType_appoinment(Type_Appoinment type_appoinment) {
		this.type_appoinment = type_appoinment;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Appoinment_Date == null) ? 0 : Appoinment_Date.hashCode());
		result = prime * result + ((Appoinment_Id == null) ? 0 : Appoinment_Id.hashCode());
		result = prime * result + ((Appoinment_Subject == null) ? 0 : Appoinment_Subject.hashCode());
		result = prime * result + ((place_appoinment == null) ? 0 : place_appoinment.hashCode());
		result = prime * result + ((type_appoinment == null) ? 0 : type_appoinment.hashCode());
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
		Appointment other = (Appointment) obj;
		if (Appoinment_Date == null) {
			if (other.Appoinment_Date != null)
				return false;
		} else if (!Appoinment_Date.equals(other.Appoinment_Date))
			return false;
		if (Appoinment_Id == null) {
			if (other.Appoinment_Id != null)
				return false;
		} else if (!Appoinment_Id.equals(other.Appoinment_Id))
			return false;
		if (Appoinment_Subject == null) {
			if (other.Appoinment_Subject != null)
				return false;
		} else if (!Appoinment_Subject.equals(other.Appoinment_Subject))
			return false;
		if (place_appoinment != other.place_appoinment)
			return false;
		if (type_appoinment != other.type_appoinment)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Appointment [Appoinment_Id=" + Appoinment_Id + ", Appoinment_Date=" + Appoinment_Date
				+ ", Appoinment_Subject=" + Appoinment_Subject + ", place_appoinment=" + place_appoinment
				+ ", type_appoinment=" + type_appoinment + "]";
	}
	public Appointment(Long appoinment_Id, Date appoinment_Date, String appoinment_Subject,
			Place_Appoinment place_appoinment, Type_Appoinment type_appoinment) {
		super();
		Appoinment_Id = appoinment_Id;
		Appoinment_Date = appoinment_Date;
		Appoinment_Subject = appoinment_Subject;
		this.place_appoinment = place_appoinment;
		this.type_appoinment = type_appoinment;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	} 

	

}

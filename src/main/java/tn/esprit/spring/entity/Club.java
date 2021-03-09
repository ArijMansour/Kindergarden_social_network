package tn.esprit.spring.entity;

import java.io.Serializable;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
@Entity 
@Table(name="T_Club")
public class Club implements Serializable   {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Club_ID")
	
	private Long Club_Id ; 
	private String Club_Description ; 
	@Enumerated(EnumType.STRING ) 
	private Type_Club type_club ;
	public Long getClub_Id() {
		return Club_Id;
	}
	public void setClub_Id(Long club_Id) {
		Club_Id = club_Id;
	}
	public String getClub_Description() {
		return Club_Description;
	}
	public void setClub_Description(String club_Description) {
		Club_Description = club_Description;
	}
	public Type_Club getType_club() {
		return type_club;
	}
	public void setType_club(Type_Club type_club) {
		this.type_club = type_club;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Club_Description == null) ? 0 : Club_Description.hashCode());
		result = prime * result + ((Club_Id == null) ? 0 : Club_Id.hashCode());
		result = prime * result + ((type_club == null) ? 0 : type_club.hashCode());
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
		Club other = (Club) obj;
		if (Club_Description == null) {
			if (other.Club_Description != null)
				return false;
		} else if (!Club_Description.equals(other.Club_Description))
			return false;
		if (Club_Id == null) {
			if (other.Club_Id != null)
				return false;
		} else if (!Club_Id.equals(other.Club_Id))
			return false;
		if (type_club != other.type_club)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Club [Club_Id=" + Club_Id + ", Club_Description=" + Club_Description + ", type_club=" + type_club + "]";
	}
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	} 

	

}

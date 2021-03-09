package tn.esprit.spring.entity;

import java.io.Serializable;

import java.util.* ;
import tn.esprit.spring.entity.Subject_note;
import tn.esprit.spring.entity.Type_Notes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="T_Notes")
public class Notes implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Notes_ID")
	private Long Note_Id ;
	private Date Note_Creation_Date ;
	private String Note_Description ; 
	
	 @Enumerated(EnumType.STRING ) 
	 private Subject_note subject_note ;
	 @Enumerated(EnumType.STRING ) 
	 private Type_Notes type_note ;
	public Long getNote_Id() {
		return Note_Id;
	}
	public void setNote_Id(Long note_Id) {
		Note_Id = note_Id;
	}
	public Date getNote_Creation_Date() {
		return Note_Creation_Date;
	}
	public void setNote_Creation_Date(Date note_Creation_Date) {
		Note_Creation_Date = note_Creation_Date;
	}
	public String getNote_Description() {
		return Note_Description;
	}
	public void setNote_Description(String note_Description) {
		Note_Description = note_Description;
	}
	public Subject_note getSubject_note() {
		return subject_note;
	}
	public void setSubject_note(Subject_note subject_note) {
		this.subject_note = subject_note;
	}
	public Type_Notes getType_note() {
		return type_note;
	}
	public void setType_note(Type_Notes type_note) {
		this.type_note = type_note;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Note_Creation_Date == null) ? 0 : Note_Creation_Date.hashCode());
		result = prime * result + ((Note_Description == null) ? 0 : Note_Description.hashCode());
		result = prime * result + ((Note_Id == null) ? 0 : Note_Id.hashCode());
		result = prime * result + ((subject_note == null) ? 0 : subject_note.hashCode());
		result = prime * result + ((type_note == null) ? 0 : type_note.hashCode());
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
		Notes other = (Notes) obj;
		if (Note_Creation_Date == null) {
			if (other.Note_Creation_Date != null)
				return false;
		} else if (!Note_Creation_Date.equals(other.Note_Creation_Date))
			return false;
		if (Note_Description == null) {
			if (other.Note_Description != null)
				return false;
		} else if (!Note_Description.equals(other.Note_Description))
			return false;
		if (Note_Id == null) {
			if (other.Note_Id != null)
				return false;
		} else if (!Note_Id.equals(other.Note_Id))
			return false;
		if (subject_note != other.subject_note)
			return false;
		if (type_note != other.type_note)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Notes [Note_Id=" + Note_Id + ", Note_Creation_Date=" + Note_Creation_Date + ", Note_Description="
				+ Note_Description + ", subject_note=" + subject_note + ", type_note=" + type_note + "]";
	}
	public Notes(Long note_Id, Date note_Creation_Date, String note_Description, Subject_note subject_note,
			Type_Notes type_note) {
		super();
		Note_Id = note_Id;
		Note_Creation_Date = note_Creation_Date;
		Note_Description = note_Description;
		this.subject_note = subject_note;
		this.type_note = type_note;
	}
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	} 
	 
	

}

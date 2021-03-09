package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.* ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
@Entity 
@Table(name="T_Event")
public class Event implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Event_ID")
	private Long Event_Id ;
	private Date Event_Date_Begin ; 
	private Date Event_Date_Finish ; 
	private String Event_Description ;
	
	@Enumerated(EnumType.STRING ) 
	private Place_Event place_event ; 
	private Type_Event  type_event ;
	public Long getEvent_Id() {
		return Event_Id;
	}
	public void setEvent_Id(Long event_Id) {
		Event_Id = event_Id;
	}
	public Date getEvent_Date_Begin() {
		return Event_Date_Begin;
	}
	public void setEvent_Date_Begin(Date event_Date_Begin) {
		Event_Date_Begin = event_Date_Begin;
	}
	public Date getEvent_Date_Finish() {
		return Event_Date_Finish;
	}
	public void setEvent_Date_Finish(Date event_Date_Finish) {
		Event_Date_Finish = event_Date_Finish;
	}
	public String getEvent_Description() {
		return Event_Description;
	}
	public void setEvent_Description(String event_Description) {
		Event_Description = event_Description;
	}
	public Place_Event getPlace_event() {
		return place_event;
	}
	public void setPlace_event(Place_Event place_event) {
		this.place_event = place_event;
	}
	public Type_Event getType_event() {
		return type_event;
	}
	public void setType_event(Type_Event type_event) {
		this.type_event = type_event;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Event_Date_Begin == null) ? 0 : Event_Date_Begin.hashCode());
		result = prime * result + ((Event_Date_Finish == null) ? 0 : Event_Date_Finish.hashCode());
		result = prime * result + ((Event_Description == null) ? 0 : Event_Description.hashCode());
		result = prime * result + ((Event_Id == null) ? 0 : Event_Id.hashCode());
		result = prime * result + ((place_event == null) ? 0 : place_event.hashCode());
		result = prime * result + ((type_event == null) ? 0 : type_event.hashCode());
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
		Event other = (Event) obj;
		if (Event_Date_Begin == null) {
			if (other.Event_Date_Begin != null)
				return false;
		} else if (!Event_Date_Begin.equals(other.Event_Date_Begin))
			return false;
		if (Event_Date_Finish == null) {
			if (other.Event_Date_Finish != null)
				return false;
		} else if (!Event_Date_Finish.equals(other.Event_Date_Finish))
			return false;
		if (Event_Description == null) {
			if (other.Event_Description != null)
				return false;
		} else if (!Event_Description.equals(other.Event_Description))
			return false;
		if (Event_Id == null) {
			if (other.Event_Id != null)
				return false;
		} else if (!Event_Id.equals(other.Event_Id))
			return false;
		if (place_event != other.place_event)
			return false;
		if (type_event != other.type_event)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Event [Event_Id=" + Event_Id + ", Event_Date_Begin=" + Event_Date_Begin + ", Event_Date_Finish="
				+ Event_Date_Finish + ", Event_Description=" + Event_Description + ", place_event=" + place_event
				+ ", type_event=" + type_event + "]";
	}
	public Event(Long event_Id, Date event_Date_Begin, Date event_Date_Finish, String event_Description,
			Place_Event place_event, Type_Event type_event) {
		super();
		Event_Id = event_Id;
		Event_Date_Begin = event_Date_Begin;
		Event_Date_Finish = event_Date_Finish;
		Event_Description = event_Description;
		this.place_event = place_event;
		this.type_event = type_event;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	} 

	
	
	
}

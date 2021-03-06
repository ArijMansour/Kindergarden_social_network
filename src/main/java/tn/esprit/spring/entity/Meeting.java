package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.* ; 

import javax.persistence.Entity;

@Entity

public class Meeting implements Serializable {

private static final long serialVersionUID = 1L;

private Long Meeting_ID ; 
private String Meeting_Topic ;
private Long Meeting_Duration ; 
private String Meeting_Location ; 
private String Meeting_Details ;
private Date Meeting_Date ;

public Long getMeeting_ID() {
	return Meeting_ID;
}
public void setMeeting_ID(Long meeting_ID) {
	Meeting_ID = meeting_ID;
}
public String getMeeting_Topic() {
	return Meeting_Topic;
}
public void setMeeting_Topic(String meeting_Topic) {
	Meeting_Topic = meeting_Topic;
}
public Long getMeeting_Duration() {
	return Meeting_Duration;
}
public void setMeeting_Duration(Long meeting_Duration) {
	Meeting_Duration = meeting_Duration;
}
public String getMeeting_Location() {
	return Meeting_Location;
}
public void setMeeting_Location(String meeting_Location) {
	Meeting_Location = meeting_Location;
}
public String getMeeting_Details() {
	return Meeting_Details;
}
public void setMeeting_Details(String meeting_Details) {
	Meeting_Details = meeting_Details;
}
public Date getMeeting_Date() {
	return Meeting_Date;
}
public void setMeeting_Date(Date meeting_Date) {
	Meeting_Date = meeting_Date;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public Meeting() {
	super();
	// TODO Auto-generated constructor stub
}
public Meeting(Long meeting_ID, String meeting_Topic, Long meeting_Duration, String meeting_Location,
		String meeting_Details, Date meeting_Date) {
	super();
	Meeting_ID = meeting_ID;
	Meeting_Topic = meeting_Topic;
	Meeting_Duration = meeting_Duration;
	Meeting_Location = meeting_Location;
	Meeting_Details = meeting_Details;
	Meeting_Date = meeting_Date;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Meeting_Date == null) ? 0 : Meeting_Date.hashCode());
	result = prime * result + ((Meeting_Details == null) ? 0 : Meeting_Details.hashCode());
	result = prime * result + ((Meeting_Duration == null) ? 0 : Meeting_Duration.hashCode());
	result = prime * result + ((Meeting_ID == null) ? 0 : Meeting_ID.hashCode());
	result = prime * result + ((Meeting_Location == null) ? 0 : Meeting_Location.hashCode());
	result = prime * result + ((Meeting_Topic == null) ? 0 : Meeting_Topic.hashCode());
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
	Meeting other = (Meeting) obj;
	if (Meeting_Date == null) {
		if (other.Meeting_Date != null)
			return false;
	} else if (!Meeting_Date.equals(other.Meeting_Date))
		return false;
	if (Meeting_Details == null) {
		if (other.Meeting_Details != null)
			return false;
	} else if (!Meeting_Details.equals(other.Meeting_Details))
		return false;
	if (Meeting_Duration == null) {
		if (other.Meeting_Duration != null)
			return false;
	} else if (!Meeting_Duration.equals(other.Meeting_Duration))
		return false;
	if (Meeting_ID == null) {
		if (other.Meeting_ID != null)
			return false;
	} else if (!Meeting_ID.equals(other.Meeting_ID))
		return false;
	if (Meeting_Location == null) {
		if (other.Meeting_Location != null)
			return false;
	} else if (!Meeting_Location.equals(other.Meeting_Location))
		return false;
	if (Meeting_Topic == null) {
		if (other.Meeting_Topic != null)
			return false;
	} else if (!Meeting_Topic.equals(other.Meeting_Topic))
		return false;
	return true;
}
@Override
public String toString() {
	return "Meeting [Meeting_ID=" + Meeting_ID + ", Meeting_Topic=" + Meeting_Topic + ", Meeting_Duration="
			+ Meeting_Duration + ", Meeting_Location=" + Meeting_Location + ", Meeting_Details=" + Meeting_Details
			+ ", Meeting_Date=" + Meeting_Date + "]";
} 






}

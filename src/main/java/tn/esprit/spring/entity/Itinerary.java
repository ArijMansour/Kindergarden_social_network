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
@Table(name="T_Itinarary")
public class Itinerary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Itinarary_ID")
	
	private Long Itinarary_Id ; 
	private String Itinarary_Bus_Ref ; 
	private int Itinarary_Place_Number ;
    @Enumerated(EnumType.STRING ) 
    private From from ; 
    private To to ;
	public Long getItinarary_Id() {
		return Itinarary_Id;
	}
	public void setItinarary_Id(Long itinarary_Id) {
		Itinarary_Id = itinarary_Id;
	}
	public String getItinarary_Bus_Ref() {
		return Itinarary_Bus_Ref;
	}
	public void setItinarary_Bus_Ref(String itinarary_Bus_Ref) {
		Itinarary_Bus_Ref = itinarary_Bus_Ref;
	}
	public int getItinarary_Place_Number() {
		return Itinarary_Place_Number;
	}
	public void setItinarary_Place_Number(int itinarary_Place_Number) {
		Itinarary_Place_Number = itinarary_Place_Number;
	}
	public From getFrom() {
		return from;
	}
	public void setFrom(From from) {
		this.from = from;
	}
	public To getTo() {
		return to;
	}
	public void setTo(To to) {
		this.to = to;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Itinarary_Bus_Ref == null) ? 0 : Itinarary_Bus_Ref.hashCode());
		result = prime * result + ((Itinarary_Id == null) ? 0 : Itinarary_Id.hashCode());
		result = prime * result + Itinarary_Place_Number;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
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
		Itinerary other = (Itinerary) obj;
		if (Itinarary_Bus_Ref == null) {
			if (other.Itinarary_Bus_Ref != null)
				return false;
		} else if (!Itinarary_Bus_Ref.equals(other.Itinarary_Bus_Ref))
			return false;
		if (Itinarary_Id == null) {
			if (other.Itinarary_Id != null)
				return false;
		} else if (!Itinarary_Id.equals(other.Itinarary_Id))
			return false;
		if (Itinarary_Place_Number != other.Itinarary_Place_Number)
			return false;
		if (from != other.from)
			return false;
		if (to != other.to)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Itinerary [Itinarary_Id=" + Itinarary_Id + ", Itinarary_Bus_Ref=" + Itinarary_Bus_Ref
				+ ", Itinarary_Place_Number=" + Itinarary_Place_Number + ", from=" + from + ", to=" + to + "]";
	}
	public Itinerary(Long itinarary_Id, String itinarary_Bus_Ref, int itinarary_Place_Number, From from, To to) {
		super();
		Itinarary_Id = itinarary_Id;
		Itinarary_Bus_Ref = itinarary_Bus_Ref;
		Itinarary_Place_Number = itinarary_Place_Number;
		this.from = from;
		this.to = to;
	}
	public Itinerary() {
		super();
		// TODO Auto-generated constructor stub
	} 
    
	
}

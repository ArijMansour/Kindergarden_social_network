package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.* ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Meeting")
public class Meeting implements Serializable {

private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Meeting_ID")

private Long Meeting_Id ; 
private String Meeting_Topic ;
private Long Meeting_Duration ; 
private String Meeting_Location ; 
private String Meeting_Details ;
private Date Meeting_Date ;


} 








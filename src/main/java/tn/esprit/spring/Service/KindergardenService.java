package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entity.Kindergarden;;

public interface KindergardenService {
	
	List<Kindergarden> retrieveAllkindergarden();
	Kindergarden addkindergarden(Kindergarden kinder);
	void deletekindergarden(String Kindergarden_ID);
	Kindergarden updatekindergarden(Kindergarden kinder);
	Kindergarden retrievekindergarden(String Kindergarden_ID);
	

}
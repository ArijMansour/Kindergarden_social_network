package tn.esprit.spring.Service;
import java.util.List;

import tn.esprit.spring.entity.Parent; 
public interface ParentService {

	List<Parent> retrieveAllparent();
	Parent addParent(Parent P);
	void deleteParent(String Id);
	Parent retrieveparent(String Id);
	Parent updateparent(Parent P);
	
}

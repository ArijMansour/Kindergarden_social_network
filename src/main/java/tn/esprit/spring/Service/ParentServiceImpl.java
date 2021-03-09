package tn.esprit.spring.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.*;
import tn.esprit.spring.repository.ParentRepository;

public abstract class ParentServiceImpl implements ParentService {
	@Autowired
	ParentRepository parentRepository;
	
	@Override 
	public List <Parent> retrieveAllparent() {
		List <Parent> Parent = (List<Parent>) parentRepository.findAll();
		return Parent;
	}
	
	@Override
	public Parent addParent(Parent P) {
		return parentRepository.save(P);
	}
	
	
	@Override
	public void deleteParent(String Id) {
		parentRepository.deleteById(Long.parseLong(Id));
		
	}
	@Override
	public Parent retrieveparent(String Id) {
		return parentRepository.findById(Long.parseLong(Id)).get(); 
	}
	
	@Override
	public Parent updateparent(Parent P) {
		return parentRepository.save(P);
	}
	
}


package tn.esprit.spring.Service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Child;
import tn.esprit.spring.repository.ChildRepository;

@Service
public class ChildServiceImpl implements ChildService {
	
	@Autowired
	ChildRepository childRepository;
	
	private static final Logger L =LogManager.getLogger(ChildServiceImpl.class);

	@Override
	public List<Child> retrieveAllChild(){
     List<Child> childs =(List<Child>)childRepository.findAll();
     for(Child child : childs){
    	 L.info("child+++:"+ child);}
     return childs;}	
	@Override
	public Child addChild(Child child){
		return childRepository.save(child);
	}
	@Override
	public Child updateChild(Child child){
		return childRepository.save(child);
		
	}
	@Override
	public void deletechild(String child_Id){
		childRepository.deleteById(Long.parseLong(child_Id));
	}
    @Override
    public Child retrievechild(String child_Id ){
    	return childRepository.findById(Long.parseLong(child_Id)).get();
    }




}
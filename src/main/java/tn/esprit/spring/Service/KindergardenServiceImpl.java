package tn.esprit.spring.Service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.repository.KindergardenRepository;


@Service
public class KindergardenServiceImpl implements KindergardenService {


	@Autowired
	KindergardenRepository kindergardenRepository ;

	private static final Logger L = LogManager.getLogger(KindergardenServiceImpl.class);
		   
	@Override
	public List<Kindergarden> retrieveAllkindergarden(){
		List<Kindergarden> kindergardens =(List<Kindergarden>)kindergardenRepository.findAll();
		for (Kindergarden kindergarden : kindergardens){
			L.info("kindergarden +++:"+ kindergarden);}
		return kindergardens;}
	
	@Override
	public Kindergarden addkindergarden (Kindergarden kinder){
		return kindergardenRepository.save(kinder);}
	
	@Override
	public void deletekindergarden(String Kindergarden_ID){
		kindergardenRepository.deleteById(Long.parseLong(Kindergarden_ID));
	}
	
	@Override
	public 	Kindergarden updatekindergarden(Kindergarden kinder){
		return kindergardenRepository.save(kinder);
	}

	@Override
	public 	Kindergarden retrievekindergarden(String Kindergarden_ID){
		return kindergardenRepository.findById(Long.parseLong(Kindergarden_ID)).get();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
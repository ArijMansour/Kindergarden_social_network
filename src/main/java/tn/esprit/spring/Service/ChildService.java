package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entity.Child;

public interface ChildService {
	List<Child> retrieveAllChild();
	Child addChild(Child child);
	void deletechild(String child_Id);
	Child updateChild(Child child);

	Child retrievechild(String child_Id );

}
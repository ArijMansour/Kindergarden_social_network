package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Child;

public interface ChildRepository  extends CrudRepository<Child,Long>{

}
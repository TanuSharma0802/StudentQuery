package com.example.demo.DB;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class service {

	@Autowired
	repository entityRepository;
	
	public List<entity> getAllStudent(){
		List<entity> list=new ArrayList<entity>();
		entityRepository.findAll().forEach(entity -> list.add(entity));
		return list;
			
	}
	
	public entity save(entity e) {
		return entityRepository.save(e);
	}
	
	public void update(entity e,int roll) {
		entityRepository.save(e);

	}
	
	public void delete(int roll) {
		entityRepository.deleteById(roll);
	}

	}




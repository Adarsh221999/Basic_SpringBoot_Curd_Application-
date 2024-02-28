package com.admin.SpringbootCurd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.SpringbootCurd.Entity.Subject;
import com.admin.SpringbootCurd.dao.SubjectsRepo;

@Service
public class Subjectservice {
	
	@Autowired
   public SubjectsRepo subjectrepo;
	   
	public List<Subject>getallsubjects(){
		List<Subject> allSub = subjectrepo.findAll();
		return allSub;
	}

	public void addsub(Subject sub) {
		subjectrepo.save(sub);
		
	}

	public void updatesub(String id ,Subject sub) {
		subjectrepo.save(sub);
		
	}

	public void deletesub(String id) {
		
		subjectrepo.deleteById(id);
	}
	
	
}

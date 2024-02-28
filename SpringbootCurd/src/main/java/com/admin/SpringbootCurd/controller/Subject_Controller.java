package com.admin.SpringbootCurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.SpringbootCurd.Entity.Subject;
import com.admin.SpringbootCurd.service.Subjectservice;

@RestController
@ComponentScan({ "com.admin.SpringbootCurd.*" })
public class Subject_Controller {
	@Autowired
	public Subjectservice service;
     @RequestMapping("/allSubjects") 
	public List<Subject>getallsubjects(){
    	
		return service.getallsubjects();
			
	}
     
     @RequestMapping(method=RequestMethod.POST ,value="/addsub")
     public void addSub(@RequestBody  Subject sub) {
    	 service.addsub(sub);
     }
	
	
     @RequestMapping(method=RequestMethod.PUT ,value="/updatesub/{id}")
     public void updateSub(@PathVariable String id,@RequestBody  Subject sub) {
    	 service.updatesub(id, sub);
     }
	
     @RequestMapping(method=RequestMethod.DELETE ,value="/deletesub/{id}")
     public void deleteSub(@PathVariable String id) {
    	 service.deletesub(id);
     }
}

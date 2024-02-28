package com.admin.SpringbootCurd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.SpringbootCurd.Entity.Subject;
@Repository
public interface SubjectsRepo extends JpaRepository<Subject,String>{
	

}

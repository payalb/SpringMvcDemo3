package com.java.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.dto.Student;

@Repository
public class StudentRepository {
	
	Map<Integer, Student> map= new HashMap<>();
	public void addStudent(Student st) {
		map.put(st.getId(), st);
	}

	public Collection<Student> getStudents(){
		return map.values();
	}
}

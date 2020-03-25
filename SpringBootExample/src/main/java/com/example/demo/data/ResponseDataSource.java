package com.example.demo.data;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Student;

public class ResponseDataSource {
	
	public static List<Student> getStudentData(){
		List<Student> studentList = new ArrayList<>();
		Student s = null;
		for(int i=0;i<5;i++) {
			s = new Student();
			s.setFirstName("firstName"+i);
			s.setLastName("lastName"+i);
			s.setCity("city"+i);
			s.setState("state"+i);
			s.setStudentId(100+i);
			s.setHasLaptop(true);
			studentList.add(s);
		}
		
		return studentList;
		
		
	}

}

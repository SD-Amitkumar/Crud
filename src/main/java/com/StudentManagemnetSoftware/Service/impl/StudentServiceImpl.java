package com.StudentManagemnetSoftware.Service.impl;

import java.security.PublicKey;
import java.util.List;
import org.springframework.stereotype.Service;

import com.StudentManagemnetSoftware.Model.Student;
import com.StudentManagemnetSoftware.Repository.StudentRepository;
import com.StudentManagemnetSoftware.Service.StudentService;
@Service
public class StudentServiceImpl  implements StudentService{
private StudentRepository studentRepository;


	public StudentServiceImpl(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
}


	@Override
	public List<Student> getallStudents() {
	return	 studentRepository.findAll();
	
	}





	@Override
	public Student savestudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	

	@Override
	public Student updatestudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public Student studentgetbtid(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public void delete(int id) {
		studentRepository.deleteById(id);
		
	}


		
	
	}


	


	


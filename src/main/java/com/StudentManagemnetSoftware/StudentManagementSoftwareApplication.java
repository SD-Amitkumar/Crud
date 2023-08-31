package com.StudentManagemnetSoftware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.StudentManagemnetSoftware.Model.Student;
import com.StudentManagemnetSoftware.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSoftwareApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSoftwareApplication.class, args);
	}
@Autowired
private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		//Student s1 = new Student("amit", "kumar",  "amit@gmail.com");
	//	studentRepository.save(s1);
		//Student s3 = new Student("whehe", "kumar",  "wwsit@gmail.com");
		//Student s3 = new Student("Arunima", "chanda",  "arunima@gmail.com");
		//studentRepository.save(s3);
		 
		


}
}

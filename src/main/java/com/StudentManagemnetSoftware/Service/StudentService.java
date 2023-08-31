package com.StudentManagemnetSoftware.Service;

import java.util.List;
import com.StudentManagemnetSoftware.Model.Student;

public interface StudentService {
	
	 List<Student> getallStudents();
	 Student savestudent(Student student);
	Student studentgetbtid(int id);
	Student updatestudent(Student student);
     void delete(int id);
}

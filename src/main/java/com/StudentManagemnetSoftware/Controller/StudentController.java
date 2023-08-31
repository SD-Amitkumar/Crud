package com.StudentManagemnetSoftware.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.StudentManagemnetSoftware.Model.Student;
import com.StudentManagemnetSoftware.Service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list students and return model and view
	@GetMapping("/get")
	public String listStudents(Model model) {
		System.out.println("controoler is excuted");
		
	model.addAttribute("students", studentService.getallStudents());
		
		return "students";
	}
	@GetMapping("/students/new")
	public String createstudentform( Model model) {
		Student student= new Student();
		model.addAttribute("student", student);
		
		return "form";
	}
	@PostMapping("/student")
	public String saveStudent( @ModelAttribute("student") Student student) {
	studentService.savestudent(student);
		
		return "redirect:/get";
		}
	@GetMapping("/update/{id}")
	public String updatestudent(@PathVariable int id, Model model ) {
		
		model.addAttribute("student", studentService.studentgetbtid(id));
		return "update";
	}
	@PostMapping("/update/{id}")
	public String updateid(@PathVariable int id, @ModelAttribute("student") Student student) {
		
		Student existingStudent= studentService.studentgetbtid(id);
		 existingStudent.setFirstName(student.getFirstName());
		 existingStudent.setLastName(student.getLastName());
		 existingStudent.setEmail(student.getEmail());
		 existingStudent.setId(student.getId());
		 studentService.updatestudent(existingStudent);
		 return "redirect:/get";
		
		}
	@GetMapping("/delete/{id}")
	public String deltestudent(@PathVariable int id, Student student) {
		studentService.delete(id);
		
		return "redirect:/get";
	}@GetMapping("/view")
	public String viewstudentsheet() {
		
		
		return  "redirect:/get";
	
	
}
}
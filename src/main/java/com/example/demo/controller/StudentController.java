package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
@Autowired
private StudentService studentService;
// hangler method to handle list students and return mode and view
@GetMapping("/students")
	public String  Liststudents(Model model){
		model.addAttribute("students",studentService.getAllStudents());
		return "students";	
		}
@GetMapping("/students/new")
public String createStudentForm(Model model) {
	Student student=new Student();
	model.addAttribute("student",new Student());
	return "create_student";
}
@PostMapping("/students")
public   String saveStudent(@ModelAttribute("student") Student student) {
	 studentService.saveStudent(student);
	 return "redirect:/students";
	
}
@GetMapping("/students/edit/{id}")
public String editStudentform(@PathVariable Long id, Model model) {
model.addAttribute("student",studentService.getstudentById(id));
return "edit_student";	
}
@PostMapping("/students/{id}")
public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student,Model model){

	
	//getting data from Database
	Student existingstudent=studentService.getstudentById(id);
	
	existingstudent.setFirstname(student.getFirstname());
    existingstudent.setLastname(student.getLastname());
    existingstudent.setEmail(student.getEmail());

// save updated student records
   studentService.updateStudent(existingstudent);
   return "redirect:/students";

}
//handler method for delete

@GetMapping("/students/{id}")
public String deleteStudent(@PathVariable Long id) {
	 studentService.deleteStudentById(id);
	 return "redirect:/students";
}
}
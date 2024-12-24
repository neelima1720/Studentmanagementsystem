package com.example.demo.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;



@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> getAllStudents() {
		
           return studentRepository.findAll();
	}
	@Override
	public  Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	@Override
	public Student getstudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	}
	
	
}

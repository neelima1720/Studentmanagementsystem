package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}
@Autowired
	private StudentRepository studentRepository;
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	/*Student student1=new Student("vanith","kumpatla","vani@123.com");
	 studentrepository.save(student1);
	 Student student2=new Student("Neelima","yenumula","Neelima@123.com");
	 studentrepository.save(student2);
	 Student student3=new Student("sumi","yenumula","suma@123.com");
	 studentrepository.save(student3);
	*/
}
}

package com.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prog.entity.Student;
import com.prog.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student1=new Student("Naval","Chauhan","naval@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("tony", "stark", "tony@gmail.com");
		studentRepository.save(student3);
	}

}
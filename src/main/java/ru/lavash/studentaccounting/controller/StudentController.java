package ru.lavash.studentaccounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.lavash.studentaccounting.model.Student;
import ru.lavash.studentaccounting.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		service.saveStudent(student);
		return "New student is added";
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
}

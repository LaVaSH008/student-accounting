package ru.lavash.studentaccounting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.lavash.studentaccounting.model.Student;
import ru.lavash.studentaccounting.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepo repo;
	
	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}
}

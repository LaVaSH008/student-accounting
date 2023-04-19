package ru.lavash.studentaccounting.service;

import java.util.List;

import ru.lavash.studentaccounting.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}

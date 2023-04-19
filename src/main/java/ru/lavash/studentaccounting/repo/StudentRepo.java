package ru.lavash.studentaccounting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.lavash.studentaccounting.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}

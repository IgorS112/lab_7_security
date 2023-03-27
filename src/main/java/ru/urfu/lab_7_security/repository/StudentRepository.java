package ru.urfu.lab_7_security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.urfu.lab_7_security.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

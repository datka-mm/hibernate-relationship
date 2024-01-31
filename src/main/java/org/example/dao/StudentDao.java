package org.example.dao;

import org.example.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

    String saveStudent(Student student);

    String saveStudentToCourse(Long courseId, Student student);

    Optional<Student> findStudentById(Long studentId);

    boolean updateStudentById(Long id, Student student);

    void deleteStudentById(Long id);

    List<Student> findAllStudent();

    List<Student> findAllByCourseId(Long courseId);

    String assignStudentToCourse(Long courseId, Long studentId);
}
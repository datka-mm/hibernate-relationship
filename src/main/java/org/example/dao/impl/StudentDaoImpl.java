package org.example.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.config.HibernateConfig;
import org.example.dao.StudentDao;
import org.example.entity.Course;
import org.example.entity.Student;

import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {

    EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManager();

    @Override
    public String saveStudent(Student student) {
        return null;
    }

    @Override
    public String saveStudentToCourse(Long courseId, Student student) {
        return null;
    }

    @Override
    public Optional<Student> findStudentById(Long studentId) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAllStudent() {
        return null;
    }

    @Override
    public List<Student> findAllByCourseId(Long courseId) {
        return null;
    }

    @Override
    public String assignStudentToCourse(Long courseId, Long studentId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        Student student = entityManager
                .createQuery("select s from Student s where s.id = :studentId", Student.class)
                .setParameter("studentId", studentId)
                .getSingleResult();

        course.getStudents().add(student);
        student.getCourses().add(course);
        entityManager.merge(course);
        entityManager.merge(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "success";
    }

    @Override
    public boolean updateStudentById(Long id, Student student) {
        return false;
    }

    @Override
    public void deleteStudentById(Long id) {

    }
}

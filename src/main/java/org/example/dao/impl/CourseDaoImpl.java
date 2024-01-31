package org.example.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.config.HibernateConfig;
import org.example.dao.CourseDao;
import org.example.entity.Course;

import java.util.List;
import java.util.Optional;

public class CourseDaoImpl implements CourseDao, AutoCloseable {

     EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManager();


    @Override
    public String saveCourse(Course course) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(course);
            entityManager.getTransaction().commit();
        return course.getName() + " saved";
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            return e.getMessage();
        }
    }

    @Override
    public Optional<Course> findCourseById(Long id) {
        return Optional.empty();
    }

    @Override
    public String updateCourseById(Long courseId, Course newCourse) {
        return null;
    }

    @Override
    public void deleteCourseById(Long id) {

    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public int getCountOfStudentsByCourseId(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        int count = 0;
        try {
            entityManager.getTransaction().begin();
            count = entityManager
                    .createQuery("select count(s.id) from Student s inner join s.courses course where course.id = :id", Integer.class)
                    .setParameter("id", id).getSingleResult();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        }
        return count;
    }

    @Override
    public void deleteAllStudentsFromCourse(Long courseId) {

    }

    @Override
    public void close() throws Exception {
        entityManagerFactory.close();
    }
}

package org.example.dao;

import org.example.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseDao {

    String saveCourse(Course course);

    Optional<Course> findCourseById(Long id);

    String updateCourseById(Long courseId, Course newCourse);

    void deleteCourseById(Long id);

    List<Course> getAllCourses();

    int getCountOfStudentsByCourseId(Long id);

    void deleteAllStudentsFromCourse(Long courseId);
}

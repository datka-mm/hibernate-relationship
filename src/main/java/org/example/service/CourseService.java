package org.example.service;

import org.example.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    String saveCourse(Course course);

    Course findCourseById(Long id);

    String updateCourseById(Long courseId, Course newCourse);

    void deleteCourseById(Long id);

    List<Course> getAllCourses();

    int getCountOfStudentsByCourseId(Long id);

    void deleteAllStudentsFromCourse(Long courseId);
}

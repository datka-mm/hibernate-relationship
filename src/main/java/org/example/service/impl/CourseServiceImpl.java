package org.example.service.impl;

import org.example.dao.CourseDao;
import org.example.dao.impl.CourseDaoImpl;
import org.example.entity.Course;
import org.example.service.CourseService;

import java.util.List;
import java.util.Optional;

public class CourseServiceImpl implements CourseService {

    CourseDao courseDao = new CourseDaoImpl();

    @Override
    public String saveCourse(Course course) {
        return courseDao.saveCourse(course);
    }

    @Override
    public Course findCourseById(Long id) {
        return null;
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
        return courseDao.getCountOfStudentsByCourseId(id);
    }

    @Override
    public void deleteAllStudentsFromCourse(Long courseId) {

    }
}

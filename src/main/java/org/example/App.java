package org.example;

import org.example.config.HibernateConfig;
import org.example.entity.Course;
import org.example.service.CourseService;
import org.example.service.impl.CourseServiceImpl;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        CourseService courseService = new CourseServiceImpl();
//        System.out.println(courseService.saveCourse(new Course("Java", 14000, LocalDate.of(2023, 10, 1))));
        System.out.println(courseService.getCountOfStudentsByCourseId(1L));
    }
}

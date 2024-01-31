package org.example.dao;

import org.example.entity.Lesson;

import java.util.List;

public interface LessonDao {

    //crud method jazgyla

    List<Lesson> getAllLessonByCourseId(Long courseId);

    // where isPresentation is true
    List<Lesson> getAllLessonWithPresentationByCourseId(Long courseId);

    List<Lesson> getLessonByStudentId(Long studentId);
}

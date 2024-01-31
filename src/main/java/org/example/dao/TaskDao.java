package org.example.dao;

import org.example.entity.Task;

import java.time.LocalDate;
import java.util.List;

public interface TaskDao {

    //crud

    List<Task> getAllByLessonId(Long courseId);

    List<Task> getAllByStudentId(Long studentId);

    List<Task> getAllByCourseId(Long courseId);

    List<Task> getAllByDeadline(LocalDate deadline);

    int countOfTasksFromCourse(Long courseId);
}

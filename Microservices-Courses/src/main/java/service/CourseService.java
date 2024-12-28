package service;

import http.response.StudensByCourseResponse;
import persistence.entities.Courses;

import java.util.List;

public interface CourseService {
    List<Courses> findAll();
    Courses findById(String id);
    Courses save(Courses courses);
    StudensByCourseResponse findStudentByIdCourse(String idCourse);
}

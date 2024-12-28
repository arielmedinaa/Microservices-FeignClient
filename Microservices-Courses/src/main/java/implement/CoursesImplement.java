package implement;

import client.StudentsClient;
import controller.dto.StudentsDTO;
import http.response.StudensByCourseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import persistence.entities.Courses;
import persistence.repository.CoursesRepository;
import service.CourseService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoursesImplement implements CourseService {
    private final CoursesRepository coursesRepository;
    private final StudentsClient studentsClient;

    @Override
    public List<Courses> findAll() {
        return coursesRepository.findAll();
    }

    @Override
    public Courses findById(String id) {
        return coursesRepository.findById(id).orElse(null);
    }

    @Override
    public Courses save(Courses courses) {
        return coursesRepository.save(courses);
    }

    @Override
    public StudensByCourseResponse findStudentByIdCourse(String idCourse) {
        Courses courses = coursesRepository.findById(idCourse).orElse(new Courses());
        List<StudentsDTO> studentsDTOList = studentsClient.findAllStudentsCourses(idCourse);
        return StudensByCourseResponse.builder()
                .courseName(courses.getCourses_name())
                .teacherName(courses.getProfessor_name())
                .students(studentsDTOList)
                .build();
    }
}

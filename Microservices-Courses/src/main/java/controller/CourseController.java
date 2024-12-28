package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import persistence.entities.Courses;
import service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping("/saveCourses")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourses(@RequestBody Courses courses) {
        courseService.save(courses);
    }

    @GetMapping("/getCourses")
    public List<Courses> getAllCourses() {
        return courseService.findAll();
    }

    @GetMapping("/getCoursesId/{id}")
    public Courses getCoursesById(@PathVariable String id) {
        return courseService.findById(id);
    }

    @GetMapping("/getStudentsCourses/{id}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable String id) {
        return ResponseEntity.ok().body(courseService.findStudentByIdCourse(id));
    }
}

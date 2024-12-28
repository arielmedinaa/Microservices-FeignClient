package controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import persistence.entities.Students;
import service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/saveStudents")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudents(@RequestBody Students students) {
        studentService.save(students);
    }

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Students>> getAllStudents() throws BadRequestException {
        try{
            List<Students> students = studentService.findAll();
            return new ResponseEntity<>(students, HttpStatus.OK);
        }catch (Exception e){
            throw new BadRequestException(e.getMessage());
        }
    }

    @GetMapping("/getStudentsId/{id}")
    public ResponseEntity<Students> getStudentsId(@PathVariable Long id) throws BadRequestException {
        try{
            return ResponseEntity.ok().body(studentService.findById(id));
        }catch (Exception e){
            throw new BadRequestException(e.getMessage());
        }
    }

    @GetMapping("getStudentsCourseId/{id}")
    public ResponseEntity<List<Students>> getStudentsCourseId(@PathVariable String id) throws BadRequestException {
        try{
            return ResponseEntity.ok().body(studentService.findByIdCurso(id));
        }catch (Exception e){
            throw new BadRequestException(e.getMessage());
        }
    }
}

package client;

import controller.dto.StudentsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost://localhost:8080/students/")
public interface StudentsClient {

    @GetMapping("getStudentsCourseId/{id}")
    List<StudentsDTO> findAllStudentsCourses(@PathVariable String id);
}

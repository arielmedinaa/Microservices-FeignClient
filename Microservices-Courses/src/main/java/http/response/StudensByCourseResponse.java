package http.response;

import controller.dto.StudentsDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudensByCourseResponse {

    private String courseName;
    private String teacherName;
    private List<StudentsDTO> students;
}

package controller.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class StudentsDTO {
    private String name;
    private String email;
    private String courseId;
}

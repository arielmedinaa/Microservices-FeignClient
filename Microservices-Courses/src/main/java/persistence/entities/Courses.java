package persistence.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@Document("courses")
public class Courses {
    @Id
    private String id;

    @TextIndexed
    private String courses_name;

    private String professor_name;
}

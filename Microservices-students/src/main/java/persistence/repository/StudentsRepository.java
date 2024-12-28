package persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import persistence.entities.Students;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Students, Long> {
    List<Students>findAllByCourseId(String courseId);
}

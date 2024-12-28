package persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import persistence.entities.Courses;

import java.util.List;

@Repository
public interface CoursesRepository extends MongoRepository<Courses, String> {
}

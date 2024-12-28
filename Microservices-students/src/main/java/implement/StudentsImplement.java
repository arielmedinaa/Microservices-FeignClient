package implement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import persistence.entities.Students;
import persistence.repository.StudentsRepository;
import service.StudentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentsImplement implements StudentService {
    private final StudentsRepository studentsRepository;

    @Override
    public List<Students> findAll() {
        return studentsRepository.findAll();
    }

    @Override
    public void save(Students students) {
        studentsRepository.save(students);
    }

    @Override
    public Students findById(Long id) {
        return studentsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Students> findByIdCurso(String idCurso) {
        return studentsRepository.findAllByCourseId(idCurso);
    }
}

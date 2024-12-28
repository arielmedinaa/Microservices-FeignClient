package service;

import persistence.entities.Students;

import java.util.List;

public interface StudentService {
    List<Students> findAll();
    void save(Students students);
    Students findById(Long id);
    List<Students> findByIdCurso(String idCurso);
}

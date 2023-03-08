package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepositoryIml implements StudentRepository{
    private final Logger LOG= LoggerFactory.getLogger(StudentRepositoryIml.class);
private StudentRepository repository;

    @Override
    public StudentEntity create(StudentEntity e) {
        LOG.debug("start methode create");
        StudentEntity result = repository.create(e);
        return result;

    }

    @Override
    public StudentEntity update(StudentEntity e) {
        LOG.debug("start methode update");
        StudentEntity result = repository.create(e);
        return result;

    }

    @Override
    public boolean delete(Long id) {
        LOG.debug("start methode update");
        boolean result = repository.delete(id);
        return result;
    }

    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start methode readAll");
        List<StudentEntity> result = repository.readAll();
        return result;

    }
}

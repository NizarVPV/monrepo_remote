package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository repository;

    private StudentMapper mapper;

    public StudentServiceImpl(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    private final Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    @Override
    public StudentDto create(StudentDto dto) {
        LOG.debug("start methode create");
        StudentDto result = mapper.convertEntitytoDto(repository.create(mapper.convertDtotoEntity(dto)));
        LOG.debug("end method create");
        return result;
    }


    @Override
    public StudentDto update(StudentDto dto) {
        LOG.debug("start methode update");
        StudentDto result = mapper.convertEntitytoDto(repository.update(mapper.convertDtotoEntity(dto)));
        LOG.debug("end method update");
        return result;


    }

    @Override
    public boolean delete(Long id) {
        LOG.debug("start methode delete");
        boolean result = repository.delete(id);
        LOG.debug("end method delete");
        return result;

    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("start methode readAll");
        List<StudentDto> result =mapper.convertEntitiestoDtos(repository.readAll());
        LOG.debug("end method readAll");
        return result;

    }
}

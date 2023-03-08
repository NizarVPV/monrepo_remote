package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentDto convertEntitytoDto(StudentEntity entity){
     StudentDto dto= new StudentDto();
     dto.setId(entity.getId());
     dto.setName(entity.getName());
     return dto;
    }
    public StudentEntity convertDtotoEntity(StudentDto dto){
        StudentEntity entity= new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    public List<StudentEntity>convertDtostoEntities(List<StudentDto>l){
        return l.stream()
                .map(dto ->convertDtotoEntity(dto))
                .collect(Collectors.toList());
    }
    public List<StudentDto>convertEntitiestoDtos(List<StudentEntity>l){
        return l.stream()
                .map(entity->convertEntitytoDto(entity))
                .collect(Collectors.toList());
    }
}

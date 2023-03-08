package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Students")

public class StudentController {
    private final Logger LOG= LoggerFactory.getLogger(StudentController.class);

    private StudentService service;
        StudentController(StudentService service){
            this.service=service;
        }

    @PostMapping("/create")
    public StudentDto create(@RequestBody StudentDto dto){
        LOG.debug("start methode create");
        StudentDto result = service.create(dto);
        LOG.debug("end methode create");
            return result;
        }
    @PutMapping("/update")
    public StudentDto update(@RequestBody StudentDto dto){
            LOG.debug("start methode update");
        StudentDto result = service.update(dto);
        LOG.debug("end methode update");
            return result;}

    @DeleteMapping("/{id}")
    public boolean delete( @PathVariable("id") long id){
            LOG.debug("start methode delete ");
        boolean result = service.delete(id);
        LOG.debug("end methode delete ");
            return service.delete(id);}

    @GetMapping
    public List<StudentDto>readAll(){
        LOG.debug("start methode update");
        List<StudentDto> result = service.readAll();
        LOG.debug("end methode update");
            return result;}
}

package com.student.backend.service;
import com.student.backend.entity.Student;
import com.student.backend.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentrepository;
    public StudentService(StudentRepository studentrepository)
    {
        this.studentrepository=studentrepository;
    }
    public List<Student> getAllStudent()
    {
        return studentrepository.findAll();
    }
}

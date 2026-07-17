package com.student.backend.controller;
import com.student.backend.entity.Student;
import com.student.backend.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController

public class StudentController {
 private final StudentService studentService;
 public StudentController(StudentService studentService)
 {
    this.studentService=studentService;
 }
  
 @GetMapping("/students")
 public List<Student> getStudent()
 {
    return studentService.getAllStudent();
 }
}

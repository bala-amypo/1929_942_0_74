package com.example.demo.serviceimplementation;
import org.springframework.stereotype.service;
import com.example.demo.service.service;

import com.example.demo.service.StudentService;

@service
public class StudentserviceImp implements StudentService{
    @Autowired
    StudentRepository StudentRepository;

    public Stuentity saveStudent(Stuentity student){
        return StudentRepository.save(Student);
    }
}
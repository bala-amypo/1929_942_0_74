package com.example.demo.service;
import org.springframework.stereotype.service;

import com.example.demo.entity.Student;

@service
public interface StudentService{
    Student poststudent(Student s);
}
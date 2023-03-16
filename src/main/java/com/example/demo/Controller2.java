package com.example.demo;

import com.example.demo.DB.entity;
import com.example.demo.DB.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller2 {

    @GetMapping("/home")
    private String home(){
        return "Hello";
    }

    @GetMapping("/")
    private String find() {
        return "Home";
    }

    @Autowired
    service studentService;



    @GetMapping("/students")
    private List<entity> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("/students")
    private entity saveStudent(@RequestBody entity student) {
        studentService.save(student);
        return student;
    }

    @PutMapping("/students/{roll}")
    private entity updateStudent(@RequestBody entity student, @PathVariable int roll) {
        studentService.update(student,roll);
        return student;


    }

    @DeleteMapping("/students/{roll}")
    private void deleteStudent(@PathVariable("roll")  int roll) {
        studentService.delete(roll);
    }
}

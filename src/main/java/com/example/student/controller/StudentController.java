package com.example.student.controller;

import java.util.List;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//mark class as Controller
@RestController
public class StudentController
{
    //auto-wire the StudentService class
    @Autowired
    StudentService studentService;
    //creating a get mapping that retrieves all the students detail from the database
    @GetMapping("/student")
   private List<Student> getAllStudents()
    {
        return studentService.getStudentsById();
    }
    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/student/{id}")
    private List<Student> getStudents(@PathVariable("studentid") int id)
    {

        return studentService.getStudentsById();
    }
    //creating post mapping that post the student detail in the database*/
    @PostMapping("/save")
    private Student saveStudent(@RequestBody Student students)
    {
       return studentService.save(students);
    }

    //creating put mapping that updates the book detail
   @PutMapping("/students")
    private Student update(@RequestBody Student students)
    {
        studentService.save(students);
        return students;
    }

}
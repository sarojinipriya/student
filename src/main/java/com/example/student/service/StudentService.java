package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    //getting all students record by using the method findAll() of CrudRepository
      public List<Student> getAll() {
        return studentRepo.findAll();
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Student getStudentsById(long studentid) {
        return studentRepo.findById(studentid).get();
    }

    //saving a specific record by using the method save() of CrudRepository
    public Student save(Student students) {
        studentRepo.save(students);
        return students;
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(long studentid) {
        studentRepo.deleteById(studentid);
    }

    //updating a record
    public void update(Student students, int studentid) {
        studentRepo.save(students);
    }

    public List<Student> getStudentsById() {
        return null;
    }




    }

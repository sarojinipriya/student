package com.example.student.repo;

import com.example.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>
{
  Student save(Student student);
  //@Query(value = "update  s set s.name = :studentname WHERE s.id = :studentid")
  //void setStudentName(@Param("studentid") Long id, @Param("studentname") String name);


}


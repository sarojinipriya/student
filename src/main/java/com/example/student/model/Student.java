package com.example.student.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity
@Entity
//defining class name as Table name
@Table(name="student")
public class Student
{
    //Defining book id as primary key
    @Id
    @Column
    public long studentid;
    @Column
    private String studentname;
    @Column
    private String author;
    @Column
    private int price;
    public long getStudentid()
    {
        return studentid;
    }
    public void setStudentid(int Studentid)
    {
        this.studentid = studentid;
    }
    public String getStudentname()
    {
        return studentname;
    }
    public void setStudentname(String studentname)
    {
        this.studentname = studentname;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}
package com.example.test02032023.dao;

import com.example.test02032023.model.Student;

import java.util.List;

public interface StudentDao {

    long insert(Student student);
    List<Student> findAll();
    Student findById(long id);
    long update(long id, Student student);
    long deleteById(int id);


}

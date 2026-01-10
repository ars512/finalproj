package com.example.demo.Service;

import com.example.demo.Dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAll();
    StudentDto getById(Long id);
    StudentDto addStudent(StudentDto studentDto);
    StudentDto updateStudent(Long id, StudentDto studentDto);
    boolean deleteStudent(Long id);
}

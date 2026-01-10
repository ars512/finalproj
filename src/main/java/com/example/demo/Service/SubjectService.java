package com.example.demo.Service;

import com.example.demo.Dto.SubjectDto;

import java.util.List;

public interface SubjectService {
    List<SubjectDto> getAll();
    SubjectDto getById(Long id);
    SubjectDto addSubject(SubjectDto subjectDto);
    SubjectDto updateSubject(Long id, SubjectDto subjectDto);
    boolean deleteSubject(Long id);
}

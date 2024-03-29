package com.example.CAU_1_SubjecService.services;

import com.example.CAU_1_SubjecService.models.Subject;
import com.example.CAU_1_SubjecService.repositories.SubjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject addSubject(Subject subject){ return  subjectRepository.save(subject); }
    public Subject getSubjectById(long subId){return subjectRepository.findById(subId).get(); }
    public List<Subject> getListSubject() { return subjectRepository.findAll(); }
}

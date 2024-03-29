package com.example.CAU_1_SubjecService.controllers;

import com.example.CAU_1_SubjecService.models.Subject;
import com.example.CAU_1_SubjecService.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/subjects")
    public Subject addSubject(@RequestBody Subject subject) { return subjectService.addSubject(subject); }
    @GetMapping("/subjects")
    List<Subject> getListSubject(){
        return subjectService.getListSubject();
    }

    @GetMapping("/subjects/{subId}")
    public Subject getSubjectById(@PathVariable Long subId){
        return subjectService.getSubjectById(subId);
    }
}

package com.example.CAU_2_RestTemplateService.controllers;

import com.example.CAU_2_RestTemplateService.Services.RestTemplateService;
import com.example.CAU_2_RestTemplateService.models.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestTemplateController {
    @Autowired
    private RestTemplateService restTemplateService;

    @PostMapping("/send")
    public String sendSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject(5, "Dia ly", "9"));
        subjects.add(new Subject(4, "Sinh hoc", "8"));
        subjects.add(new Subject(6, "Van", "9"));

        restTemplateService.sendSubjects(subjects);
        return "Subjects sent successfully!";
    }

    @GetMapping("/get/{id}")
    public Subject getSubject(@PathVariable Long id) {
        return restTemplateService.getSubjectById(id);
    }
}

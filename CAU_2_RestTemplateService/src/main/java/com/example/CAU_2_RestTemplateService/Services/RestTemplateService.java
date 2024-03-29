package com.example.CAU_2_RestTemplateService.Services;

import com.example.CAU_2_RestTemplateService.models.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RestTemplateService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendSubjects(List<Subject> subjects) {
        String url = "http://localhost:8081/api/subjects";
        ResponseEntity<Void> responseEntity = restTemplate.postForEntity(url, subjects, Void.class);
    }

    public Subject getSubjectById(Long id) {
        String url = "http://localhost:8081/api/subjects/" + id;
        return restTemplate.getForObject(url, Subject.class);
    }
}

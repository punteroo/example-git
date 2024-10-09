package com.example.project.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.management.model.TestEntity;
import com.example.project.management.service.test.ITestService;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ITestService service;

    @GetMapping
    private List<TestEntity> getAllTestEntities() {
        return this.service.getAllTestEntities();
    }

    @GetMapping("/{id}")
    private TestEntity getTestEntityById(Long id) {
        return this.service.getTestEntityById(id);
    }

    @PostMapping
    private TestEntity registerTestEntity(@RequestBody TestEntity testEntity) {
        return this.service.registerTestEntity(testEntity);
    }
}

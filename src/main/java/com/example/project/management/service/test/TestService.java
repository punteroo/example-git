package com.example.project.management.service.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.management.model.TestEntity;
import com.example.project.management.repository.test.ITestRepository;

@Service
public class TestService implements ITestService {

    @Autowired
    private ITestRepository repository;

    @Override
    public List<TestEntity> getAllTestEntities() {
        return this.repository.findAll();
    }

    @Override
    public TestEntity getTestEntityById(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public TestEntity registerTestEntity(TestEntity testEntity) {
        return this.repository.save(testEntity);
    }

}

package com.example.project.management.repository.test;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.management.model.TestEntity;

public interface ITestRepository extends JpaRepository<TestEntity, Long> {}

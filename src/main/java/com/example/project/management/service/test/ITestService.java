package com.example.project.management.service.test;

import java.util.List;
import com.example.project.management.model.TestEntity;

public interface ITestService {
    /**
     * Obtains a list of all registered test entities.
     *
     * @return A list of all registered test entities.
     */
    List<TestEntity> getAllTestEntities();

    /**
     * Obtains a test entity by its identifier.
     *
     * @param id The identifier of the test entity.
     * @return The test entity with the specified identifier.
     */
    TestEntity getTestEntityById(Long id);

    /**
     * Registers a new test entity.
     *
     * @param testEntity The test entity to be registered.
     * @return The registered test entity.
     */
    TestEntity registerTestEntity(TestEntity testEntity);
}

package tests;

import static org.junit.jupiter.api.Assertions.*;

import manager.Managers;
import manager.inMemory.InMemoryTaskManager;
import org.junit.jupiter.api.BeforeEach;
import tests.TaskManagerTest;

class InMemoryTaskManagerTest extends TaskManagerTest<InMemoryTaskManager> {
    @BeforeEach
    public void beforeEach() {
        manager = new InMemoryTaskManager(Managers.getDefaultHistory());
    }
}
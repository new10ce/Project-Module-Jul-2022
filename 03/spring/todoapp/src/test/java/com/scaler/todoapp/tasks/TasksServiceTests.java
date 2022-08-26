package com.scaler.todoapp.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class TasksServiceTests {
    private TasksService tasksService = new TasksService();

    /**
     * Can create a new task?
     */
    @Test
    void canCreateTask(){
        tasksService.createTask("task1", new Date());

        Assertions.assertEquals(1, tasksService.getAllTasks().size());
        Assertions.assertEquals("task1", tasksService.getAllTasks().get(0).getName());
    }
}

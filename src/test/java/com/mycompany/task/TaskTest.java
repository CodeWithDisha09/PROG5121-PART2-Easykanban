/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */

public class TaskTest {

    @Test
    public void testCheckTaskDescription_Success() {
        Task task = new Task();
        task.setDescription("Short description.");
        assertTrue(task.checkTaskDescription(), "Task successfully captured");
    }

    @Test
    public void testCheckTaskDescription_Failure() {
        Task task = new Task();
        task.setDescription("This description is definitely more than fifty characters long.");
        assertFalse(task.checkTaskDescription(), "Please enter a task description of less than 50 characters");
    }

    @Test
    public void testCreateTaskID_Success() {
        Task task = new Task();
        task.setNumber(1);
        task.setName("Add Feature");
        task.setDeveloperLastName("Byrne");
        String expectedID = "AD:1:BYN";
        assertEquals(expectedID, task.createTaskID(), "Task ID is correct");
    }

    @Test
    public void testCreateTaskID_Loop() {
        Task[] tasks = new Task[4];
       
        tasks[0] = new Task();
        tasks[0].setNumber(0);
        tasks[0].setName("Create");
        tasks[0].setDeveloperLastName("Ike");
        assertEquals("CR:0:IKE", tasks[0].createTaskID());

        tasks[1] = new Task();
        tasks[1].setNumber(1);
        tasks[1].setName("Create");
        tasks[1].setDeveloperLastName("Ard");
        assertEquals("CR:1:ARD", tasks[1].createTaskID());

        tasks[2] = new Task();
        tasks[2].setNumber(2);
        tasks[2].setName("Create");
        tasks[2].setDeveloperLastName("Tha");
        assertEquals("CR:2:THA", tasks[2].createTaskID());

        tasks[3] = new Task();
        tasks[3].setNumber(3);
        tasks[3].setName("Create");
        tasks[3].setDeveloperLastName("Ndu");
        assertEquals("CR:3:NDU", tasks[3].createTaskID());
    }

    @Test
    public void testReturnTotalHours() {
        Task[] tasks = new Task[2];
       
        // Set up first set of tasks
        tasks[0] = new Task();
        tasks[0].setDuration(10);
       
        tasks[1] = new Task();
        tasks[1].setDuration(8);
       
        assertEquals(18, Task.returnTotalHours(tasks), "Total hours should be 18");

        // Set up second set of tasks for additional data
        Task[] moreTasks = new Task[5];
       
        moreTasks[0] = new Task();
        moreTasks[0].setDuration(10);
       
        moreTasks[1] = new Task();
        moreTasks[1].setDuration(12);
       
        moreTasks[2] = new Task();
        moreTasks[2].setDuration(55);
       
        moreTasks[3] = new Task();
        moreTasks[3].setDuration(11);
       
        moreTasks[4] = new Task();
        moreTasks[4].setDuration(1);
       
        assertEquals(89, Task.returnTotalHours(moreTasks), "Total hours should be 89");
    }
}


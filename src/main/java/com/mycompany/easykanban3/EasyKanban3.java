/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.easykanban3;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class EasyKanban3 {

    public static void main(String[] args) {
        // Display welcome message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        // Ask the user how many tasks they wish to enter
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks would you like to enter?"));
        
        // Initialize variables for total task hours
        int totalHours = 0;

        // Loop to capture task information
        for (int i = 0; i < numTasks; i++) {
            // Task Name
            String taskName = JOptionPane.showInputDialog("Enter the task name:");
            
            // Task Description
            String taskDescription = JOptionPane.showInputDialog("Enter the task description (less than 50 characters):");
            while (taskDescription.length() > 50) {
                taskDescription = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters:");
            }

            // Developer Details
            String developerName = JOptionPane.showInputDialog("Enter the developer's name:");

            // Task Duration
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter the task duration in hours:"));
            totalHours += taskDuration; // Accumulate total task hours
            
            // Autogenerate TaskID
            String taskID = generateTaskID(taskName, i, developerName);
            
            // Task Status
            String[] statusOptions = {"To Do", "Doing", "Done"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, 
                                      "Select Task Status:", 
                                      "Task Status", 
                                      JOptionPane.QUESTION_MESSAGE, 
                                      null, statusOptions, statusOptions[0]);

            // Display task details
            JOptionPane.showMessageDialog(null, """
                                                Task Details:
                                                Task Status: """ + taskStatus + "\n" +
                "Developer: " + developerName + "\n" +
                "Task Number: " + i + "\n" +
                "Task Name: " + taskName + "\n" +
                "Task Description: " + taskDescription + "\n" +
                "Task ID: " + taskID + "\n" +
                "Task Duration: " + taskDuration + " hours");
        }
        
        // Display total hours after entering all tasks
        JOptionPane.showMessageDialog(null, "Total task duration: " + totalHours + " hours");
    }

    // Method to generate Task ID
    private static String generateTaskID(String taskName, int taskNumber, String developerName) {
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerName.substring(developerName.length() - 3).toUpperCase();
        return taskID;
    }
}

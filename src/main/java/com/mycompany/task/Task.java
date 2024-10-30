/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;
/**
 *
 * @author RC_Student_lab
 */
public class Task {
    
    private static int taskCount = 0;
    private int number;
    private String name;
    private String description;
    private String developerFirstName;
    private String developerLastName;
    private int duration;
    private String id;
    private String status;
   
    public Task() {
        taskCount++;
    }
   
    public boolean checkTaskDescription() {
        return this.description.length() <= 50;
    }
   
    public String createTaskID() {
        return (this.name.substring(0, 2) + ":" + this.number + ":" + this.developerLastName.substring(this.developerLastName.length() - 3)).toUpperCase();
    }
   
    public String printTaskDetails() {
        return "Task #" + this.number + ": " + this.name + "\n" +
               "Description: " + this.description + "\n" +
               "Developer: " + this.developerFirstName + " " + this.developerLastName + "\n" +
               "Duration: " + this.duration + " hours\n" +
               "ID: " + this.id + "\n" +
               "Status: " + this.status;
    }
   
    public static int returnTotalHours(Task[] tasks) {
        int total = 0;
        for (Task task : tasks) {
            total += task.duration;
        }
        return total;
    }
   
    // Getters and Setters
    public static int getTaskCount() {
        return taskCount;
    }
   
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloperFirstName() {
        return developerFirstName;
    }

    public void setDeveloperFirstName(String developerFirstName) {
        this.developerFirstName = developerFirstName;
    }

    public String getDeveloperLastName() {
        return developerLastName;
    }

    public void setDeveloperLastName(String developerLastName) {
        this.developerLastName = developerLastName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
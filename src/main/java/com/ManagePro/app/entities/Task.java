package com.ManagePro.app.entities;

import java.sql.Timestamp;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long taskID;
    private String taskTitle;
    private String taskDescription;
    private String reporterUser;
    private String assigneUser;
    private String currentStatus;
    private Timestamp createdDate;
    private String taskType;
    private String taskPriority;
    private String taskPoing;

    @PrePersist
    protected void onCreate() {
        if (this.createdDate == null) {
            this.createdDate = Timestamp.from(Instant.now());
        }
    }

    public long getTaskID() {
        return taskID;
    }
    public void setTaskID(long taskID) {
        this.taskID = taskID;
    }
    public String getTaskTitle() {
        return taskTitle;
    }
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public String getReporterUser() {
        return reporterUser;
    }
    public void setReporterUser(String reporterUser) {
        this.reporterUser = reporterUser;
    }
    public String getAssigneUser() {
        return assigneUser;
    }
    public void setAssigneUser(String assigneUser) {
        this.assigneUser = assigneUser;
    }
    public String getCurrentStatus() {
        return currentStatus;
    }
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
    public Timestamp getCreatedDate() {
        return createdDate;
    }
    public String getTaskType() {
        return taskType;
    }
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
    public String getTaskPriority() {
        return taskPriority;
    }
    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }
    public String getTaskPoing() {
        return taskPoing;
    }
    public void setTaskPoing(String taskPoing) {
        this.taskPoing = taskPoing;
    }
}

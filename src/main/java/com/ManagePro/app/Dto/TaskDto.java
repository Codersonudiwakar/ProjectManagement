package com.ManagePro.app.Dto;

import java.sql.Timestamp;

public class TaskDto {
    private long taskID;
    private String taskTitle;
    private String taskDescription;
    private String reporterUser;
    private String assigneeUser;
    private String currentStatus;
    private Timestamp closedDate;
    private Timestamp createdDate;
    private String taskType;
    private String taskPriority;
    private String taskPoint;
    private String taskEnvoirment;
    
	public TaskDto() {
		super();
	}
	public TaskDto(long taskID, String taskTitle, String taskDescription, String reporterUser, String assigneeUser,
			String currentStatus, Timestamp closedDate, Timestamp createdDate, String taskType, String taskPriority,
			String taskPoint, String taskEnvoirment) {
		super();
		this.taskID = taskID;
		this.taskTitle = taskTitle;
		this.taskDescription = taskDescription;
		this.reporterUser = reporterUser;
		this.assigneeUser = assigneeUser;
		this.currentStatus = currentStatus;
		this.closedDate = closedDate;
		this.createdDate = createdDate;
		this.taskType = taskType;
		this.taskPriority = taskPriority;
		this.taskPoint = taskPoint;
		this.taskEnvoirment = taskEnvoirment;
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
	public String getAssigneeUser() {
		return assigneeUser;
	}
	public void setAssigneeUser(String assigneeUser) {
		this.assigneeUser = assigneeUser;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public Timestamp getClosedDate() {
		return closedDate;
	}
	public void setClosedDate(Timestamp closedDate) {
		this.closedDate = closedDate;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
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
	public String getTaskPoint() {
		return taskPoint;
	}
	public void setTaskPoint(String taskPoint) {
		this.taskPoint = taskPoint;
	}
	public String getTaskEnvoirment() {
		return taskEnvoirment;
	}
	public void setTaskEnvoirment(String taskEnvoirment) {
		this.taskEnvoirment = taskEnvoirment;
	}

}


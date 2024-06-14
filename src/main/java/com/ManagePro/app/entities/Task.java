package com.ManagePro.app.entities;

import java.sql.Date;

public class Task {
	private long taskID;
	private String taskTitle;
	private String taskDescription;
	private String reporterUser;
	private String assigneUser;
	private String currentStatus;
	private Date createdDate;
	private String taskType;
	private String taskPriority;
	private String taskPoing;
	
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
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
	public String getTaskPoing() {
		return taskPoing;
	}
	public void setTaskPoing(String taskPoing) {
		this.taskPoing = taskPoing;
	}
	

}

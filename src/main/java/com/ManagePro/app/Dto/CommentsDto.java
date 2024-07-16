package com.ManagePro.app.Dto;

import java.sql.Timestamp;

public class CommentsDto {
	
	private long commentID;
	private long taskID;
	private String comments;
	private Timestamp createdDate;
	private String commentUsername;
	
	public CommentsDto(long commentID, long taskID, String comments, Timestamp createdDate, String commentUsername) {
		super();
		this.commentID = commentID;
		this.taskID = taskID;
		this.comments = comments;
		this.createdDate = createdDate;
		this.commentUsername = commentUsername;
	}
	public CommentsDto() {
		super();
	}
	public long getCommentID() {
		return commentID;
	}
	public void setCommentID(long commentID) {
		this.commentID = commentID;
	}
	public long getTaskID() {
		return taskID;
	}
	public void setTaskID(long taskID) {
		this.taskID = taskID;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getCommentUsername() {
		return commentUsername;
	}
	public void setCommentUsername(String commentUsername) {
		this.commentUsername = commentUsername;
	}

}

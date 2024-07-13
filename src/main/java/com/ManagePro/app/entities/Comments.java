package com.ManagePro.app.entities;

import java.sql.Timestamp;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;


@Entity
@Table(name = "Comments")
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long commentID;
	private long taskID;
	private String comments;
	private Timestamp createdDate;
	private String commentUsername;
	
	   @PrePersist
	    protected void onCreate() {
	        if (this.createdDate == null) {
	            this.createdDate = Timestamp.from(Instant.now());
	        }
	    }
	   
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Comments(long commentID, long taskID, String comments, Timestamp createdDate, String commentUsername) {
		super();
		this.commentID = commentID;
		this.taskID = taskID;
		this.comments = comments;
		this.createdDate = createdDate;
		this.commentUsername = commentUsername;
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

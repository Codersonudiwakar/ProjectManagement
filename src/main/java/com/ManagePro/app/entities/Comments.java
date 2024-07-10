package com.ManagePro.app.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

}

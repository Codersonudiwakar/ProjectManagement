package com.ManagePro.app.Service;

import java.util.List;

import com.ManagePro.app.entities.Task;

public interface TaskService {
	
	 public Task addTask(Task task);
	 public Task getTaskById(long id);
	 public List<Task> getAllTask();
	 public String deleteTask(long id);
	 public String updateTask(long id, Task newTask);

}

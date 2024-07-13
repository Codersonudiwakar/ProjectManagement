package com.ManagePro.app.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ManagePro.app.entities.Task;

public interface TaskService {

	public Task addTask(Task task);

	public Task getTaskById(long id);

	public List<Task> getAllTask();

	public String deleteTask(long id);

	public String updateTask(long id, Task newTask);

	public List<Task> getClosedTask();

	public List<Task> getOpenTask();

	public List<Task> getHighTask();

	public List<Task> getLowTask();

	public List<Task> getMediumTask();

	public List<Task> getMyTask();
	
	public String editAssigneUser(long id, Task newTask);
	
	

}

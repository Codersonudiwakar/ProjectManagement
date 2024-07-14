package com.ManagePro.app.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ManagePro.app.Dto.TaskDto;
import com.ManagePro.app.entities.Task;

public interface TaskService {

	public Task addTask(TaskDto taskDto);

	public TaskDto getTaskById(long id);

	public List<TaskDto> getAllTask();

	public String deleteTask(long id);

	public String updateTask(long id, TaskDto newTask);

	public List<TaskDto> getClosedTask();

	public List<TaskDto> getOpenTask();

	public List<TaskDto> getHighTask();

	public List<TaskDto> getLowTask();

	public List<TaskDto> getMediumTask();

	public List<TaskDto> getMyTask();
	
	public String editAssigneUser(long id, TaskDto newTask);
	
	

}

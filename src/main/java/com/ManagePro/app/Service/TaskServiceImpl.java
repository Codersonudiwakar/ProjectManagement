package com.ManagePro.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManagePro.app.Repository.TaskRepository;
import com.ManagePro.app.entities.Task;
import com.ManagePro.app.exceptionhandler.ResourceNotFoundException;


@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskRepository taskrepo;

	@Override
	public Task addTask(Task task) {
		return taskrepo.save(task);
	}

	@Override
	public Task getTaskById(long id) {
		return taskrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("No Match found "));
	}

	@Override
	public List<Task> getAllTask() {
		
		List<Task> taskList=taskrepo.findAll();
		
		return taskList;
		}

	@Override
	public String deleteTask(long id) {
		taskrepo.deleteById(id);
		return "Task Delete";
	}

	@Override
	public String updateTask(long id, Task newTask) {
		newTask.setTaskID(id);
		taskrepo.save(newTask);
        return "task update successfully";
	}
	

}

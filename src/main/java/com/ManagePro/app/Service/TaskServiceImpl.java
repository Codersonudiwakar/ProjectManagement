package com.ManagePro.app.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManagePro.app.Dto.TaskDto;
import com.ManagePro.app.Dto.TaskMapper;
import com.ManagePro.app.Repository.TaskRepository;
import com.ManagePro.app.entities.Task;
import com.ManagePro.app.exceptionhandler.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;



@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	private TaskRepository taskrepo;
	
	@Autowired
	private TaskMapper maper;

	@Override
	public Task addTask(TaskDto task) {
		task.setCurrentStatus("create");
		Task taskData=maper.toEntity(task);
		return taskrepo.save(taskData);
	}

	@Override
	public TaskDto getTaskById(long id) {
		Task task=taskrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("No Match found"));
		TaskDto dto=maper.toDTO(task);
		return dto;
	}

	@Override
	public List<TaskDto> getAllTask() {
		List<Task> taskLI=taskrepo.findAll();
		List<TaskDto> taskList=new ArrayList<>();
	        for (Task task : taskLI) {
	        	TaskDto taskDto =maper.toDTO(task);
	        	taskList.add(taskDto);
	        }
		return taskList;
		}

	@Override
	public String deleteTask(long id) {
		taskrepo.deleteById(id);
		return "Task Delete";
	}

	@Override
	public String updateTask(long id, TaskDto updatedTask) {
		updatedTask.setTaskID(id);
		Optional<Task> optionalTask = taskrepo.findById(id);
		if (optionalTask.isEmpty()) {
            throw new EntityNotFoundException("Task not found");
        }

        Task existingTask = optionalTask.get();
		if (updatedTask.getTaskTitle()==null) {
			updatedTask.setTaskTitle(existingTask.getTaskTitle());
        }
        if (updatedTask.getTaskDescription()== null) {
        	updatedTask.setTaskDescription(existingTask.getTaskDescription());
        }
        if (updatedTask.getReporterUser() == null) {
        	updatedTask.setReporterUser(existingTask.getReporterUser());
        }
        if (updatedTask.getAssigneeUser() == null) {
        	updatedTask.setAssigneeUser(existingTask.getAssigneeUser());
        }
        if (updatedTask.getCurrentStatus() == null) {
        	updatedTask.setCurrentStatus(existingTask.getCurrentStatus());
        }
        if (updatedTask.getClosedDate() == null) {
        	updatedTask.setClosedDate(existingTask.getClosedDate());
        }
        if (updatedTask.getCreatedDate() == null) {
        	updatedTask.setCreatedDate(existingTask.getCreatedDate());
        }
        if (updatedTask.getTaskType() == null) {
        	updatedTask.setTaskType(existingTask.getTaskType());
        }
        if (updatedTask.getTaskPriority() == null) {
        	updatedTask.setTaskPriority(existingTask.getTaskPriority());
        }
        if (updatedTask.getTaskPoint() == null) {
        	updatedTask.setTaskPoint(existingTask.getTaskPoint());
        }
        if (updatedTask.getTaskEnvoirment() == null) {
        	updatedTask.setTaskEnvoirment(existingTask.getTaskEnvoirment());
        }
		
		
		
		
        Task dataTask=maper.toEntity(updatedTask);
		taskrepo.save(dataTask);
        return "task update successfully";
	}

	@Override
	public List<TaskDto> getClosedTask() {
		List<Task> taskLI=taskrepo.getClosedTask();
		List<TaskDto> taskList=new ArrayList<>();
        for (Task task : taskLI) {
        	TaskDto taskDto =maper.toDTO(task);
        	taskList.add(taskDto);
        }
	return taskList;
	}

	@Override
	public List<TaskDto> getOpenTask() {
		List<Task> taskLI=taskrepo.getOpenTask();
		List<TaskDto> taskList=new ArrayList<>();
        for (Task task : taskLI) {
        	TaskDto taskDto =maper.toDTO(task);
        	taskList.add(taskDto);
        }
	return taskList;
	}

	@Override
	public List<TaskDto> getHighTask() {
		List<Task> taskLI=taskrepo.getHighTask();
		List<TaskDto> taskList=new ArrayList<>();
        for (Task task : taskLI) {
        	TaskDto taskDto =maper.toDTO(task);
        	taskList.add(taskDto);
        }
	return taskList;
	}

	@Override
	public List<TaskDto> getLowTask() {
		List<Task> taskLI=taskrepo.getLowTask();
		List<TaskDto> taskList=new ArrayList<>();
        for (Task task : taskLI) {
        	TaskDto taskDto =maper.toDTO(task);
        	taskList.add(taskDto);
        }
	return taskList;
	}

	@Override
	public List<TaskDto> getMediumTask() {
		List<Task> taskLI=taskrepo.getMediumTask();
		List<TaskDto> taskList=new ArrayList<>();
        for (Task task : taskLI) {
        	TaskDto taskDto =maper.toDTO(task);
        	taskList.add(taskDto);
        }
	return taskList;
	}

	@Override
	public List<TaskDto> getMyTask() {
		List<Task> taskLI=taskrepo.getMyTask(null);
		List<TaskDto> taskList=new ArrayList<>();
        for (Task task : taskLI) {
        	TaskDto taskDto =maper.toDTO(task);
        	taskList.add(taskDto);
        }
	return taskList;
	}
	
    @Override
	public String editAssigneUser(long id, TaskDto newTask) {
    	return "User Edited Success";
    }

	

}

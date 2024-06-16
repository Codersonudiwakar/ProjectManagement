package com.ManagePro.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.ManagePro.app.Service.TaskService;
import com.ManagePro.app.entities.Task;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    public TaskController(TaskService taskService ) {
		
	}

	@Autowired
    private TaskService taskService;
	
    @RequestMapping("/")
    public String sayHi() {
    	return "this Application Run";
    }

    @GetMapping("/tasks") 
    public List<Task> getAllTask() { 
        return taskService.getAllTask();
    }

    @GetMapping("tasks/{id}")
    public Task getTaskById(@PathVariable long id) {
        Task task = taskService.getTaskById(id);
        return task;
    }
    
	
	@PostMapping("/tasks")
	public Task addTask( @RequestBody Task task) {
		return taskService.addTask(task);
	}
	 

    @PutMapping("/tasks/{id}")
    public String updateTask( @PathVariable  long id, @RequestBody Task newTask) {
    	taskService.updateTask(id, newTask);
    	return "task update Sucessfully";
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable long id) {
    	taskService.deleteTask(id);
    	return "Delete task Sucessfully";
    }
}
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

    @GetMapping("/getAllTasks") 
    public List<Task> getAllTask() { 
        return taskService.getAllTask();
    }
    
    
    @GetMapping("/getClosedTask") 
    public List<Task> getClosedTask() { 
        return taskService.getClosedTask();
    }
    
    
    
    @GetMapping("/getOpenTask") 
    public List<Task> getOpenTask() { 
        return taskService.getOpenTask();
    }
    
    
    @GetMapping("/getLowTask") 
    public List<Task> getLowTask() { 
        return taskService.getLowTask();
    }
    
    
    @GetMapping("/getHighTasks") 
    public List<Task> getHighTask() { 
        return taskService.getHighTask();
    }
    
    @GetMapping("/getMediumTasks") 
    public List<Task> getMediumTask() { 
        return taskService.getHighTask();
    }

    @GetMapping("tasks/{id}")
    public Task getTaskById(@PathVariable long id) {
        Task task = taskService.getTaskById(id);
        return task;
    }
    
	
	@PostMapping("/addTask")
	public Task addTask( @RequestBody Task task) {
		return taskService.addTask(task);
	}
	 

    @PostMapping("editTasks/{id}")
    public Task updateTask( @PathVariable  long id, @RequestBody Task newTask) {
    	System.out.println(newTask.getCreatedDate());
    	taskService.updateTask(id, newTask);
    	
    	return newTask ;
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable long id) {
    	taskService.deleteTask(id);
    	return "Delete task Sucessfully";
    }
}
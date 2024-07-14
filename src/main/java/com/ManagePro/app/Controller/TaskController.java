package com.ManagePro.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.ManagePro.app.Dto.TaskDto;
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
    public List<TaskDto> getAllTask() { 
        return taskService.getAllTask();
    }
    
    
    @GetMapping("/getClosedTasks") 
    public List<TaskDto> getClosedTask() { 
        return taskService.getClosedTask();
    }
    
    
    
    @GetMapping("/getOpenTasks") 
    public List<TaskDto> getOpenTask() { 
        return taskService.getOpenTask();
    }
    
    
    @GetMapping("/getLowTasks") 
    public List<TaskDto> getLowTask() { 
        return taskService.getLowTask();
    }
    
    
    @GetMapping("/getHighTasks") 
    public List<TaskDto> getHighTask() { 
        return taskService.getHighTask();
    }
    
    @GetMapping("/getMediumTasks") 
    public List<TaskDto> getMediumTask() { 
        return taskService.getHighTask();
    }

    @GetMapping("/getOneTask/{id}")
    public TaskDto getTaskById(@PathVariable long id) {
    	TaskDto task = taskService.getTaskById(id);
        return task;
    }
    
	@PostMapping("/addTask")
	public Task addTask( @RequestBody TaskDto task) {
		return taskService.addTask(task);
	}
	 

    @PatchMapping("editTask/{id}")
    public String updateTask( @PathVariable  long id, @RequestBody TaskDto newTask) {
     taskService.updateTask(id, newTask);
    	
    	return "Task Updated Successfully" ;
    }
 
    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable long id) {
    	taskService.deleteTask(id);
    	return "Delete task Sucessfully";
    }
}
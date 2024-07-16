package com.ManagePro.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ManagePro.app.Dto.CommentsDto;
import com.ManagePro.app.Service.CommentsService;
import com.ManagePro.app.entities.Comments;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CommentController {
	 public CommentController(CommentsService commentsService ) {
		}
	 
	 @Autowired
	 private CommentsService commentsService;
	 
	 
	 @PostMapping("/addComment")
		public Comments addComments( @RequestBody CommentsDto comment) {
			return commentsService.addComment(comment);
		}
		 

//	    @PatchMapping("editTask/{id}")
//	    public String updateTask( @PathVariable  long id, @RequestBody TaskDto newTask) {
//	     taskService.updateTask(id, newTask);
//	    	
//	    	return "Task Updated Successfully" ;
//	    }
	 
	    @DeleteMapping("/tasks/{id}")
	    public String deleteTask(@PathVariable long id) {
	    	commentsService.deleteComment(id);
	    	return "Delete task Sucessfully";
	    }
	 

}

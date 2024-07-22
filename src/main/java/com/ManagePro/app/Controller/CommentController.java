package com.ManagePro.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ManagePro.app.Dto.CommentsDto;
import com.ManagePro.app.Dto.TaskDto;
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
	 
	 @GetMapping("/getAllComments/{id}")
	    public List<CommentsDto> getAllComments(@PathVariable String id) {
	    	List<CommentsDto> listCommenst=commentsService.getAllCommentsTask(id);
	        return listCommenst;
	    }
	 
	 @DeleteMapping("comDelete/{id}")
	 public String deleteComment(@PathVariable long id) {
		commentsService.deleteComment(id);
		 return "Comments Deleted Successfully";
	 }	    
}

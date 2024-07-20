package com.ManagePro.app.Service;

import java.util.List;

import com.ManagePro.app.Dto.CommentsDto;
import com.ManagePro.app.entities.Comments;

public interface CommentsService {

	public Comments addComment(CommentsDto commentsDto);
	
	public List<CommentsDto> getAllCommentsTask(String taskId);
	
	public String deleteComment(long id);
}

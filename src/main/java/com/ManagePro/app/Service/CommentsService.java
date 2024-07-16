package com.ManagePro.app.Service;

import com.ManagePro.app.Dto.CommentsDto;
import com.ManagePro.app.entities.Comments;

public interface CommentsService {

	
	public Comments addComment(CommentsDto commentsDto);
	
	public String deleteComment(long id);
}

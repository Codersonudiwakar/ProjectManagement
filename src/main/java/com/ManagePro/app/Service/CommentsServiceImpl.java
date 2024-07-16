package com.ManagePro.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManagePro.app.Dto.CommentsDto;
import com.ManagePro.app.Dto.TaskMapper;
import com.ManagePro.app.Repository.CommentsRepository;
import com.ManagePro.app.entities.Comments;


@Service
public class CommentsServiceImpl implements CommentsService {
	
	@Autowired
	private CommentsRepository commentsRepository;
	
	@Autowired
	private TaskMapper mapper;

	@Override
	public Comments addComment(CommentsDto commentsDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteComment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

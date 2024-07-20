package com.ManagePro.app.Service;

import java.util.ArrayList;
import java.util.List;

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
		Comments cmt=mapper.dtoToEntityComments(commentsDto);
		return commentsRepository.save(cmt);
	}

	@Override
	public String deleteComment(long id) {
		commentsRepository.deleteById(id);
		
		return "Deleted Comments" ;
	}

	@Override
	public List<CommentsDto> getAllCommentsTask(String taskId) {
		List<Comments> commentList=commentsRepository.getCommentsByTaksId(taskId);
		List<CommentsDto> commentsDtoList= new ArrayList<CommentsDto>();
		for (Comments comments : commentList) {
			commentsDtoList.add(mapper.entityToDtoComments(comments));
		}
		return commentsDtoList;
	}

}

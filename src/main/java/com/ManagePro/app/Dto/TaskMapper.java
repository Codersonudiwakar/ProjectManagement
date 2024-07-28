package com.ManagePro.app.Dto;



import org.springframework.stereotype.Component;

import com.ManagePro.app.entities.Comments;
import com.ManagePro.app.entities.Task;
import com.ManagePro.app.entities.User;


@Component
public class TaskMapper {
	
    public static TaskDto toDTO(Task entity) {
        if (entity == null) {
            return null;
        }
        TaskDto dto = new TaskDto();
        dto.setTaskID(entity.getTaskID());
        dto.setTaskTitle(entity.getTaskTitle());
        dto.setTaskDescription(entity.getTaskDescription());
        dto.setReporterUser(entity.getReporterUser());
        dto.setAssigneeUser(entity.getAssigneeUser());
        dto.setCurrentStatus(entity.getCurrentStatus());
        dto.setClosedDate(entity.getClosedDate());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setTaskType(entity.getTaskType());
        dto.setTaskPriority(entity.getTaskPriority());
        dto.setTaskPoint(entity.getTaskPoint());
        dto.setTaskEnvoirment(entity.getTaskEnvoirment());

        return dto;
    }

    public static Task toEntity(TaskDto dto) {
        if (dto == null) {
            return null;
        }

        Task entity = new Task();
        entity.setTaskID(dto.getTaskID());
        entity.setTaskTitle(dto.getTaskTitle());
        entity.setTaskDescription(dto.getTaskDescription());
        entity.setReporterUser(dto.getReporterUser());
        entity.setAssigneUser(dto.getAssigneeUser());
        entity.setCurrentStatus(dto.getCurrentStatus());
        entity.setClosedDate(dto.getClosedDate());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setTaskType(dto.getTaskType());
        entity.setTaskPriority(dto.getTaskPriority());
        entity.setTaskPoint(dto.getTaskPoint());
        entity.setTaskEnvoirment(dto.getTaskEnvoirment());

        return entity;
    }
    
    public static CommentsDto entityToDtoComments(Comments entity) {
    	CommentsDto dto = new CommentsDto();
        dto.setCommentID(entity.getCommentID());
        dto.setTaskID(entity.getTaskID());
        dto.setComments(entity.getComments());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setCommentUsername(entity.getCommentUsername());
        return dto;
    }

    // DTO to Entity
    public static Comments dtoToEntityComments(CommentsDto dto) {
    	Comments entity = new Comments();
        entity.setCommentID(dto.getCommentID());
        entity.setTaskID(dto.getTaskID());
        entity.setComments(dto.getComments());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setCommentUsername(dto.getCommentUsername());
        return entity;
    }
    
    public static UserDto entityToDtoUser(User entity) {
    	UserDto dto = new UserDto();
    	dto.setUserId(entity.getUserId());
    	dto.setUserName(entity.getUserName());
    	dto.setEmail(entity.getEmail());
    	dto.setUserPassword(entity.getUserPassword());
    	dto.setUserProfile(entity.getUserProfile());
        return dto;
    }

    // DTO to Entity
    public static User dtoToEntityUser(UserDto dto) {
    	User entity = new User();
    	entity.setUserId(dto.getUserId());
    	entity.setUserName(dto.getUserName());
    	entity.setEmail(dto.getEmail());
    	entity.setUserPassword(dto.getUserPassword());
    	entity.setUserProfile(dto.getUserProfile());
        return entity;
    }
}


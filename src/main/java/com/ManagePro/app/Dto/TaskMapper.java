package com.ManagePro.app.Dto;



import org.springframework.stereotype.Component;

import com.ManagePro.app.entities.Task;


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
}


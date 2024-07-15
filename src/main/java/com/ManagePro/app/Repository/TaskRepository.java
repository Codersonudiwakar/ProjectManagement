package com.ManagePro.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ManagePro.app.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	

    @Query(value = "SELECT * FROM Task WHERE current_status = 'Closed'", nativeQuery = true)
    List<Task> getClosedTask();
    
    @Query(value = "SELECT * FROM Task WHERE current_status != 'Closed'", nativeQuery = true)
    List<Task> getOpenTask();

    @Query(value = "SELECT * FROM Task WHERE task_priority = 'High'", nativeQuery = true)
    List<Task> getHighTask();

    @Query(value = "SELECT * FROM Task WHERE task_priority = 'Low'", nativeQuery = true)
    List<Task> getLowTask();

    @Query(value = "SELECT * FROM Task WHERE task_priority = 'Medium'", nativeQuery = true)
    List<Task> getMediumTask();

    @Query(value = "SELECT * FROM Task WHERE assigned_user = :username", nativeQuery = true)
    List<Task> getMyTask(@Param("username") String username);
    
    @Query(value = "SELECT * FROM Task WHERE taskid = :id",nativeQuery = true)
    Task getTask(long id);
}
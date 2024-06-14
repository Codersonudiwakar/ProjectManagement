package com.ManagePro.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManagePro.app.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}

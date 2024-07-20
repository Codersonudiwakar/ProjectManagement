package com.ManagePro.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ManagePro.app.entities.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long>{
	
	@Query(value = "SELECT * FROM comments WHERE taskid = :taskID", nativeQuery = true)
    List<Comments> getCommentsByTaksId(@Param("taskID") String taskID);

}

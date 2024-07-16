package com.ManagePro.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManagePro.app.entities.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Long>{

}

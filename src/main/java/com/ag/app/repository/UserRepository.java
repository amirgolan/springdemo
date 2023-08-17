package com.ag.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ag.app.model.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo,Long>{
	
	
}

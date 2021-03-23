package com.osos.spring.repos;

import java.util.List;

import com.osos.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findTop10ByOrderByClientDealIdAsc();

}

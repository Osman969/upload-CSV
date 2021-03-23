package com.osos.spring.service;

import java.util.List;

import com.osos.spring.entities.User;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
	
	public List<User> uploadCSVFile(MultipartFile file);
	public List<User>findTop10ByOrderByClientDealIdAsc();
}

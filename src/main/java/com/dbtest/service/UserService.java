package com.dbtest.service;

import java.util.List;

import com.dbtest.dto.UserDTO;

public interface UserService {
	public abstract List<UserDTO> userList();

}
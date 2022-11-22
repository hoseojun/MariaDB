package com.dbtest.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.dbtest.dto.UserDTO;

public interface UserDAO {
	public abstract List<UserDTO> userList(SqlSessionTemplate session);
}
package com.dbtest.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dbtest.dto.UserDTO;

@Repository
public class UuserDAOImpl implements UserDAO{

	@Override
	public List<UserDTO> userList(SqlSessionTemplate session) {
		return session.selectList("UserMapper.userList");
	}

}
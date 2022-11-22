package com.dbtest.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("user")
@Getter
@Setter
@ToString
public class UserDTO {
	String id;
	String name;
	int age;
	
	public UserDTO() {}

	public UserDTO(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public UserDTO(String name) {
		super();
		this.name = name;
	}
}

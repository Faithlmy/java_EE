package com.mybatis3TestIuser;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mybatis3.User;

public interface myIUser {

	@Select("select * from user where id=#{id}")
	public User getUser(int id);
	
	@Select("select name from user where id = #{id}")
	public List<User> getUserList(int id);
}

package com.mybatis3TestIuser;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis3.User;

public class TestUserIUser  {

	 private static SqlSessionFactory sqlSessionFactory;
	    private static Reader reader;
	    static {
	        try {
	            reader = Resources.getResourceAsReader("myconf.xml");
	            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	            sqlSessionFactory.getConfiguration().addMapper(myIUser.class);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static SqlSessionFactory getSession() {
	        return sqlSessionFactory;
	    }

	    public static void main(String[] args){
	        SqlSession session = sqlSessionFactory.openSession();
	        try {
	            myIUser iuser = session.getMapper(myIUser.class);
	            User user = iuser.getUser(1);
	            System.out.println("name："+user.getName());
	        } finally {
	            session.close();
	        }
	    }
}

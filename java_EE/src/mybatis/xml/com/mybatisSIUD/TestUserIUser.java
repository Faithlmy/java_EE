package com.mybatisSIUD;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class TestUserIUser  {

	 private static SqlSessionFactory sqlSessionFactory;
	    private static Reader reader;
	    static {
	        try {
	            reader = Resources.getResourceAsReader("com/mybatisSIUD/SIUDconf.xml");
	            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static SqlSessionFactory getSession() {
	        return sqlSessionFactory;
	    }

	    public static void main(String[] args){
//	    	TestInsertUser();
//	    	TestSelectUser();
//	    	TestSelectUserList();
	    	TestUpdate();
//	    	TestDelete();
	    }
	    
	    // insert
	    public static void TestInsertUser() {
	    	SqlSession session = sqlSessionFactory.openSession();
	    	try {
	    		myIUser iuser = session.getMapper(myIUser.class);
	    		User user = new User();
	    		user.setAge(34);
//	    		user.setName("f");
	    		iuser.insertUser(user);
	    		session.commit();
		    	System.out.println("ok");
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}finally {
	    		session.close();
	    	}
	    }
	    
	    //select
	    public static void TestSelectUserList() {
	    	SqlSession session = sqlSessionFactory.openSession();
	    	try {
	    		myIUser iuser = session.getMapper(myIUser.class);
	    		printUser(iuser.getUserList());
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}finally {
	    		session.close();
	    	}
	    }
	    
	    public static void TestUpdate() {
	    	SqlSession session = sqlSessionFactory.openSession();
	    	try {
	    		myIUser iuser = session.getMapper(myIUser.class);
	    		User user = iuser.getUser(2);
	    		user.setName("hhhhh");
	    		iuser.updateUser(user);
	    		session.commit();
	    		System.out.println("ok");
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}finally {
	    		session.close();
	    	}
	    }
	    

	    public static void TestDelete() {
	    	SqlSession session = sqlSessionFactory.openSession();
	    	try {
	    		System.out.println(90);
	    		myIUser iuser = session.getMapper(myIUser.class);
	    		iuser.deleteUser(1);
	    		session.commit();
	    		System.out.println("ok");
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}finally {
	    		session.close();
	    	}
	    }
	    @SuppressWarnings("unused")
		private static void printUser(final List<User> users)  {
	    	for(User user:users) {
	    		System.out.println("Id: " + user.getId());
	    		System.out.println("name: " + user.getName());
	    		System.out.println("age: " + user.getAge());
	    	}
	    	
	    }
}

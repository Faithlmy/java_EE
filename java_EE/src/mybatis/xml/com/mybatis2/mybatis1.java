package com.mybatis2;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatis1 {

    private static UserDao userDao;  
    
    private static Reader reader;  
  
    private static SqlSessionFactory sessionFactory;    
        
    private static SqlSession session = null;  
      
    public static void main(String[] args){  
          
        // Session Factory  
        Initialize("com/mybatis2/mybatis_config.xml");  
  
        try{  
            List<UserEntity> userList = userDao.findAllList();  
              
            for(UserEntity user:userList){  
                System.out.println("ID:" + user.getId());  
                System.out.println("Name:" + user.getName());  
                System.out.println("Age:" + user.getAge());  
            }  
        }    
        catch (Exception e)    
        {    
            e.printStackTrace();    
        }  
    }  
      
    private static void Initialize(String configFile){  
        try {    
            reader = Resources.getResourceAsReader(configFile);  
              
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);  
                
            session = sessionFactory.openSession();    
                
            userDao = session.getMapper(UserDao.class);  
              
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
    }  
}

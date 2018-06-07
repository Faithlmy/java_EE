package com.mybatis2;

import java.util.UUID;

public class UserEntity {
	
	private String id;  // ID  
    private String name;    // 姓名  
    private String age; // 年龄  
    public String getId() {  
        return id;  
    }  
    public void setId(String id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getAge() {  
        return age;  
    }  
    public void setAge(String age) {  
        this.age = age;  
    }  
      
    /** 
     * 插入之前执行方法，需要手动调用 
     */  
    public void preInsert(){  
        // 不限制ID为UUID，调用setIsNewRecord()使用自定义ID  
        setId(uuid());  
    }  
      
    /** 
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割. 
     */  
    public static String uuid() {  
        return UUID.randomUUID().toString().replaceAll("-", "");  
    }  

}

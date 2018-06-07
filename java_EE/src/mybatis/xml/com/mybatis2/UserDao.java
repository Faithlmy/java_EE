package com.mybatis2;

import java.util.List;

public interface  UserDao {

	 /** 
     * 获取单条数据 
     * @param id 
     * @return 
     */  
    public UserEntity get(String id);  
      
    /** 
     * 获取单条数据 
     * @param entity 
     * @return 
     */  
    public UserEntity get(UserEntity entity);  
      
    /** 
     * 查询数据列表 
     * @param entity 
     * @return 
     */  
    public List<UserEntity> findList(UserEntity entity);  
      
    /** 
     * 查询 
     * @param entity 
     * @return 
     */  
    public List<UserEntity> findAllList(UserEntity entity);  
      
    /** 
     * 查询 
     * @see public List<UserEntity> findAllList(UserEntity entity) 
     * @return 
     */  
    @Deprecated  
    public List<UserEntity> findAllList();  
      
    /** 
     * 插入数据 
     * @param entity 
     * @return 
     */  
    public int insert(UserEntity entity);  
      
    /** 
     * 更新数据 
     * @param entity 
     * @return 
     */  
    public int update(UserEntity entity);  
      
    /** 
     * 删除数据 
     * @see public int delete(T entity) 
     * @return 
     */  
    @Deprecated  
    public int delete(String id);  
      
    /** 
     * 删除数据 
     * @return 
     */  
    public int delete(UserEntity entity);  
}

package com.faithset;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

	@Test
	public void getAll() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/faithset/b.xml");
		UserDao  ud = (UserDao) ac.getBean("userdao");
		System.out.println(ud.getName());
		
		for(String empname : ud.getEmpname() ) {
			System.out.println(empname);
		}
		
		for(Emp mylist :ud.getMylist()) {
			System.out.println("list");
			System.out.println(mylist.getName());
//			System.out.println(mylist.getId());
		}
		
		for(Emp myset : ud.getMyset()) {
			System.out.println("set");
			System.out.println(myset.getName());
		}
		
		
//		Map<String, Emp> myemp = ud.getMymap();
//		Iterator it = myemp.keySet().iterator();
//		while(it.hasNext()) {
//			String key = (String) it.next();
//			Emp emp = myemp.get(key);
//			System.out.println("key: "  + key + ", value: " + emp.getName() );
//		}
		
		Properties pp = ud.getPp();
		for(Entry<Object, Object> entry: pp.entrySet()) {
			System.out.println(entry.getKey().toString() + ", "  + entry.getValue().toString());
		}
	}
}

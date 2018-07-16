package com.faithset;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserDao {
	
	private Set<Emp> myset;
	private List<Emp> mylist;
	private Map <String, Emp> mymap;
	private String name;
	private String[] empname;
	private Properties pp;
	
	public Set<Emp> getMyset() {
		return myset;
	}
	public void setMyset(Set<Emp> myset) {
		this.myset = myset;
	}
	public List<Emp> getMylist() {
		return mylist;
	}
	public void setMylist(List<Emp> mylist) {
		this.mylist = mylist;
	}
	public Map<String, Emp> getMymap() {
		return mymap;
	}
	public void setMymap(Map<String, Emp> mymap) {
		this.mymap = mymap;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmpname() {
		return empname;
	}
	public void setEmpname(String[] empname) {
		this.empname = empname;
	}
	public Properties getPp() {
		return pp;
	}
	public void setPp(Properties pp) {
		this.pp = pp;
	}

	

}

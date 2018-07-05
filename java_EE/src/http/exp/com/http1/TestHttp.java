package com.http1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;

public class TestHttp {

	public static void main(String[] args) throws ClientProtocolException, IOException
	{
		String baseUrl = "http://localhost:8080/";
//		String baseUrl = "http://10.167.193.89:8080/";
		Map<String, String> map = new HashMap<String, String>();
		map.put("code", "js");
		map.put("day", "0");
		String body = HttpDemo.send(baseUrl, map);
		System.out.println("交易响应结果：");
		System.out.println(body);

	}

}

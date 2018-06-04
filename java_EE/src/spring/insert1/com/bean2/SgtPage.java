package com.bean2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


// 注解表明该类会作为组件类,并告知Spring要为这个类创建 bean
public class SgtPage implements  CompaticDC{
	
	private  String title = "faith";
	private  String arts = "con";

	@Bean
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(title + "   " +  arts);
	}

}

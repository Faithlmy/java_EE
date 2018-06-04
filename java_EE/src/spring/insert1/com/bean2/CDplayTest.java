package com.bean2;


import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDplayConfig.class)
public class CDplayTest {

	@Autowired
	private CompaticDC cd;
	
	@Test
	public void cdShow() {
//		assertNotNull(cd);
	}
}

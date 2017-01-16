package com.baojie.springlearn;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetBeanFromSpring implements InitializingBean{
	@Autowired
	private SpringTest springTest;
	
	public GetBeanFromSpring(){
		
	}
	
	public SpringTest getSpringTest() {
		return springTest;
	}

	public void setSpringTest(SpringTest springTest) {
		this.springTest = springTest;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
	
}

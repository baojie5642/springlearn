package com.baojie.springlearn;

import java.io.Serializable;

public class SpringTest implements Serializable{
	private static final long serialVersionUID = 2017011701070455555L;
	private int num;
	private String name;

	public SpringTest() {

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

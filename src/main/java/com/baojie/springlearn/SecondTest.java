package com.baojie.springlearn;

import java.io.Serializable;

public class SecondTest  implements Serializable{
	private static final long serialVersionUID = 2017011702070455555L;
	private int haoMa;
	private String mingCheng;

	public SecondTest() {

	}

	public int getHaoMa() {
		return haoMa;
	}

	public void setHaoMa(int haoMa) {
		this.haoMa = haoMa;
	}

	public String getMingCheng() {
		return mingCheng;
	}

	public void setMingCheng(String mingCheng) {
		this.mingCheng = mingCheng;
	}

	
}

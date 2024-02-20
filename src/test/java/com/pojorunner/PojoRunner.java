package com.pojorunner;

import com.pojo.Pojo;

public class PojoRunner extends Pojo {

	public static void main(String[] args) {
		 Pojo p = new Pojo();
//		 p.setName("Sandy");
//		 p.setAge("28");
		 System.out.println(p.getName()+"="+p.getAge());
	}
}

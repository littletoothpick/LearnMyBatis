package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.adapter.AdapterOfClass;
import cn.edu.scau.cmi.zhouxudong.adapter.Target;

public class AdapterOfClassClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Target adaptee = new AdapterOfClass();
		
		adaptee.operation1();
		adaptee.operation2();
	}

}

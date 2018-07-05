package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.adapter.AdapterOfClass;
import cn.edu.scau.cmi.zhouxudong.adapter.Target;

public class AdapterOfObjectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Target tar = new AdapterOfClass();
		tar.operation1();
		tar.operation2();	
	}

}

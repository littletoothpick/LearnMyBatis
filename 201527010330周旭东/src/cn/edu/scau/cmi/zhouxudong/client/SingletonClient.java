package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.singleton.Chairman;

public class SingletonClient {

	public static void main(String[] args) {	
		System.out.println(Chairman.getInstance("毛泽东").toString());
		System.out.println(Chairman.getInstance("邓小平").toString());
		System.out.println(Chairman.getInstance("江泽民").toString());
		System.out.println(Chairman.getInstance("胡锦涛").toString());
		System.out.println(Chairman.getInstance("习近平").toString());
	}

}

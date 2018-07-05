package cn.edu.scau.cmi.zhouxudong.domain;

public class JeepCar implements Car {

	@Override
	public void printCarName() {
		// TODO Auto-generated method stub
	    System.out.println("这是吉普车");
	}

	public void run(){
		System.out.println("最高时速80km");
	}
}

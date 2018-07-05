package cn.edu.scau.cmi.zhouxudong.domain;

public class SportCar implements Car {
	@Override
	public void printCarName() {
		// TODO Auto-generated method stub
	    System.out.println("这是运动车");
	}
	
	public void run(){
		System.out.println("最高时速120km");
	}
}

package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.domain.Car;
import cn.edu.scau.cmi.zhouxudong.factoryMethod.JeepCarFactory;

public class FactoryMethodClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = JeepCarFactory.getInstance();
		car1.printCarName();
	}
}

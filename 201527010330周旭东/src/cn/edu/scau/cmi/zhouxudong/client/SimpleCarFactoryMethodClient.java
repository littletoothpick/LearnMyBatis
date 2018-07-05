package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.domain.Car;
import cn.edu.scau.cmi.zhouxudong.simpleFactoryMethod.CarFactory;


public class SimpleCarFactoryMethodClient {

	

	public static void main(String[] args) {
		
		
        
        
		Car car = CarFactory.getInstance("JeepCar"); //µ¥Ò»
         
        car.printCarName();
	
	}

}

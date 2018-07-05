package cn.edu.scau.cmi.zhouxudong.simpleFactoryMethod;

import cn.edu.scau.cmi.zhouxudong.domain.Car;
import cn.edu.scau.cmi.zhouxudong.domain.JeepCar;
import cn.edu.scau.cmi.zhouxudong.domain.SportCar;

public class CarFactory {
	public static final String JeepCar="JeepCar";
	public static final String SportCar="SportCar";
	
    public static Car getInstance(String carTypeString){
 	   
 	   switch (carTypeString) {
		case JeepCar: return new JeepCar();
			
		case SportCar: return new SportCar();

		
		}  
 	   
 	   
		return null;
 	   
    }
}
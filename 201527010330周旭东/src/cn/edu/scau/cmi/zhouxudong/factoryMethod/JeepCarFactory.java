package cn.edu.scau.cmi.zhouxudong.factoryMethod;

import cn.edu.scau.cmi.zhouxudong.domain.Car;
import cn.edu.scau.cmi.zhouxudong.domain.JeepCar;


public class JeepCarFactory  implements CarFactory{
	
	public static Car getInstance(){ 	   
	 	  
		return new JeepCar();					
			
	}  
	
	
       
}
	

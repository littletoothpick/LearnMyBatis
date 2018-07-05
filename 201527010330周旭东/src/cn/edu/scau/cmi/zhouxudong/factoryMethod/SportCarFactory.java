package cn.edu.scau.cmi.zhouxudong.factoryMethod;

import cn.edu.scau.cmi.zhouxudong.domain.Car;
import cn.edu.scau.cmi.zhouxudong.domain.SportCar;


public class SportCarFactory implements CarFactory{
		public static Car getInstance(){ 	   
		 	  
			return new SportCar();					
				
		}  
	       
	}
		


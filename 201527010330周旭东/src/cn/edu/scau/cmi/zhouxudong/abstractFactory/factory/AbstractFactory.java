package cn.edu.scau.cmi.zhouxudong.abstractFactory.factory;

import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.JeepCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.SportCar;

public abstract class AbstractFactory {
     public static AbstractFactory getFactory(String carCompany){
    	 switch (carCompany) {
		case "Benz": return new BenzFactory();		
			
		case "BMW": return new BMWFactory();

		
		}
    	 
    	 return null;
     }
     
     public abstract JeepCar createJeepCar();
     public abstract SportCar createSportCar();
}

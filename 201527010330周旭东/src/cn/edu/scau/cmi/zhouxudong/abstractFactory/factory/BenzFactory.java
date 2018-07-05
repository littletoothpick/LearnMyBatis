package cn.edu.scau.cmi.zhouxudong.abstractFactory.factory;

import cn.edu.scau.cmi.zhouxudong.abstractFactory.domain.BenzJeepCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domain.BenzSportCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.JeepCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.SportCar;

public class BenzFactory extends AbstractFactory{
   
	@Override
   public JeepCar createJeepCar(){
	   
		return new  BenzJeepCar();
   }
	
   public SportCar createSportCar(){
	   return new BenzSportCar();
   }
}

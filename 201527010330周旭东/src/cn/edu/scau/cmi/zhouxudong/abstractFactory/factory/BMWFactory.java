package cn.edu.scau.cmi.zhouxudong.abstractFactory.factory;


import cn.edu.scau.cmi.zhouxudong.abstractFactory.domain.BMWJeepCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domain.BMWSportCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.JeepCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.SportCar;

public class BMWFactory extends AbstractFactory{
	@Override
	   public JeepCar createJeepCar(){
		   
			return new  BMWJeepCar();
	   }
		
	@Override
	   public SportCar createSportCar(){
		   return new BMWSportCar();
	   }
	
}

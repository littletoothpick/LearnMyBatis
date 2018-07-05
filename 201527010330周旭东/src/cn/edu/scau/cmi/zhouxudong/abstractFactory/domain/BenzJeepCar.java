package cn.edu.scau.cmi.zhouxudong.abstractFactory.domain;


import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.JeepCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainInterface.Benz;

public class BenzJeepCar extends JeepCar implements Benz {
  @Override
  public void show() {
		

		System.out.println(Benz.CarCompany+super.name);
		
	}
}

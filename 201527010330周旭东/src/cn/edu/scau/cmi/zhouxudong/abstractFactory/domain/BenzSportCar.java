package cn.edu.scau.cmi.zhouxudong.abstractFactory.domain;

import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.SportCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainInterface.Benz;

public class BenzSportCar extends SportCar implements Benz {
	 @Override
	  public void show() {
			

			System.out.println(Benz.CarCompany+super.name);
			
		}
}

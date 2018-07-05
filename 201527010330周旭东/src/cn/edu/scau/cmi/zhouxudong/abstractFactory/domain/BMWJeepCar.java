package cn.edu.scau.cmi.zhouxudong.abstractFactory.domain;

import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.JeepCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainInterface.BMW;

public class BMWJeepCar extends JeepCar implements BMW {
	 @Override
	  public void show() {
			

			System.out.println(BMW.CarCompany+super.name);
			
		}
}

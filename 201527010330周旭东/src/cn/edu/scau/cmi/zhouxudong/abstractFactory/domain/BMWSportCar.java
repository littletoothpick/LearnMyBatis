package cn.edu.scau.cmi.zhouxudong.abstractFactory.domain;

import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.SportCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainInterface.BMW;

public class BMWSportCar extends SportCar implements BMW {
	 @Override
	  public void show() {
			//System.out.println("这是宝马吉普车");

			System.out.println(BMW.CarCompany+super.name);
			
		}
}

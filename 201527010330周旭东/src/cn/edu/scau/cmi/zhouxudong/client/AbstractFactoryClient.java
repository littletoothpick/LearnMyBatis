package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.abstractFactory.domainAbstractClass.JeepCar;
import cn.edu.scau.cmi.zhouxudong.abstractFactory.factory.AbstractFactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
          AbstractFactory carFactory = AbstractFactory.getFactory("Benz");
          JeepCar jeepCar = carFactory.createJeepCar();
          jeepCar.show();
	}

}

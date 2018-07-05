package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.composite.safe.BiggerOrganization;
import cn.edu.scau.cmi.zhouxudong.composite.safe.Individual;
import cn.edu.scau.cmi.zhouxudong.composite.safe.Organization;

public class CompositeSafeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiggerOrganization ind1 = new Individual("个体1");
		BiggerOrganization ind2 = new Individual("个体2");
		BiggerOrganization ind3 = new Individual("个体3");

		System.out.println(ind1.say());

		Organization org = new Organization();
		org.add(ind1);
		org.add(ind2);
		org.add(ind3);
		org.remove(ind3);
		System.out.println("org组织包括:\n" + org.say());

	}

}

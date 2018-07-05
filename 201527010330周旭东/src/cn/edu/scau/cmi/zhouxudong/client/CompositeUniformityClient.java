package cn.edu.scau.cmi.zhouxudong.client;

import cn.edu.scau.cmi.zhouxudong.composite.uniformity.BiggerOrganization;
import cn.edu.scau.cmi.zhouxudong.composite.uniformity.Individual;
import cn.edu.scau.cmi.zhouxudong.composite.uniformity.Organization;

public class CompositeUniformityClient {

	public static void main(String[] args) {
		BiggerOrganization ind1 = new Individual("个体1");
		BiggerOrganization ind2 = new Individual("个体2");
		BiggerOrganization ind3 = new Individual("个体3");
		
		ind1.add(ind2);
		ind1.remove(ind2);
		System.out.println("\n");
		Organization org = new Organization();
		org.add(ind1);
		org.add(ind2);
		org.add(ind3);
		org.remove(ind3);
		System.out.println("org组织包括:\n"+org.say());
   
	}

}

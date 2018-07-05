package cn.edu.scau.cmi.zhouxudong.composite.uniformity;

import java.util.ArrayList;
import java.util.Iterator;

public class Organization extends BiggerOrganization {

	private ArrayList<BiggerOrganization> individualList;
	private String saying = "";

	public Organization() {
		individualList = new ArrayList<BiggerOrganization>();
	}   

	public void add(BiggerOrganization individual) {
		if (individual != null) {
			individualList.add(individual);
		}
	}

	public void remove(BiggerOrganization individual) {
		if (individual != null) {
			individualList.remove(individual);
		}
	}

	public Iterator<BiggerOrganization> elements() {
		return individualList.iterator();
	}

	@Override
	public String say() {
		int len = individualList.size();
		for (int i = 0; i < len; i++) {
			BiggerOrganization ind = individualList.get(i);
			saying = saying + ind.say() + "\n";
		}
		return saying;

	}

	public int getSize() {
		return individualList.size();
	}

}

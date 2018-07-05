package cn.edu.scau.cmi.zhouxudong.composite.safe;

public class Individual extends BiggerOrganization {
	private String string = "¸öÌå";

	public Individual() {

	}

	public Individual(String string) {
		this.string = string;
	}

	@Override
	public String say() {
		return string;
	}

}

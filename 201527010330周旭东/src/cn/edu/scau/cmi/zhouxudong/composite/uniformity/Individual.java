package cn.edu.scau.cmi.zhouxudong.composite.uniformity;

public class Individual extends BiggerOrganization {

	private String string = "个体";

	public Individual() {

	}

	public Individual(String string) {
		this.string = string;
	}

	@Override
	public String say() {
		return string;
	}

	// add方法无效
	@Override
	public void add(BiggerOrganization individual) {
		// TODO Auto-generated method stub
		System.out.println("个体不支持add操作");

	}

	@Override
	public void remove(BiggerOrganization individual) {
		// TODO Auto-generated method stub
		System.out.println("个体不支持remove操作");
	}

}

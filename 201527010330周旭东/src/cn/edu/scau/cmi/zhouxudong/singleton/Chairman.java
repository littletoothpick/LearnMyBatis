package cn.edu.scau.cmi.zhouxudong.singleton;

public class Chairman {

	private static Chairman chairman;
	private String chairmanName =null;
	private Chairman() {
	}
    private Chairman(String name){
    	chairmanName = name;
    }
	public static Chairman getInstance(String name) {
		if (chairman == null && !name.equals(null)) {
			chairman = new Chairman(name);
			return chairman;
		} else
			return chairman;
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "我是"+chairmanName +"主席";
    }

}

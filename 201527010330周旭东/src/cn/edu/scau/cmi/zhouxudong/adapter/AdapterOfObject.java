package cn.edu.scau.cmi.zhouxudong.adapter;

public class AdapterOfObject  implements Target{
    
	private Adaptee adaptee ;
	private Adaptee2 adaptee2 ;
	public AdapterOfObject() {
		// TODO Auto-generated constructor stub
	}
    
	public void operation1(){
		adaptee.operation1();
	}
	
	public void operation2(){
		adaptee2.operation2();
	}
	
}

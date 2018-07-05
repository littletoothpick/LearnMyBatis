package cn.edu.scau.cmi.zhouxudong.singleton;

import java.util.Random;
public class Marshal {
    private String marshalName = null;
	
	private Marshal(String name){marshalName = name;}
	
	private Marshal(){}
	
	private static Marshal[] array ={
			 new Marshal("ÖìµÂ"),new Marshal("ÅíµÂ»³"),new Marshal("ÁÖ±ë"),new Marshal("ÂŞÈÙ»¸"),new Marshal("Ò¶½£Ó¢"),
			 new Marshal("Áõ²®³Ğ"),new Marshal("ºØÁú"),new Marshal("³ÂÒã"),new Marshal("ĞìÏòÇ°"),new Marshal("ÄôÈÙÕé")
					
			};
	public static Marshal getInstance(){
		return array[random()];
	}
	
	
	public static int random(){
		 Random random = new Random();
		 int value = Math.abs(random.nextInt());
		 value =value%10;
		 return value;
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ÎÒÊÇ"+marshalName+"ÔªË§";
	}
	
	
}

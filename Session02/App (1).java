import p1.*;
//import p2.Class2;
//import p2.Class3;
import p2.*; // this astrict use for import all the classes under package 2
import p1.p3.*;


class App{
	public static void main(String[] ar){
		
		MyClass mc=new MyClass();
		mc.display();
		
		Class2 c2=new Class2();
		c2.display();
		
		Class3 c3=new Class3();
		c3.display();
		
		Class4 c4=new Class4();
		c4.display();
	}
}

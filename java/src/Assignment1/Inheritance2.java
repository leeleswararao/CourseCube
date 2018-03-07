package Assignment1;

class Car2{
	static void m1(){
		String color="Red";
		 String enginetype="Honda";
		 System.out.println(color+","+enginetype);
	}
}
class HondaCar2 extends Car2{
	static void m2(){
	 String color="Black";
	 String enginetype="Benz";
	 System.out.println(color+","+enginetype);
}
}
class HondaCityCar1 extends Car2{
	void m3(){
	String color="Yellow";
	String enginetype="HondaCity";
	System.out.println(color+","+enginetype);
	HondaCar2.m2();
	Car2.m1();
}
}
//Hierarchical inheritance
public class Inheritance2 {
	public static void main(String[] args) {
		HondaCityCar1 d=new HondaCityCar1();
		d.m3();
		
		
	}
}

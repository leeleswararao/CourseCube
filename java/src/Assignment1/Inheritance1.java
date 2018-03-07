package Assignment1;
class Car1{
	static void m1(){
	String color="Red";
	 String enginetype="Honda";
	 System.out.println(color+","+enginetype);
}
}
class HondaCar1 extends Car1{
	static void m2(){
	 String color="Black";
	 String enginetype="Benz";
	 System.out.println(color+","+enginetype);
}
}
class HondaCityCar extends HondaCar{
	void m3(){
	String color="Yellow";
	String enginetype="HondaCity";
	System.out.println(color+","+enginetype);
	HondaCar1.m2();
	Car1.m1();
}
}
//Multilevel Inheritance
public class Inheritance1 {
public static void main(String[] args) {
	HondaCityCar d=new HondaCityCar();
	d.m3();
}
}

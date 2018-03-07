package Assignment1;

class Car {
static String color="Black";
static String enginetype="Honda";
}
class HondaCar extends Car{
String color="White";
String enginetype="Benz";
}
//simple inheritance
public class lnheritance{
public static void main(String[] args) {
HondaCar c=new HondaCar();
System.out.println(c.color);
System.out.println(c.enginetype);
System.out.println(Car.color);
System.out.println(Car.enginetype);
}
}

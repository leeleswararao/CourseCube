package lee;
class Lab5{
public static void main(String[]args){
Hello h = new Hello();
byte b=20;
int c=h.add(10,b);
System.out.println(c);
h.add(b, b);
}
}
class Hello{
	byte add(int a,byte b){
		System.out.println("add(int,byte)");
		return 30;
	}
}

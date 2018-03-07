package Assignment1;
//final class ,Method and variables
public final class Hello {
final int a=10;
public static void main(String[] args) {
	Hello h=new Hello();
	System.out.println(h.a);
	Student3 s=new Student3();
	int a=s.m1(20);
	System.out.println(a);
}
}
class Student3{
 final  int m1(int b){
	 System.out.println("Student3->int m1(int b)");
	return b;
	}
}


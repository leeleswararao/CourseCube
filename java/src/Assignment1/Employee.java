package Assignment1;

 class Hello5 {
 int add(int a,int b){
	System.out.println("show (int a,int b)");
	return  a+b;
}
int add(int a,int b,int c){
	System.out.println("Show(int a,int b,intc)");
	return a+b+c;
}
 }
 //overloading
public class Employee{
public static void main(String[] args) {
Hello5 h=new Hello5();
int a=h.add(10, 20);
System.out.println(a);
int b=h.add(10, 20, 30);
System.out.println(b);
}
}


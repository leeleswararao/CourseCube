package Assignment1;

public class Student {
/*static int a=10;
static int b=20;
static int c=30;
public static void main(){
	int a=40;
	int b=50;
	int c=60;
	System.out.println(a+","+b+","+c); 
}
public static void main(String[] args) {
	Lab1 l=new Lab1();
	System.out.println(l.a);
	System.out.println(l.b);
	System.out.println(l.c);
	 l.main();
}*/
	static int counter;
	
	public Student(){
		counter++;
		
	}
	
	public static void main(String[] args) {
		Student a = new Student();
		Student a1 = new Student();
		Student a2 = new Student();
		Student a3 = new Student();
		Student a4 = new Student();	
		System.out.println(counter);
	}
}


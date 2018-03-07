package Assignment1;

class Hi{
	 public int m1(int a){
		System.out.println(" Hi->m1()");
		return a;
		}
}
class Student5 extends Hi{
	public  int m1(int a){
		System.out.println("Student->m1()");
		return a;
	}
}
//overriding example
public class Student1 {
public static void main(String[] args) {
	Student5 st=new Student5();
	int a=st.m1(10);
	System.out.println(a);
	int b=st.m1(20);
	System.out.println(b);
	
}
}

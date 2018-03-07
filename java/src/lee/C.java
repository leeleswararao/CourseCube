package lee;


/*interface A{
	 void add();
		
}

interface B {
	 void show();
}

public class C implements A,B {
	public void add(){
System.out.println("Hello");
	}
	public void show(){
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		C c=new C();
		c.add();
		c.show();
	}
}*/
public class C{
	public static void main(String[] args) {
		
		Student20 st=new Student20(101,"Sri");
	st.main();
		}
	}
class Student20{
	int id;
	String name;
	Student20(int id,String name){
		id=id;
		name=name;
		System.out.println(id+","+name);
		
	}
	public void main(){
		int id=102;
		String name="charan";
		System.out.println(id+","+name);
		System.out.println(this.id);
		System.out.println(this.name);
		
	}
}

 
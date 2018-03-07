package lee;
import java.util.*;

public class Lab{
public static void main(String[]args){
	TreeSet st = new TreeSet();
	st.add("lee");
	st.add("prasad");
	st.add("ven");
	st.add("charan");
	System.out.println(st);
	
	Iterator it=st.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}

class Student implements Comparable{
int sid;
String name;
Student(int sid,String name){
	this.sid=sid;
	this.name=name;
	}

public int compareTo(Object obj){
if(obj instanceof Student){
	Student st=(Student)obj;
	return this.sid-st.sid;
}
return 0;
}

public String toString() {
	return  sid+ "/t" + name ;
}

}


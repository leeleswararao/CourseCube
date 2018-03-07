package lee;

import java.util.*;

public class Lab6 {
public static void main(String[] args) {
	Vector v = new Vector();
	v.addElement("Sri");
	v.addElement("lee");
	v.addElement("ven");
	v.addElement("mani");
	System.out.println(v);
	Enumeration e=v.elements();
	while(e.hasMoreElements()){
	Object obj=(Object)e.nextElement();
	System.out.println(obj);
	
	}
}
}


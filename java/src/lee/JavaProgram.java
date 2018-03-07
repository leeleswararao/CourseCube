package lee;

//import java.util.Scanner;

import java.util.Scanner;

public class JavaProgram {
/*public static void main(String[] args) {
	
	for(int i=1;i<=10;i++){
		for(int j=1;j<=10;j++){
	System.out.println(i+"*"+j+"="+i*j);
		//System.out.println("1*"+i+"="+1*i);
	}
}
}*/

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String Reverse value");
			String str=sc.next();
			String rev=" ";
			for(int i=str.length()-1;i>=0;i--){
				rev=rev+str.charAt(i);
			}
			System.out.println(" String after reversing:"+rev);
		}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find the list of prime numbers");
		int num=sc.nextInt();
		for(int i=1;i<num;i++){
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				System.out.println(i);
			}
		}
	}
	/*public static void main(String[] args) {
		String str="Ramanjia";
		for(int i=0;i<str.length()-1;i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(j)==str.charAt(i)){
					System.out.println(str.charAt(j));
					break;
					//System.out.println(j);
				}
			}
		}
	}*/
	
	}
	



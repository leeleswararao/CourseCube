package lee;
import java.util.Scanner;
public class Test1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a and b value");
	int a=sc.nextInt();
	int b =sc.nextInt();
	int quotient=0;
	while(a>=b){
		a-=b;
		quotient++;
	}
		System.out.println("Quotient is"+quotient);
	}
}


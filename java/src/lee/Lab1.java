package lee;
import java.util.Scanner;
	public class Lab1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st value :");
		int x = sc.nextInt();
		System.out.print("Enter 2nd value :");
		int y = sc.nextInt();
		System.out.print("Enter 3rd value :");
		int z = sc.nextInt();
		int max=0;
		if (x > y && x > z)		max = x;
		else if (y > z)			max = y;
		else			        max = z;
		System.out.println("Max :" + max);

	}
}
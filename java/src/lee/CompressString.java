package lee;

public class CompressString {
/*public int calulateSum(){
	int []a={10,50,30};
	int sum=0;
	for(int arr:a){
		sum=sum+arr;
	}
	return sum;
}
public static void main(String[] args) {
	 CompressString obj=new  CompressString();
	 System.out.println(obj.calulateSum());
}*/
	/*public static void main(String[] args) {
		int []arr3={10,50,30,10};
		int []arr4={20,60,50};
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr4.length;j++){
				if(arr3[i]==arr4[j]){
					System.out.println(arr3[i]+",");
				}
			}
		}
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		int number=sc.nextInt();
		int first=0;
		int second=1;
		//System.out.println("first" +first);
		//System.out.println("second" +second);
		int third=first+second;
		//System.out.println("third" +third);
	for(int i=0;i<number;i++){
		first=second;
		second=third;
		third=first;
		System.out.println(i);
		
	}
	System.out.println();
	}*/
	/*public static void main(String[] args) {
		String s="aabbccdef";
		Set<Character> set=new LinkedHashSet<Character>();
		for(char c:s.toCharArray())
		{
		    set.add(Character.valueOf(c));
		}
		System.out.println(set);
		
}*/
	/*public static void main(String[] args) {
		int[]a={10,20,50};
		int[]b={10,30,50};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]+",");
				}
			}
		}
	}*/
	/*public static void main(String[] args) {
		int first=0;
		int second=1;
		System.out.println(first+" ");
		System.out.println(second+" ");
		for(int i=0;i<10;i++){
			int third=first+second;
			System.out.println(third+" ");
		
		first=second;
		second=third;
	}
	}*/
	public static void main(String[] args) {
		String str=new String("leeleswararao");
		String str1=new String();
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str1.length();j++){
				if(str.charAt(i)!=str1.charAt(j)){
					str1=str1+str.charAt(i);
				}
			}
		}
		System.out.println(str1);
	}
	}


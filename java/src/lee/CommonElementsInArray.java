package lee;

public class CommonElementsInArray {
public static void main(String[] args) {
	int []arr1={10,20,30,20,30};
	int []arr2={1,80,30,20,30};
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr2.length;j++){
			if(arr1[i]==arr2[j]){
				System.out.println(arr1[j]+",");
			}
		}
	}
}
}

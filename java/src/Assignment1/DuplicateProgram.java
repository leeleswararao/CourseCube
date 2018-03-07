package Assignment1;

public class DuplicateProgram {
static int counter;
public DuplicateProgram(){
	counter++;
}
public static void main(String[] args) {
	DuplicateProgram n=new DuplicateProgram();
	DuplicateProgram n1=new DuplicateProgram();
	DuplicateProgram n2=new DuplicateProgram();
	DuplicateProgram n3=new DuplicateProgram();
	System.out.println(counter);
}
}

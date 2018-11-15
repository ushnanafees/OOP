import java.util.*;

abstract class myclass {
	abstract int mysum(int n1, int n2);
	abstract int mysub(int n1, int n2);
	abstract int mymul(int n1, int n2);
	abstract int mydiv(int n1, int n2);
}

class myextclass extends myclass {

public int mysum(int n1, int n2) {
	return n1+n2;
}
public int mysub(int n1, int n2) {
	return n1 - n2;
}
public int mymul(int n1, int n2) {
	return n1 * n2;
}

public int mydiv(int n1, int n2) {
	return n1 / n2;
}
}

class abstractushna {

public static void main(String []args) {

	myextclass mc = new myextclass();
	Scanner sc = new Scanner(System.in); 		//constructor for input
	System.out.print("Enter 1st number:");
	int n1 = sc.nextInt();
	System.out.print("Enter 2nd number:");
	int n2 = sc.nextInt();
	System.out.println("Addition:"+ mc.mysum(n1,n2));
	System.out.println("Subtraction:"+ mc.mysub(n1,n2));
	System.out.println("Multiplication:" + mc.mymul(n1,n2));
	System.out.println("Division:" + mc.mydiv(n1,n2));
a	
} 
} 
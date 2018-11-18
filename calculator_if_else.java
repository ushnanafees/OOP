import java.util.*;

class myname {
int n1, n2;
Scanner sc = new Scanner(System.in);	
	public myname() {
	System.out.print("Enter 1st number:");
	n1 = sc.nextInt();
	System.out.print("Enter 2nd number:");
	n2 = sc.nextInt(); 
	}
public void mysum() {
	System.out.print("Result of Addition:" + (n1 + n2));
	System.out.println("***********************************");
} 
public void mysub() {
	System.out.print("Result of Subtraction:" + (n1 - n2));
	System.out.println("***********************************");
}
public void mymul() {
	System.out.print("Result of Multiplication:" + (n1 * n2));
	System.out.println("***********************************");
}
public void mydiv() {
	System.out.print("Result of division:" + (n1 / n2));
	System.out.println("***********************************");
}
}

class newcalculator {						//Main class
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	myname mn = new myname();
	System.out.print("Enter + for Addition \nEnter - for Subtraction \nEnter * for Multiplication \nEnter / for Division \n");
	String op = sc.next();
	if (op.equals("+")) {
	mn.mysum();
}	else if (op.equals("-")) {
	mn.mysub();
}
	else if (op.equals("*")) {
	mn.mymul();
}
	else if (op.equals("/")) {
	mn.mydiv();
}



//mn.mysum();
	//mn.mysub();
	//mn.mymul();
	//mn.mydiv();

}
}
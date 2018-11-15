import java.util.*;

interface calculator {
	public int add(int n1, int n2);
	public int sub(int n1, int n2);
	public int mul(int n1, int n2);
	public int div(int n1, int n2);
}

interface biodata {
	public String yname(String n);
	public String cnic(String c);
	public String bday(String bd);
}

class mycal implements calculator {
	public int add(int n1, int n2) {
		return n1 + n2;
}
	public int sub(int n1, int n2) {
		return n1 - n2;
}
	public int mul(int n1, int n2) {
		return n1 * n2;
}
	public int div(int n1, int n2) {
		return n1 / n2;
}
}

class mybio implements biodata {
	public String yname(String n) {
		return n;
}
	public String cnic(String c) {
		return c;
}
	public String bday(String bd) {
		return bd;
}
	
}

class BioData_Interface {
	public static void main(String []args) {
	mycal obj1 = new mycal();	
	mybio obj2 = new mybio();
	Scanner sc = new Scanner(System.in);
	System.out.println("----------------- Input--------------------------------");
	System.out.print("Enter 1st number: ");
	int n1 = sc.nextInt();
	System.out.print("Enter 2nd number: ");
	int n2 = sc.nextInt();
	System.out.print("Enter your name: ");
	String n = sc.next();
	System.out.print("Enter your cnic: ");
	String c = sc.next();
	System.out.print("Enter your birthday: ");
	String bd = sc.next();

	System.out.println("--------------- Output ------------------------------");
	System.out.println("");
	System.out.println("--------------- CALCULATION -------------------------");
	System.out.println("Addition: " + obj1.add(n1,n2));
	System.out.println("Subtraction: " + obj1.sub(n1, n2)); 
	System.out.println("Multiplication: " + obj1.mul(n1, n2));
	System.out.println("Division: " + obj1.div(n1, n2));
	
	System.out.println("--------------- BIO DATA------------------------------");
	System.out.println("Your NAME is: " + obj2.yname(n));
	System.out.println("Your CNIC is: " + obj2.cnic(c));
	System.out.println("Your B.DAY is: " + obj2.bday(bd));
	
}
}
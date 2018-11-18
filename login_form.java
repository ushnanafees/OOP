import java.util.*;

class bank {

public bank() {
System.out.println("***************** Welcome to UBL Portal *************************");
System.out.println("Please Login to Continue...");
System.out.println();

}
}

class Admin extends bank {
public void admin() {
	System.out.println("********** Login For Admin ****************");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter ID: ");
	String id = sc.next();
	System.out.print("Enter PASSWORD: ");
	String pwd = sc.next();
	if (id.equals("user25") && pwd.equals("user")) {
	System.out.println("Login Successfully For Admin");
	System.out.println();	
}
	else
	{
	System.out.println("Please Enter Correct Credentials");
	System.out.println();	
	
} 
}
}

class Customer{
public void customer() {
	Scanner sc = new Scanner(System.in);
	System.out.println("********* Login For Customer ***********");
	System.out.print("Enter Customer ID: ");
	int c_id = sc.nextInt();
	System.out.print("Enter Customer PASSWORD: ");
	String c_pwd = sc.next();
	System.out.print("Login Successfully");
} 

}
class login_form {
	public static void main(String []args) {
	Admin obj = new Admin();
	Customer obj1 = new Customer();
	obj.admin();
	obj1.customer();
}
}

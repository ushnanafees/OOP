import java.util.*;

class Employee_Data {
private int Emp_id;
private String Emp_name;
private int Emp_Age;

public void setEmp_ID (int newValue) {
	Emp_id = newValue;
}
public int getEmp_ID() {
	return Emp_id;
}

public void setEmp_NAME (String name) {
	Emp_name = name;
}
public String getEmp_NAME() {
	return Emp_name;
}

public void setEmp_AGE (int age) {
	Emp_Age = age;
}
public int getEmp_AGE() {
	return Emp_Age;
}
	
Scanner sc = new Scanner(System.in);
	public Employee_Data() {
	System.out.print("Enter your ID: ");
	Emp_id = sc.nextInt();
	System.out.print("Enter your Name: ");
	Emp_name = sc.next();
	System.out.print("Enter your Age: ");
	Emp_Age = sc.nextInt();
}
}

class Employe_Record {
	
	public static void main(String []args) {
	Employee_Data obj = new Employee_Data();
	System.out.println("***********************************");
	System.out.println("Your id is:" + obj.getEmp_ID());
	System.out.println("Your name is: " + obj.getEmp_NAME());
	System.out.println("Your age is: " + obj.getEmp_AGE());

}
}
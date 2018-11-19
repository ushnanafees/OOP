class Overload_Demo {
public void overload() {
	System.out.println("NO parameter");	
}
public void overload(int n1) {
	System.out.println("One Parameter " + n1);
	
}

public void overload(int n1, int n2) {
	System.out.println("Two Parameters " + n1 + " " + n2);
	
}

public void overload(int n1, int n2, int n3) {
	System.out.println("Three Parameters " + n1 + " " + n2 + " " + n3);
	
}

public void overload(String name) {
	System.out.println("String " + name);
	
}
}

class Overload_Example {
public static void main(String []args) {
	Overload_Demo obj = new Overload_Demo();
	obj.overload();
	obj.overload(3);
	obj.overload(3,5);
	obj.overload(3,5,9);
	obj.overload("ushna");

}

}
// --------------------------- Parent CLass -----------------------------
class College {								
private String collegeName = "PECHS";						//private variables
private String designation = "Teaching";					// private variables

public void setDesignation(String desig) {					// set method for private designation variable
	designation = desig;
}
public String getDesignation() {						// get method for private designation variable
	return designation;
}

public void setCollegename(String c_name) {					// set method for private collegeName variable			
	collegeName = c_name; 
}
public String getCollegename() {						// get method for private collegeName variable
	return collegeName;
}
}

// ------------------------ Child class -------------------------------
class MathTeacher extends College {						// inheritance (MathTeacher class inherit College class)
String mainSubject = " Maths";							
public void M_Teacher() {							// Method of MathTeacher class
	System.out.print("My College is " + getCollegename());
	System.out.println(" and I am " + getDesignation()  +   mainSubject); 
}
}

// --------------------- Child class -----------------------------------
class PhysicsTeacher extends College {						//inheritance (PhysicsTeacher class inherit College class)
String mainSubject = " Physics";
public void P_Teacher() {							// Method of PhysicsTeacher class
	System.out.print("My College is " + getCollegename());
	System.out.println(" and I am " + getDesignation()  + mainSubject);
	
}
}


// -------------------------- Main class --------------------------------------
class get_set_College {								// Main class
public static void main(String []args) {
	MathTeacher obj = new MathTeacher();					// constructor for MathTeacher class
	obj.M_Teacher();					
	PhysicsTeacher obj1 = new PhysicsTeacher();				// constructor for PhysicsTeacher class
	obj1.P_Teacher();
}
}
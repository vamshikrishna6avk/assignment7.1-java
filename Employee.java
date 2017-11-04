package package1;//created package as package1
//here we create the class Employee
public class Employee {

	 int id = 10;//initializng id
	 String name="Vamshi";//taking name 
	 //here we create the protected method
	protected void display(){//protected member is accessible within all classes in the same package and within subclasses in other packages
		System.out.println(id);
		System.out.println(name);//prints
	}

   }
package package2;//created another package as package2
//here we import the package 1
import package1.Employee;

//here we extends the class emplyoee
public class Department extends Employee{

	public static void main(String[] args) {
		Department emp = new Department();
		//Here i want to call the protected method
		emp.display();//displays
				
	}
}
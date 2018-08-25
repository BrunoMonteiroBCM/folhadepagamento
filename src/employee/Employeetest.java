package employee;
import java.util.Scanner;


public class Employeetest {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in); 
		
		Employee Employee = new Employee();
		
		System.out.println("Please, insert the following informations about the new Employee.");

		System.out.println("Name");
		String name = input.next();
		Employee.setName(name);
		
		System.out.println("Adress");
		String adress = input.next();
		Employee.setName(adress);
		
		System.out.println("Insert the type of the new Employee.\nThe type must be Salary, Hourly or Comissioned.");
		String employeetype = input.next();
		Employee.setName(employeetype);
		
		
		int typeofemployee = 1;
		
		switch (typeofemployee){
		
		case 1:
			employeetype = "salary";
		case 2:
			employeetype = "hourly";
		case 3:
			employeetype = "commissioned";
		
		}
	}

}

package q3;

import java.util.Scanner;

class Employee {

	private float basicSalary;
	private float hRA;
	private float dA;
	private float pF;
	private float netSalary;
	private float grossSalary;

	Employee(Float basicSalary) {
		this.basicSalary = basicSalary;
	}

	
	

	void show() {
		System.out.println("Basic Salary\t" + basicSalary + "  " + "PF\t" + pF);

		System.out.println("HRA\t" + hRA);
		System.out.println("DA\t" + dA);

		System.out.println("Gross Salary\t" + grossSalary + "  " + "Net Salary\t" + netSalary);

	}

	
	
	
}





public class Salary {

	public static void main(String[] args) {

		
		float basicSalary;
		System.out.println("Enter Basic Salary of the Employee\n");

		Scanner scanner = new Scanner(System.in);
		basicSalary = scanner.nextFloat();

		Employee employee = new Employee(basicSalary);

   employee.show();

	}

}

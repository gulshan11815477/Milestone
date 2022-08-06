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

	void calculate() {
		hRA = (float) (basicSalary * 0.1);
		dA = (float) (basicSalary * 0.1);
		pF = (float) (basicSalary * 0.1);

		netSalary = basicSalary + hRA + dA - pF;
		grossSalary = basicSalary + hRA + dA + pF;

	}

	void show() {
		System.out.println("Basic Salary\t" + basicSalary + "  " + "PF\t" + pF);

		System.out.println("HRA\t" + hRA);
		System.out.println("DA\t" + dA);

		System.out.println("Gross Salary\t" + grossSalary + "  " + "Net Salary\t" + netSalary);

	}
	
	
	
	
	boolean check() {
		if (basicSalary < 1)
			return false;
		else
			return true;
	}

}

public class Salary {

	public static void main(String[] args) {

		float basicSalary;
		System.out.println("Enter Basic Salary of the Employee\n");

		Scanner scanner = new Scanner(System.in);
		basicSalary = scanner.nextFloat();

		Employee employee = new Employee(basicSalary);
		
		
		if (!employee.check()) {

			System.out.println("Try again!enter basic salary greater than 1");
			System.exit(0);
			
		}
		

		employee.calculate();
		employee.show();

	}

}

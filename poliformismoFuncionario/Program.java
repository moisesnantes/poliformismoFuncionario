package poliformismoFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employee: ");
		int n = sc.nextInt();
		
		for (int i=1;i<n;i++) {
			System.out.println("Employee #" + i + "Data:");
			System.out.print("Outsorced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hour: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerhour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Addiontal charge: ");
				double additionalEmployee = sc.nextDouble();
				list.add(new OutsourcedEmployee (name, hours, valuePerhour,additionalEmployee));
			}
			else {
				list.add(new Employee(name,hours,valuePerhour));
			}
			System.out.println();
			System.out.println("PAYMENTS:");
			for (Employee emp : list) {
				System.out.println(emp.getName()+ " - $" + String.format("%.2f", emp.payment()));
			}
		}
		
		sc.close();

	}

}

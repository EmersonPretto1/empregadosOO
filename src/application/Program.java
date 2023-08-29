package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Nome do departamento: ");
		String nameDepartment = sc.next();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		int phone = sc.nextInt();
		
		Department dept = new Department();
		
		System.out.println("Quantos funcionários tem o departamento: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionario " + i + ":" );
			System.out.print("Nome: ");
			String empName = sc.next();
			System.out.print("Salário: ");
			double empSalary = sc.nextDouble();
			
			Employee employee = new Employee(empName, empSalary);
			dept.addEmployee(employee);
			
		}
		
		
			
		dept.showReport();
		
			
		
		
		
		
		
	}

}

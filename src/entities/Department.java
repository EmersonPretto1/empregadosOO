package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Integer payDay;
	
	private Address address;
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
		
	}

	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}
	


	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployee() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public Double payRoll() {
		double totalSalary = 0.0;
		for(Employee employee : employees) {
			totalSalary += employee.getSalary();
			
		}
		return totalSalary;
	}
	
	public void showReport() {
		System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println("Departamento " + name + " = R$" + payRoll());
        System.out.println("Pagamento realizado no dia " + payDay);
        System.out.println("Funcionários:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
	}
	

}

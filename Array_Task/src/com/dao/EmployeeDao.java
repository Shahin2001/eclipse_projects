package com.dao;

import com.entity.Employee;

public class EmployeeDao {

	Employee e1 = new Employee(4, "Ravi Dubey", "Developer", 45000);
	Employee e2 = new Employee(2, "Anita Verma", "Developer", 47000);
	Employee e3 = new Employee(1, "Sunil Singh", "Developer", 46000);
	Employee e4 = new Employee(3, "Suman Sharma", "Developer", 48000);
	Employee e5 = new Employee(5, "Rahul Jain", "Tester", 40000);
	Employee e6 = new Employee(7, "Nisha Gupta", "Tester", 42000);
	Employee e7 = new Employee(9, "Amit Kumar", "Tester", 41000);
	Employee e8 = new Employee(8, "Rajesh Malhotra", "CEO", 100000);
	Employee e9 = new Employee(6, "Kavita Nair", "HR", 50000);
	Employee e10 = new Employee(10, "Vikram Singh", "Manager", 60000);

	// Employee[] emp = new Employee[10];
	Employee[] emp = { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 };

	public void showAllEmp() {
		for (Employee e : emp) {
			System.out.println(e);
		}

	}

	public Employee showById(int id) {
		for (Employee emp : emp) {
			if (emp.getId() == id) {
				return emp;
			}
			
		}
		return null;
	}

	public Employee empMaxSal() {
		Employee max = emp[0];
		for (Employee e:emp) {
			if (e.getSal() > max.getSal()) {
				max = e;
			}

		}
		return max;

	}

	public Employee empMinSal() {
		Employee min = emp[0];
		for (Employee e:emp) {
			if (e.getSal() < min.getSal()) {
				min = e;
			}

		}
		return min;

	}

	public void empByRole(String role) {
		for (Employee e : emp) {
			if (e.getRole().equalsIgnoreCase(role)) {
				System.out.println(e);
			}
		}

	}

	public Employee[] empAsc() {
		Employee temp;
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getId() > emp[j].getId()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
		return emp;
	}

	public Employee[] empDesc() {
		Employee temp;
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getId() < emp[j].getId()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
		return emp;
	}

}

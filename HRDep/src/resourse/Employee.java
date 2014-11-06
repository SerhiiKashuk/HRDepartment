package resourse;

public class Employee {

	private String name;
	private String surName;
	private int year;
	private double salary;
	private int id = -1;

	public Employee() {

	}

	public Employee(String name, String surName, double salary) {
		this.name = name;
		this.surName = surName;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getYear() {
		return year;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;

	}
}


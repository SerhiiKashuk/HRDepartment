package resourse;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Employee {

	private int stavka;
	private  int id = -1;

	public  int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		/*System.out.println("Enter Id ");
		Scanner sc = new Scanner(System.in);
	
		int line = sc.nextInt();
		return line;*/
	}

	public int getStavka() {
		return stavka;
	}

	public void setStavka(int stavka) {
		this.stavka = stavka;
	}

	private String name;
	private String surName;
	private int year;
	private int salary;
	public Employee(){
		
	}

	public Employee(String name, String surName, int year) {
		this.name = name;
		this.surName = surName;
		this.year = year;

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

	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}


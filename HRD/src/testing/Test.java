/**
 * 
 */
package testing;

import java.awt.EventQueue;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;

import resourse.ChangeValues;
import resourse.Employee;
import resourse.Function;
import resourse.HR;
import resourse.HRDepartment;
import resourse.Updating;



public class Test {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
	
	/*	Employee man = new Employee("Sergii", "Kashuk", 7777);
		Employee man1 = new Employee("Jenny", "Ievgeniia", 2106);
		Employee man2 = new Employee("Alex", "Georgia", 3333);
		ArrayList<Employee> al = new ArrayList<>();
		al.add(man);
		al.add(man1);
		al.add(man2);
	
	
		HR human = HR.getHR();
	    for (Employee employee : al) {
	    	human.saveEmployee(employee);
	    }*/
	
	
	
		//System.out.println(Function.getRecordById(human.getStorage(), 2, HR.getSeparator()));
	
		//Employee staff = human.getEmployeeByid(73);
		/*System.out.println(human.saveEmployee(staff));*/
	   // human.updateData(2,3);
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HRDepartment frame = new HRDepartment();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	
	    	/* Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
	    	 String datbas1 = "jdbc:odbc:Driver="
	    	 		+ "{Microsoft Access Driver (*.mdb, *.accdb)}"
	    	 		+ ";DBQ=d:\\Study\\Java\\MyProjects\\Employee.mdb;";
	
	    	 Connection conn = DriverManager.getConnection(datbas1, "", "");
	
	    	 Statement sttable = conn.createStatement();
	    	 sttable.executeUpdate("CREATE TABLE Employee(ID INT ,Name VARCHAR(10),"
	    	 		+ "SurName VARCHAR(10),Amount INT)");
	    	 sttable.close();
	
	    	 Statement stinsert1 = conn.createStatement();
	    	 stinsert1.executeUpdate("INSERT INTO Employee VALUES(null,null)");
	    	 stinsert1.close();
	
	    	 Statement stinsert2 = conn.createStatement();
	    	 stinsert2.executeUpdate("INSERT INTO Employee VALUES('Pumpkin', 1)");
	    	 stinsert2.close();
	
	    	 Statement stinsert3 = conn.createStatement();
	    	 stinsert3.executeUpdate("INSERT INTO Employee VALUES(null, null)");
	    	 stinsert3.close();
	
	    	 Statement stresult = conn.createStatement();
	    	 ResultSet fruit = stresult.executeQuery("SELECT * FROM Employee");
	    	 while (fruit.next()) {
	    	 System.out.println(fruit.getString("Name") + ", "
	    	 + fruit.getInt("Amount"));
	    	 }
	
	    	 fruit.close();
	
	    	 conn.close();
	    	 */
	    	 }

}

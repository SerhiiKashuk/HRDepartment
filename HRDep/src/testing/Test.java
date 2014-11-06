package testing;

import java.awt.EventQueue;
import java.sql.Connection;

import GUIViewer.HRDepartment;
import resourse.DBConnection;



public class Test {

	public static void main(String[] args) {

		try {
			Connection connection = DBConnection.getConnection();
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}

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

	}

}

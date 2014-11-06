package resourse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HR {
	private static HR recruter;
	private static BufferedWriter bw;
	public static File storage;
	public static String separator;
	private static String path;
	private static String insertVal;
	private BufferedReader br;
	public static int numberID = 0;

	public static void setInsertVal(String insertVal) {
		HR.insertVal = insertVal;
	}

	public static String getInsertVal() {
		return insertVal;
	}

	public static String getSeparator() {
		return separator;

	};

	private HR() {
		HR.separator = ";";
		path = "D://Study//Java//HRD//storage//employees.csv";

		storage = new File(path);

		try {

			if (!storage.exists()) {
				storage.createNewFile();
			}

			bw = new BufferedWriter(new FileWriter(storage, true));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static HR getHR() {
		if (recruter == null) {
			recruter = new HR();
		}
		return recruter;
	}

	public boolean saveEmployee(Employee emp) {

		try {

			if (storage.length() > 0) {
				bw.newLine();
			}
			bw.write(

			(emp.getId() == -1 ? Function.getLastId(storage) + 1 : emp.getId())

			+ HR.separator

			+ emp.getName() + HR.separator + emp.getSurName() + HR.separator + emp.getSalary());

			bw.flush();

		} catch (IOException e) {
			return false;
		}

		return true;

	}

	public void updateData(int id, int position) throws IOException {

		StringBuffer sb = new StringBuffer();
		String from = null;
		String line = null;
		BufferedReader br = new BufferedReader(new FileReader(storage));
		String buf = "";
		while ((buf = br.readLine()) != null) {

			sb.append(buf).append("\r\n");

		}

		br.close();

		from = Function.getRecordById(storage, id);

		line = Function.getValueByPosition(from, position, separator);

		String values = HR.getInsertVal();

		buf = sb.toString().replaceFirst(line, values);
		BufferedWriter bwc = new BufferedWriter(new FileWriter(storage));
		bwc.write(buf);
		bwc.flush();
		bwc.close();

	}

	public static Employee getEmployeeByid(int id) throws IOException {

		Employee emp = null;

		String record = Function.getRecordById(storage, id);

		emp = new Employee(Function.getValueByPosition(record, 1, separator), Function.getValueByPosition(record, 2,
				separator), Double.valueOf(Function.getValueByPosition(record, 3, separator)));

		return emp;

	}

	public File getStorage() {
		return storage;
	}

}

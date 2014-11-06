package resourse;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import resourse.HR;

public class Function {

	private static BufferedReader br;

	public static String getLastRecord(File searchFile) throws IOException {
		br = new BufferedReader(new FileReader(searchFile));
		String current = null;
		String last = null;
		while ((current = br.readLine()) != null) {
			last = current;

		}
		br.close();
		return last;

	}

	public static String getValueByPosition(String res, int position, String sep) {

		String[] record = res.split(sep);

		return record[position];
	}

	public static int getLastId(File searchFile) throws IOException {

		int lastId = -1;
		if (searchFile.length() != 0) {

			String lRec = Function.getLastRecord(searchFile);

			lastId = Integer.valueOf(Function.getValueByPosition(lRec, 0, HR.getSeparator()));
		}
		return lastId;
	}

	public static String getRecordById(File searchFile, int id) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(searchFile));

		boolean foundFlag = false;

		String currRec = br.readLine();

		while (currRec != null) {

			int currId = Integer.valueOf(getValueByPosition(currRec, 0, HR.getSeparator()));

			if (currId == id) {
				foundFlag = true;
				break;
			}

			currRec = br.readLine();
		}

		br.close();

		if (!foundFlag) {
			System.out.println("Enter other ID");
		}

		return currRec;
	}
}

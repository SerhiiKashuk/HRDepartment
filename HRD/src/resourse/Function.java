package resourse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import java.util.ArrayList;
import java.util.Iterator;

import resourse.HR;

public class Function {
	
	private static BufferedReader br;
	
	
	public static  String getLastRecord(File searchFile) throws IOException {
		br = new BufferedReader(new FileReader(searchFile));
		String current = null;
		String last = null;
		while ((current = br.readLine()) != null) {
			last = current;

		}
		br.close();
		return last;

	}
	
	public static String getValueByPosition(String res,int position, String sep){
		
		String[]record = res.split(sep);
		
		return record[position];
	}
	
	public static int getLastId(File searchFile) throws IOException {

		int lastId = -1;
		if (searchFile.length() != 0) {

			String lRec = Function.getLastRecord(searchFile);
			
			lastId = Integer.valueOf(Function.getValueByPosition
					(lRec, 0, HR.getSeparator()));
		}
		return lastId;
	}
	
	public static String getRecordById(File searchFile, int id,String sep) throws IOException{
		
		String result = null;
		String current = null;
	
		br = new BufferedReader(new FileReader(searchFile));

		while ((current = br.readLine()) != null) {
			if(id == Integer.valueOf(Function.getValueByPosition(current, 0,sep))){
				result = current;
			}
			

		}
		br.close();
		
	
		return result;
	}
	public static String insertValue() {
		String result = null;
		
		return result;
	}

	
}



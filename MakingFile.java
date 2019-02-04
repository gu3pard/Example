package try3;

import java.io.File;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Random;

public class MakingFile {
	public static class MakingNewTextFile {
	private static final Object FirstName = null;
	private static final Object Otchestvo = null;
	private static final Object SecondName = null;
	private static final Object Data = null;
	private static final Object PhoneNumber = null;
	public static SimpleDateFormat format;
	Main list = new Main();

				public static void main (String[] args) {
			
			File myFile = new File("C:\\Users\\eparkhomenko\\JavaExamples\\info.txt");
			setFormat(new SimpleDateFormat("dd.MM.yyyy"));
			
			
			int  NOL = 0; //NumberOfLine
			while (NOL <= 2 + NOL++) {
			// вывод
			try {
				PrintWriter writer = new PrintWriter(new FileWriter(myFile));
				
				writer.write(String.format("%30s %20s %15s %11s %13s \r\n", SecondName, FirstName, Otchestvo, Data, PhoneNumber )); //переменные 
				
				
				writer.close();
				
						
			}catch (IOException ex) {
				ex.printStackTrace();
			} //вывод	
			}			
			
}

		public static SimpleDateFormat getFormat() {
			return format;
		}

		public static void setFormat(SimpleDateFormat format) {
			MakingNewTextFile.format = format;
		}
	}

	public class SecondName {
		public static final int SecondNameLength = 15;
		public String getRandomSecondName() {
		    String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    StringBuffer SecondName = new StringBuffer();
		    
		   
			for (int i = 0; i < SecondNameLength; i++) {
				SecondName.append(a.charAt(new Random().nextInt(a.length())));
		    }
		    return SecondName.toString();
		    
		}
		}


	public class PhoneNumber {

		public static final int PHONE_NUMBER_LENGTH = 10;
	    public String getRandomPhone() {
	        String s = "123456789";
	        StringBuffer phoneNumber = new StringBuffer();
	        
	        for (int i = 0; i < PHONE_NUMBER_LENGTH; i++) {
	            phoneNumber.append("8" + s.charAt(new Random().nextInt(s.length())));
	        }
	        return phoneNumber.toString();
	    }	
		
		
	}


	public class FIRST_NAME_LENGTH {
		
		
		
		public static final int FirstNameLength = 10;
			
			public String getRandomFirstName() {
		    String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    StringBuffer FirstName = new StringBuffer();
		    
		   
			for (int i = 0; i < FirstNameLength; i++) {
		        FirstName.append(a.charAt(new Random().nextInt(a.length())));
		    }
			
			
		    return FirstName.toString();
		     
		}
			
		}


public class Otchestvo {
public static final int OtchestvoLength = 15;
public String getRandomOtchestvo() {
    String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuffer Otchestvo = new StringBuffer();
    
   
	for (int i = 0; i < OtchestvoLength; i++) {
		Otchestvo.append(a.charAt(new Random().nextInt(a.length())));
    }
    return Otchestvo.toString();
    
}
}

public class Date {

	@SuppressWarnings("static-access")
	public Object DateOfBirth(String string, Object Data) {

        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1940, 2010);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return Data = DateOfBirth(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH), Data);

    }

    public int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	
	
}}

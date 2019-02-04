package try3;

import java.util.Random;


public class FIRST_NAME_LENGTH {
	
	
	
public static final int FirstNameLength = 10;
	
	@SuppressWarnings("null")
	public static String getRandomFirstName() {
    String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    StringBuffer FirstName = new StringBuffer();
    
   
	for (int i = 0; i < FirstNameLength; i++) {
        FirstName.append(a.charAt(new Random().nextInt(a.length())));
    }
	
	
    return FirstName.toString();
     
}
	
}
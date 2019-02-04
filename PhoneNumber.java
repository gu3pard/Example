package try3;

import java.util.Random;

public class PhoneNumber {

	public static final int PHONE_NUMBER_LENGTH = 10;
    public static String getRandomPhone() {
        String s = "123456789";
        StringBuffer phoneNumber = new StringBuffer();
        
        for (int i = 0; i < PHONE_NUMBER_LENGTH; i++) {
            phoneNumber.append("8" + s.charAt(new Random().nextInt(s.length())));
        }
        return phoneNumber.toString();
    }	
	
	
}

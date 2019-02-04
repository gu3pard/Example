package try3;


import java.util.Random;


public class Otchestvo {
public static final int OtchestvoLength = 15;
public static String getRandomOtchestvo() {
    String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuffer Otchestvo = new StringBuffer();
    
   
	for (int i = 0; i < OtchestvoLength; i++) {
		Otchestvo.append(a.charAt(new Random().nextInt(a.length())));
    }
    return Otchestvo.toString();
    
}
}
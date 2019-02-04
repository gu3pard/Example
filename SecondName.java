package try3;


import java.util.Random;


public class SecondName {
public static final int SecondNameLength = 15;
public static String getRandomSecondName() {
    String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuffer SecondName = new StringBuffer();
    
   
	for (int i = 0; i < SecondNameLength; i++) {
		SecondName.append(a.charAt(new Random().nextInt(a.length())));
    }
    return SecondName.toString();
    
}
}